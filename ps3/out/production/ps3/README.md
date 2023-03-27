# CS611 - Assignment 3

## Monsters and Heroes

Name: Huy Phan <br/>
Email: hphan6@bu.edu <br/>
BUID: U99944177

## Files

- Abstract Classes
  - ***Game.java***: Abstract class for any type of game if we want to implement more than a board game
  - ***BoardGame.java***: an abstract extension of Game and contains the basic methods for a board game
  - ***Board.java***: an abstract class that contains the basic methods and attributes for a board


- Concrete Classes
   - ***Armor.java***: a class that represents an armor item
   - ***BattleGround.java***: a class that represents the battleground and its logic
   - ***Cell.java***: a class that represents a cell on the board
   - ***Controller.java***: a class that represents the controller of the game and allows the user to interact with the board
   - ***Dragon.java***: a class that represents a dragon monster
   - ***Exoskeleton.java***: a class that represents an exoskeleton monster
   - ***FireSpell.java***: a class that represents a fire spell item
   - ***Hero.java***: a class that represents a hero and its subtypes
   - ***IceSpell.java***: a class that represents an ice spell item
   - ***Inventory.java***: a class that represents the inventory of a hero
   - ***Item.java***: a class that represents an item 
   - ***LightningSpell.java***: a class that represents a lightning spell item
   - ***Market.java***: a class that represents the market of the game along with buying and selling logic
   - ***MHBoard.java***: a child class of Board that represents the Monsters and Heroes Board
   - ***MHBoardGame.java***: a child class of BoardGame that represents the Monsters and Heroes board game along with its rules and logic 
   - ***Monster.java***: a class that represents a monster and its subtypes
   - ***Paladin.java***: a subclass of hero that represents a paladin hero
   - ***Potion.java***: a class that represents a potion item
   - ***Sorcerer.java***: a subclass of hero that represents a sorcerer hero
   - ***Spell.java***: a class that represents a spell item
   - ***Spirit.java***: a class that represents a spirit monster
   - ***Warrior.java***: a subclass of hero that represents a warrior hero
   - ***Weapon.java***: a class that represents a weapon item


- Interfaces
   - ***Attackable.java***: an interface that specifies the methods for an attackable object


- MISC Classes
   - ***ArtMessages.java***: a class that contains all the ASCII art messages for the game
   - ***ColoredText.java***: a class that contains all the ANSI escape codes for colored text used for colored printing in terminal


- MISC Files
   - ***GameCenter.java***: a class that contains the main method to run the program and initializes the game
  - ***Main.java***: the main class that runs the program
  - ***README.md***: this file

## Notes

SQUARE GRID COORDINATES: (ROW, COLUMN) <br/>

Monsters & Heroes (DEFAULT 8x8):
```
(0,0) (0,1) (0,2) (0,3) (0,4) (0,5) (0,6) (0,7)
(1,0) (1,1) (1,2) (1,3) (1,4) (1,5) (1,6) (1,7)
(2,0) (2,1) (2,2) (2,3) (2,4) (2,5) (2,6) (2,7)
(3,0) (3,1) (3,2) (3,3) (3,4) (3,5) (3,6) (3,7)
(4,0) (4,1) (4,2) (4,3) (4,4) (4,5) (4,6) (4,7)
(5,0) (5,1) (5,2) (5,3) (5,4) (5,5) (5,6) (5,7)
(6,0) (6,1) (6,2) (6,3) (6,4) (6,5) (6,6) (6,7)
(7,0) (7,1) (7,2) (7,3) (7,4) (7,5) (7,6) (7,7)
```

MOVE DIRECTIONS: <br/>
```
W: UP = ROW+1 -> (GOES DOWN THE GRID)
A: LEFT 
S: DOWN = ROW-1 -> (GOES UP THE GRID)
D: RIGHT 
```

## How to compile and run

1. After downloading all the files
2. Run the following commands:
    1. ```javac ./*.java ```
    2. ```java Main.java```
3. The first command will compile all the java files
4. The second command will run the program

## Input/Output Example

<Place here an example of how the program runs. Include both its
outputs and correctly formatted inputs. Please clearly mark the inputs.>
e.g.:
