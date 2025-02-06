import pygame
import random
from abc import ABC, abstractmethod
from enum import Enum

pygame.init()

class Direction(Enum):
        LEFT = 0
        RIGHT = 1

class Status(Enum):
        COMPLETE = 0
        INCOMPLETE = 1

class ButtonType(Enum):
        CLOSE_MENU = 0
        EXIT_GAME = 1
        OPEN_MENU = 2
        RESET_GAME = 3

class Platform_type(Enum):
        MOVING = 0
        STILL = 1

class Item_type(Enum):
        ABILITY = 0
        SCORE = 1

class Enemy_type(Enum):
        ACTIVE = 0
        PASSIVE = 1

class Array2D:
    def __init__(self, x, y):
        self.x = x
        self.y = y

class Image:
    def __init__(self, path):
        self.path = path

class Lives:
    def __init__(self, amount):
        self.amount = amount

class Score:
    def __init__(self, amount):
        self.amount = amount

SCREEN_WIDTH = 800
SCREEN_HEIGHT = 600
FPS = 60
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
RED = (255, 0, 0)
GREEN = (0, 255, 0)
BLUE = (0, 0, 255)
YELLOW = (255, 255, 0)
PURPLE = (128, 0, 128)
height = 600
width = 1600
screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
clock = pygame.time.Clock()
score = Score(10)
lives = Lives(10)
friction = 10
gravity = 980

win_width = 1600
win_height = 600
status = Status.INCOMPLETE

powered_up = False
powered_time = 0
jump_speed = 10
on_ground = False

class Size:
    def __init__(self, width, height):
        self.width = width
        self.height = height

class Player:
    def __init__(self, direction, speed, size, position):
        self.direction = direction
        self.speed = speed
        self.size = size
        self.powered_up = False
        self.powered_time = 0
        self.jump_speed = 0
        self.on_ground = False
        self.position = position
        self.sprite = pygame.image.load("character.png")  # Replace with actual sprite path
        self.sprite = pygame.transform.scale(self.sprite, (self.size, self.size))
        self.sprite = pygame.transform.flip(self.sprite, True, False)
        self.rect = pygame.Rect(position.x, position.y, size, size)

    def updatePosition(self, dt):
        keys = pygame.key.get_pressed()
        
        # Horizontal movement
        self.speed = 0
        if keys[pygame.K_LEFT]:
            self.speed = -200
            self.direction = Direction.LEFT
        if keys[pygame.K_RIGHT]:
            self.speed = 200
            self.direction = Direction.RIGHT

        # Update position
        self.position.x += self.speed * dt
        self.position.y += self.jump_speed * dt if not self.on_ground else 0

        # Update rect position
        self.rect.midbottom = (self.position.x, self.position.y)

        # Handle power-up
        if self.powered_up:
            self.power_time -= dt
            if self.power_time <= 0:
                self.powered_up = False
                
        if self.on_ground:
            self.sprite = pygame.image.load("character.png")
            self.sprite = pygame.transform.scale(self.sprite, (self.size, self.size))
            if self.direction == Direction.RIGHT:
                self.sprite = pygame.transform.flip(self.sprite, True, False)

    def draw(self, screen, camera_x):
        screen.blit(self.sprite, (self.rect.x - camera_x, self.rect.y))
    def jump(self):
        self.jump_speed = -500
        self.on_ground = False
    def performAction(self):
        pass

class Enemy:
    def __init__(self, position, direction, size: Size, type: Enemy_type):
        self.direction = direction
        self.speed = random.randint(50, 150)
        self.size = size
        self.type = type
        self.position = position
        self.sprite = pygame.image.load("enemy.png")
        self.sprite = pygame.transform.scale(self.sprite, (self.size.width, self.size.height))
        self.rect = pygame.Rect(position.x, position.y, size.width, size.height)

    def updatePosition(self, dt):
        self.position.x += self.speed * dt
        if self.position.x > width or self.position.x < 0:
            self.speed = -self.speed
        self.rect.x = self.position.x
        self.rect.y = self.position.y
    def draw(self, screen, camera_x):
        screen.blit(self.sprite, (self.rect.x - camera_x, self.rect.y))

class Platform:
    def __init__(self, position: Array2D, size: Size, type: Platform_type):
        self.direction = None
        self.speed = 50
        self.size = size
        self.type = type
        self.position = position
        self.sprite = None
        self.rect = pygame.Rect(position.x, position.y, size.width, size.height)

    def updatePosition(self, dt):
        pass
    def draw(self, screen, camera_x):
        pygame.draw.rect(screen, GREEN, pygame.Rect(self.rect.x - camera_x, self.rect.y, self.rect.width, self.rect.height))

