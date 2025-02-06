import pygame
import random
from abc import ABC, abstractmethod
from enum import Enum

SCREEN_WIDTH = 800
SCREEN_HEIGHT = 600
FPS = 60
height = 600
width = 1600
screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
clock = pygame.time.Clock()
score = Score(100)
lives = Lives(10)
friction = 5
gravity = 490

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

class Platform(Enum):
        MOVING = 0
        STILL = 1

class Item_type(Enum):
        ABILITY = 0
        SCORE = 1

class Enemy_type(Enum):
        ACTIVE = 0
        PASSIVE = 1




class Game:
    def __init__(self, currentLevelCounter, friction, gravity, screen, clock, running, levels, ui, lives, score):
        self.currentLevelCounter = currentLevelCounter
        self.friction = friction
        self.gravity = gravity
        self.screen = screen
        self.clock = clock
        self.running = running
        self.levels = levels
        self.ui = ui
        self.lives = lives
        self.score = score

    def startGame(self):
        pass
    def resetGame(self):
        pass
    def endGame(self):
        pass
    def loadLevel(self):
        pass
    def update(self):
        pass



width = 2000
height = 200
status = INCOMPLETE

class Level:
    def __init__(self, width, height, status, entities, background, winCoordinate):
        self.width = width
        self.height = height
        self.status = status
        self.entities = entities
        self.background = background
        self.winCoordinate = winCoordinate

    def update(self):
        pass
    def draw(self):
        pass



powered_up = false
powered_time = 0
jump_speed = 0
on_ground = false

class Player:
    def __init__(self, direction, speed, size, powered_up, powered_time, jump_speed, on_ground, position, sprite):
        self.direction = direction
        self.speed = speed
        self.size = size
        self.powered_up = powered_up
        self.powered_time = powered_time
        self.jump_speed = jump_speed
        self.on_ground = on_ground
        self.position = position
        self.sprite = sprite

    def updatePosition(self):
        pass
    def draw(self):
        pass
    def jump(self):
        pass
    def performAction(self):
        pass




class Array2D:
    def __init__(self, x, y):
        self.x = x
        self.y = y





class Image:
    def __init__(self, path):
        self.path = path





class Platform:
    def __init__(self, direction, speed, size, type, position, sprite):
        self.direction = direction
        self.speed = speed
        self.size = size
        self.type = type
        self.position = position
        self.sprite = sprite

    def updatePosition(self):
        pass
    def draw(self):
        pass




class Item:
    def __init__(self, direction, speed, size, type, value, position, sprite):
        self.direction = direction
        self.speed = speed
        self.size = size
        self.type = type
        self.value = value
        self.position = position
        self.sprite = sprite

    def updatePosition(self):
        pass
    def draw(self):
        pass
    def applyEffect(self):
        pass




class Enemy:
    def __init__(self, direction, speed, size, type, position, sprite):
        self.direction = direction
        self.speed = speed
        self.size = size
        self.type = type
        self.position = position
        self.sprite = sprite

    def updatePosition(self):
        pass
    def draw(self):
        pass




class UI:
    def __init__(self, menu_open, button, livesCount, scoreCount):
        self.menu_open = menu_open
        self.button = button
        self.livesCount = livesCount
        self.scoreCount = scoreCount

    def draw(self):
        pass
    def handle_click(self):
        pass




class Button:
    def __init__(self, label, action):
        self.label = label
        self.action = action

    def performAction(self):
        pass




class Lives:
    def __init__(self, amount):
        self.amount = amount





class Score:
    def __init__(self, amount):
        self.amount = amount


def main():
    game = Game()
    game.startGame()

if __name__ == "__main__":
    main()
