# CS611 - Assignment 2

---

## Order&Chaos + Connect 4

Name: Huy Phan \
Email: hphan6@bu.edu \
BUID: U99944177

---

## Files
[//]: # (<A brief description of each file and what it does>)

- Abstract Classes:
   - ***Game.java***: Abstract class for any type of game if we want to implement more than a board game
   - ***BoardGame.java***: an abstract extension of Game and contains the basic methods for a board game 
   - ***Board.java***: an abstract class that contains the basic methods and attributes for a board
   - ***Player.java***: an abstract class that contains the basic methods and attributes for a player


- Extended Classes:
  - ***TTTBoard.java***: a class that extends Board and contains the methods, attributes, and logic for a TicTacToe board
  - ***OCBoard.java***: a class that extends Board and contains the methods, attributes, and logic for a Order&Chaos board
  - ***C4Board.java***: a class that extends Board and contains the methods, attributes, and logic for a Connect 4 board
  - ***TTTPlayer.java***: a class that extends Player and contains the methods and attributes for a TicTacToe player
  - ***OCPlayer.java***: a class that extends Player and contains the methods and attributes for a Order&Chaos player
  - ***C4Player.java***: a class that extends Player and contains the methods and attributes for a Connect 4 player
  - ***TTTBoardGame.java***: a class that extends BoardGame and contains the methods, attributes, and game logic to play the game TicTacToe
  - ***OCBoardGame.java***: a class that extends BoardGame and contains the methods, attributes, and game logic to play the game Order&Chaos
  - ***C4BoardGame.java***: a class that extends BoardGame and contains the methods, attributes, and game logic to play the game Connect 4


- Non-extended Classes:
   - ***Cell.java***: a class that contains the methods and attributes for a cell in a board
   - ***playAllGames.java***: a class that contains the method to run the program to play all games


- Main Classes:
  - ***Main.java***: a class that contains the main method to run the program


- MISC Files:
  - ***README.md***: a file that contains the instructions to run the program
  - ***ps2UML.png***: a file that contains the UML diagram for the program
  - ***ps2UML.md***: a file explaining the UML diagram and scalability of the program
---

## Notes

n/a

---

## How to compile and run
1. Navigate to the directory "pa2" after unzipping the files
2. Run the following instructions:
3. Open up the terminal and type in the following commands:
   1. ```javac ./*.java ``` 
   2. ```java Main.java```
   

---

## Input/Output Example