class Item:
    def __init__(self, position, direction, speed, size: Size, type, value,  sprite):
        self.direction = direction
        self.speed = speed
        self.size = size
        self.type = type
        self.value = value
        self.position = position
        self.sprite = pygame.image.load("banana.png")
        self.sprite = pygame.transform.scale(self.sprite, (self.size.width, self.size.height))
        self.rect = pygame.Rect(position.x, position.y, size.width, size.height)

    def updatePosition(self, dt):
        pass
    def draw(self, screen, camera_x):
        screen.blit(self.sprite, (self.rect.x - camera_x, self.rect.y))        
    def applyEffect(self, level, game):
        if self.type == Item_type.SCORE:
            game.score.amount += self.value
        elif self.type == Item_type.ABILITY:
            level.player.powered_up = True
            level.player.power_time = 10  # 10 seconds

class Button:
    def __init__(self, label, action: ButtonType, x, y, width, height):
        self.label = label
        self.action = action
        self.rect = pygame.Rect(x, y, width, height)

    def performAction(self, game):
        if self.action == ButtonType.RESET_GAME:
            game.resetGame()
        elif self.action == ButtonType.EXIT_GAME:
            game.endGame()
        elif self.action == ButtonType.OPEN_MENU:
            game.ui.menu_open = True
        elif self.action == ButtonType.CLOSE_MENU:
            game.ui.menu_open = False

        def draw(self, screen):
            pygame.draw.rect(screen, GREEN, self.rect)
            font = pygame.font.Font(None, 24)
            text = font.render(self.label, True, WHITE)
            text_rect = text.get_rect(center=self.rect.center)
            screen.blit(text, text_rect)

    def draw(self, screen):
        pygame.draw.rect(screen, GREEN, self.rect)
        font = pygame.font.Font(None, 24)
        text = font.render(self.label, True, WHITE)
        text_rect = text.get_rect(center=self.rect.center)
        screen.blit(text, text_rect)

