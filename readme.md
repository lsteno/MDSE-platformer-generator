# Pygame Generator

This project is a Pygame generator based on Model-Driven Engineering (MDE) principles. It leverages Eclipse Acceleo to transform a platformer game model into executable Python code using the Pygame library.

## Overview

The generator takes a high-level model of a platformer game, defined using an Ecore metamodel, and automatically generates the corresponding Pygame code. This approach allows developers to focus on designing the game's logic and structure using a visual model, rather than writing code manually.

## Workspace Structure

The workspace contains the following main directories:

-   `Game/`: Contains the generated Pygame code, including:
    -   `game_executable.py`: The main executable game file.
    -   `game_skeleton.py`: The generated skeleton code.
-   `org.eclipse.acceleo.game.generator/`: Contains the Acceleo generator project.
    -   `src/`: Contains the Acceleo templates that perform the model-to-text transformation.
    -   `model/`: Contains example Python models (`.python.xmi`).
-   `Platformer/`: Contains the Ecore metamodel definition for the platformer game.
    -   `model/`: Contains the `.ecore` and `.genmodel` files defining the metamodel.
    -   `src-gen/`: Contains the generated Java code from the Ecore model.
-   `Transform/`: Contains transformation definitions (ATL transformations).

## Key Components

### 1. Platformer Metamodel

The `Platformer` project defines the metamodel for representing platformer games. This metamodel includes concepts such as:

-   [`Game`](Platformer/src-gen/platformer/Game.java): Represents the overall game structure, including levels, UI, and game state.
-   [`Level`](Platformer/src-gen/platformer/Level.java): Represents a game level with entities, background, and win conditions.
-   [`Entity`](Platformer/src-gen/platformer/Entity.java): Represents a game entity with position, size, and sprite.
-   [`Player`](Platformer/src-gen/platformer/Player.java): Represents the player character with attributes like `powered_up`, `jump_speed`, and `on_ground`.
-   [`UI`](Platformer/src-gen/platformer/UI.java): Represents the user interface elements, including buttons, lives count, and score.
-   [`Button`](Platformer/src-gen/platformer/Button.java): Represents a button in the UI with a label and action.
-   [`Score`](Platformer/src-gen/platformer/Score.java): Represents the player's score with an `amount`.
-   [`Image`](Platformer/src-gen/platformer/Image.java): Represents an image with a `path`.
-   Enums: [`Direction`](Platformer/src-gen/platformer/PlatformerPackage.java), [`Status`](Platformer/src-gen/platformer/PlatformerPackage.java), [`ButtonType`](Platformer/src-gen/platformer/PlatformerPackage.java), [`PlatformType`](Platformer/src-gen/platformer/PlatformerPackage.java), [`ItemType`](Platformer/src-gen/platformer/PlatformerPackage.java), [`EnemyType`](Platformer/src-gen/platformer/PlatformerPackage.java)

The metamodel is defined in [Platformer/model/platformer.ecore](Platformer/model/platformer.ecore) and [Platformer/model/platformer.genmodel](Platformer/model/platformer.genmodel).

### 2. Acceleo Generator

The `org.eclipse.acceleo.game.generator` project contains the Acceleo templates that transform the platformer game model into Pygame code. The main template is located in [org.eclipse.acceleo.game.generator/src/org/eclipse/acceleo/game/generator/common/generate.mtl](org.eclipse.acceleo.game.generator/src/org/eclipse/acceleo/game/generator/common/generate.mtl).

Key templates include:

-   `generateElement`: The main template that orchestrates the generation process.
-   `classDefinition`: Generates Python class definitions from the model classes.
-   `enumDefinition`: Generates Python enum definitions from the model enums.
-   `methodDefinition`: Generates Python method definitions from the model operations.
-   `assignmentDefinition`: Generates Python assignment statements from the model assignments.
-   `expressionStatement`: Generates Python expression statements.

### 3. Generated Pygame Code

The `Game` project contains the generated Pygame code. The `game_executable.py` file contains the main game loop and logic, while `game_skeleton.py` provides the basic structure and class definitions.

## MDE Concepts

This project demonstrates several key MDE concepts:

-   **Metamodeling**: Defining a formal model for platformer games using Ecore.
-   **Model-to-Text Transformation**: Using Acceleo to transform the game model into executable code.
-   **Code Generation**: Automatically generating Pygame code from the model, reducing manual coding effort.

## Usage

1.  **Define a Platformer Game Model**: Create an instance of the platformer metamodel, representing your game's structure and logic.
2.  **Run the Acceleo Transformation**: Execute the Acceleo generator on your game model to produce the Pygame code.
3.  **Execute the Generated Code**: Run the generated `game_executable.py` file using Python and Pygame.

## Game Executable Details

The `game_executable.py` includes:

-   Initialization of Pygame and game constants (screen dimensions, FPS, colors).
-   Definitions for enums such as [`Direction`](Game/game_executable.py), [`Status`](Game/game_executable.py), [`ButtonType`](Game/game_executable.py), [`Platform_type`](Game/game_executable.py), [`Item_type`](Game/game_executable.py), and [`Enemy_type`](Game/game_executable.py).
-   Class definitions for game elements like [`Size`](Game/game_executable.py), [`Player`](Game/game_executable.py), [`Enemy`](Game/game_executable.py), [`Platform`](Game/game_executable.py), [`Item`](Game/game_executable.py), [`Button`](Game/game_executable.py), [`UI`](Game/game_executable.py), [`Level`](Game/game_executable.py), and [`Game`](Game/game_executable.py).
-   Game logic for updating positions, drawing elements, and handling user input.

## Example

```python
# Example of how items apply effects in game_executable.py
class Item:
    def applyEffect(self, level, game):
        if self.type == Item_type.SCORE:
            game.score.amount += self.value
        elif self.type == Item_type.ABILITY:
            level.player.powered_up = True
            level.player.power_time = 10  # 10 seconds