class UI:
    def __init__(self, game):
        self.game = game
        self.menu_open = False
        self.button = [
            Button("Reset", ButtonType.RESET_GAME, SCREEN_WIDTH // 2 - 40, SCREEN_HEIGHT // 2 - 20, 80, 30),
            Button("Exit", ButtonType.EXIT_GAME, SCREEN_WIDTH // 2 - 40, SCREEN_HEIGHT // 2 + 20, 80, 30),
            Button("Menu", ButtonType.OPEN_MENU, 10, SCREEN_HEIGHT - 40, 80, 30),
            Button("Close", ButtonType.CLOSE_MENU, SCREEN_WIDTH // 2 - 40, SCREEN_HEIGHT // 2 + 60, 80, 30)
        ]
        self.livesCount = None


    def draw(self, screen):
        font = pygame.font.Font(None, 36)
        score_text = font.render(f"Score: {self.game.score.amount}", True, WHITE)
        lives_text = font.render(f"Lives: {self.livesCount.amount}", True, WHITE)
        level_text = font.render(f"Level: {self.game.currentLevelCounter + 1}", True, WHITE)
        screen.blit(score_text, (10, 10))
        screen.blit(lives_text, (SCREEN_WIDTH - 100, 10))
        screen.blit(level_text, (SCREEN_WIDTH // 2 - 50, 10))

        if self.menu_open:
            menu_surface = pygame.Surface((300, 200))
            menu_surface.fill(WHITE)
            menu_rect = menu_surface.get_rect(center=(SCREEN_WIDTH // 2, SCREEN_HEIGHT // 2))
            screen.blit(menu_surface, menu_rect)

            font = pygame.font.Font(None, 36)
            title_text = font.render("Menu", True, BLACK)
            screen.blit(title_text, (menu_rect.centerx - title_text.get_width() // 2, menu_rect.top + 20))

            # Draw the "Reset", "Exit", and "Close" buttons inside the menu
            self.button[0].draw(screen)
            self.button[1].draw(screen)
            self.button[3].draw(screen)
        else:
            self.button[2].draw(screen)  # Draw the "Menu" button when the menu is closed

    def handle_click(self, pos):
        if self.menu_open:
            # Check clicks for the "Reset", "Exit", and "Close" buttons when the menu is open
            for button in self.button[:2] + [self.button[3]]:
                if button.rect.collidepoint(pos):
                    button.performAction(self.game)
        else:
            # Check click for the "Menu" button when the menu is closed
            if self.button[2].rect.collidepoint(pos):
                self.button[2].performAction(self.game)

class Level:
    def __init__(self, width, height):
        self.width = width
        self.height = height
        self.status = Status.INCOMPLETE
        self.entities = []
        self.background = pygame.image.load("background.png")  # Replace with actual background image
        self.background = pygame.transform.scale(self.background, (self.width, self.height))  # Scale the background image
        self.winCoordinate = Array2D(win_width - 40, win_height - 20)
        self.camera_x = 0

    def add_entity(self, entity):
        self.entities.append(entity)

    def update(self, dt):
        for entity in self.entities:
            entity.updatePosition(dt)
        self.player.updatePosition(dt)

        # Update camera position
        self.camera_x = max(0, min(self.player.position.x - SCREEN_WIDTH // 2, width - SCREEN_WIDTH))

        # Check if player has reached the win coordinate
        if self.player.rect.collidepoint(self.winCoordinate.x, self.winCoordinate.y):
            self.status = Status.COMPLETE
    def draw(self, screen):
        screen.blit(self.background, (0, 0))
        
        for entity in self.entities:
            entity.draw(screen, self.camera_x)
        self.player.draw(screen, self.camera_x)

        # Draw finish point
        pygame.draw.rect(screen, BLUE, pygame.Rect(self.winCoordinate.x - self.camera_x, self.winCoordinate.y, 40, 40))


class Game:
    def __init__(self):
        self.currentLevelCounter = 0
        self.lives = lives
        self.friction = 0.1
        self.gravity = 980
        self.screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
        pygame.display.set_caption("Platformer Game")
        self.clock = pygame.time.Clock()
        self.ui = UI(self)
        self.score = Score(0)
        self.running = True
        
        self.resetGame()

    def startGame(self):
        while self.running:
            dt = self.clock.tick(FPS) / 1000.0  # Convert to seconds
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    self.endGame()
                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_SPACE:
                        self.level.player.jump()
                if event.type == pygame.MOUSEBUTTONDOWN:
                    self.ui.handle_click(event.pos)

            self.update(dt)
            self.level.draw(self.screen)
            self.ui.draw(self.screen)
            pygame.display.flip()
    def resetGame(self):
        self.currentLevelCounter = 0
        self.lives = lives
        self.loadLevel()
    def endGame(self):
        self.running = False
    def loadLevel(self):
        self.level = Level(width, SCREEN_HEIGHT)
        self.level.player = Player(SCREEN_WIDTH // 2, SCREEN_HEIGHT // 2, 50, Array2D(SCREEN_WIDTH // 2, SCREEN_HEIGHT // 2))

        # Add platforms
        self.level.add_entity(Platform(Array2D(0, SCREEN_HEIGHT - 20), Size(width, 20), Platform_type.STILL))
        for _ in range(5):
            self.level.add_entity(Platform(Array2D(random.randint(0, width-100), 
                                           random.randint(100, SCREEN_HEIGHT-100)),
                                           Size(100, 20), Platform_type.STILL))
            
        for _ in range(3):
            self.level.add_entity(Platform(Array2D(random.randint(0, width-100), 
                                           random.randint(100, SCREEN_HEIGHT-100)),
                                           Size(100, 20), Platform_type.MOVING))

        # Add enemies
        for _ in range(3):
            self.level.add_entity(Enemy(Array2D(random.randint(0, width-30), 
                                           random.randint(100, SCREEN_HEIGHT-30)),
                                           1, Size(40, 40),
                                        Enemy_type.ACTIVE))

        # Add items self, position, direction, speed, size, type, value,  sprite
        for _ in range(5):
            self.level.add_entity(Item(Array2D(random.randint(0, width-20), 
                                           random.randint(100, SCREEN_HEIGHT-20)),
                                           1, 0, Size(20, 20),
                                       Item_type.SCORE, 10, None))
        self.level.add_entity(Item(Array2D(random.randint(0, width-20), 
                                           random.randint(100, SCREEN_HEIGHT-20)),
                                           1, 0, Size(20, 20),
                                       Item_type.ABILITY, 10, None))

        self.ui.livesCount = self.lives
        self.ui.scoreCount = self.score
    def update(self, dt):
        self.level.update(dt)
        
        # Apply gravity
        if not self.level.player.on_ground:
            self.level.player.jump_speed += self.gravity * dt

        # Check collisions
        self.level.player.on_ground = False
        for entity in self.level.entities:
            if isinstance(entity, Platform):
                if self.level.player.rect.colliderect(entity.rect):
                    if self.level.player.jump_speed >= 0 and self.level.player.rect.bottom > entity.rect.top:
                        self.level.player.rect.bottom = entity.rect.top
                        self.level.player.jump_speed = 0
                        self.level.player.on_ground = True
                        self.level.player.position.y = self.level.player.rect.bottom
                    if entity.type == Platform_type.MOVING:
                        self.level.player.position.x += entity.speed * dt
            elif isinstance(entity, Item) and self.level.player.rect.colliderect(entity.rect):
                entity.applyEffect(self.level, self)
                self.level.entities.remove(entity)
            elif isinstance(entity, Enemy) and self.level.player.rect.colliderect(entity.rect):
                if self.level.player.powered_up:
                    self.level.entity.remove(entity)
                    self.level.score.amount += 50
                else:
                    self.lives.amount -= 1
                    if self.lives.amount <= 0:
                        self.resetGame()
                    else:
                        self.level.player.position = Array2D(SCREEN_WIDTH // 2, SCREEN_HEIGHT // 2)

        # Check if level is complete
        if self.level.status == Status.COMPLETE:
            self.currentLevelCounter += 1
            self.loadLevel()



def main():
    game = Game()
    game.startGame()

if __name__ == "__main__":
    main()
