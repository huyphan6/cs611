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

GRID COORDINATES: (ROW, COLUMN)

```
3x3 Board (TTT):
(0,0) (0,1) (0,2)
(1,0) (1,1) (1,2)
(2,0) (2,1) (2,2)
```

```
6x6 Board (ORDER&CHAOS):
(0,0) (0,1) (0,2) (0,3) (0,4) (0,5)
(1,0) (1,1) (1,2) (1,3) (1,4) (1,5)
(2,0) (2,1) (2,2) (2,3) (2,4) (2,5)
(3,0) (3,1) (3,2) (3,3) (3,4) (3,5)
(4,0) (4,1) (4,2) (4,3) (4,4) (4,5)
(5,0) (5,1) (5,2) (5,3) (5,4) (5,5)
```

```
6x7 Board (CONNECT 4): 
(0,0) (0,1) (0,2) (0,3) (0,4) (0,5) (0,6)
(1,0) (1,1) (1,2) (1,3) (1,4) (1,5) (1,6)
(2,0) (2,1) (2,2) (2,3) (2,4) (2,5) (2,6)
(3,0) (3,1) (3,2) (3,3) (3,4) (3,5) (3,6)
(4,0) (4,1) (4,2) (4,3) (4,4) (4,5) (4,6)
(5,0) (5,1) (5,2) (5,3) (5,4) (5,5) (5,6)
```

---

## How to compile and run
1. Navigate to the directory "pa2" after unzipping the files
2. Run the following instructions:
3. Open up the terminal and type in the following commands:
   1. ```javac ./*.java ``` 
   2. ```java Main.java```
   

---

## Input/Output Example

```
Hello! What Game Would You Like To Play?
1. Tic Tac Toe
2. Order and Chaos
3. Connect Four
   1
   Let's play Tic Tac Toe!
   Initializing the board...
   Please enter the size for the square board:
   3
   ————————————
   | ? | ? | ? |
   ————————————
   | ? | ? | ? |
   ————————————
   | ? | ? | ? |
   ————————————

Initializing the players...
How many players are playing?

2
Player 1 what is your name?

Huy
Would you like to be X or O?

X
Player 2 what is your name?

Jennifer
Player 1: Huy has won 0 times.
Player 2: Jennifer has won 0 times.
There have been 0 ties.
It is Huy's turn.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
0
————————————
| X | ? | ? |
————————————
| ? | ? | ? |
————————————
| ? | ? | ? |
————————————

It is Jennifer's turn.
Please enter the row of the cell you would like to place your checker in:

2
Please enter the column of the cell you would like to place your checker in:
2
————————————
| X | ? | ? |
————————————
| ? | ? | ? |
————————————
| ? | ? | O |
————————————

It is Huy's turn.
Please enter the row of the cell you would like to place your checker in:

1
Please enter the column of the cell you would like to place your checker in:
1
————————————
| X | ? | ? |
————————————
| ? | X | ? |
————————————
| ? | ? | O |
————————————

It is Jennifer's turn.
Please enter the row of the cell you would like to place your checker in:

1
Please enter the column of the cell you would like to place your checker in:
2
————————————
| X | ? | ? |
————————————
| ? | X | O |
————————————
| ? | ? | O |
————————————

It is Huy's turn.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
2
————————————
| X | ? | X |
————————————
| ? | X | O |
————————————
| ? | ? | O |
————————————

It is Jennifer's turn.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
2
This cell is already occupied. Please try again.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
1
————————————
| X | O | X |
————————————
| ? | X | O |
————————————
| ? | ? | O |
————————————

It is Huy's turn.
Please enter the row of the cell you would like to place your checker in:

2
Please enter the column of the cell you would like to place your checker in:
0
————————————
| X | O | X |
————————————
| ? | X | O |
————————————
| X | ? | O |
————————————

Congratulations Huy! You won!
Would you like to play again? Y/N
Y
Player 1: Huy has won 1 times.
Player 2: Jennifer has won 0 times.
There have been 0 ties.
It is Huy's turn.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
0
————————————
| X | ? | ? |
————————————
| ? | ? | ? |
————————————
| ? | ? | ? |
————————————

It is Jennifer's turn.
Please enter the row of the cell you would like to place your checker in:

2
Please enter the column of the cell you would like to place your checker in:
0
————————————
| X | ? | ? |
————————————
| ? | ? | ? |
————————————
| O | ? | ? |
————————————

It is Huy's turn.
Please enter the row of the cell you would like to place your checker in:

1
Please enter the column of the cell you would like to place your checker in:
1
————————————
| X | ? | ? |
————————————
| ? | X | ? |
————————————
| O | ? | ? |
————————————

It is Jennifer's turn.
Please enter the row of the cell you would like to place your checker in:

2
Please enter the column of the cell you would like to place your checker in:
2
————————————
| X | ? | ? |
————————————
| ? | X | ? |
————————————
| O | ? | O |
————————————

It is Huy's turn.
Please enter the row of the cell you would like to place your checker in:

2
Please enter the column of the cell you would like to place your checker in:
1
————————————
| X | ? | ? |
————————————
| ? | X | ? |
————————————
| O | X | O |
————————————

It is Jennifer's turn.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
1
————————————
| X | O | ? |
————————————
| ? | X | ? |
————————————
| O | X | O |
————————————

It is Huy's turn.
Please enter the row of the cell you would like to place your checker in:

1
Please enter the column of the cell you would like to place your checker in:
0
————————————
| X | O | ? |
————————————
| X | X | ? |
————————————
| O | X | O |
————————————

It is Jennifer's turn.
Please enter the row of the cell you would like to place your checker in:

1
Please enter the column of the cell you would like to place your checker in:
2
————————————
| X | O | ? |
————————————
| X | X | O |
————————————
| O | X | O |
————————————

It is Huy's turn.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
1
This cell is already occupied. Please try again.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
2
————————————
| X | O | X |
————————————
| X | X | O |
————————————
| O | X | O |
————————————

It's a tie!
Would you like to play again? Y/N
N
Thanks for playing Tic Tac Toe!
Player 1: Huy has won 1 times.
Player 2: Jennifer has won 0 times.
There have been 1 ties.
Would you like to play a different game? Y/N
Y
Hello! What Game Would You Like To Play?
1. Tic Tac Toe
2. Order and Chaos
3. Connect Four
   3
   Let's play Connect Four!

Initializing the board...
How many rows would you like the board to have?

6
How many columns would you like the board to have?

7
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————

Initializing the players...
How many players are playing?

2
Player 1 what is your name?

Huy
Would you like play as X or O?

X
Player 2 what is your name?

Jennifer
Player 1: Huy has won 0 times.
Player 2: Jennifer has won 0 times.
There have been 0 ties.
It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
0
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | ? | ? | ? | ? | ? |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
4
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | ? | ? | O | ? | ? |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
0
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | ? | ? | O | ? | ? |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
2
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | O | ? | O | ? | ? |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
0
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | O | ? | O | ? | ? |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
0
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| O | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | O | ? | O | ? | ? |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
2
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| O | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | X | ? | ? | ? | ? |
————————————————————————————
| X | ? | O | ? | O | ? | ? |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
3
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| O | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | X | ? | ? | ? | ? |
————————————————————————————
| X | ? | O | O | O | ? | ? |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
1
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| O | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | X | ? | ? | ? | ? |
————————————————————————————
| X | X | O | O | O | ? | ? |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
5
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| O | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | ? | ? | ? | ? | ? |
————————————————————————————
| X | ? | X | ? | ? | ? | ? |
————————————————————————————
| X | X | O | O | O | O | ? |
————————————————————————————

Horizontal win
Congratulations Jennifer! You won!
Would you like to continue playing? Y/N

Y
Player 1: Huy has won 0 times.
Player 2: Jennifer has won 1 times.
There have been 0 ties.
It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
4
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | X | ? | ? |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
2
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | O | ? | X | ? | ? |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
3
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | O | X | X | ? | ? |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
3
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | O | ? | ? | ? |
————————————————————————————
| ? | ? | O | X | X | ? | ? |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
2
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | X | O | ? | ? | ? |
————————————————————————————
| ? | ? | O | X | X | ? | ? |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
5
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | X | O | ? | ? | ? |
————————————————————————————
| ? | ? | O | X | X | O | ? |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
6
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | X | O | ? | ? | ? |
————————————————————————————
| ? | ? | O | X | X | O | X |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
4
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | X | O | O | ? | ? |
————————————————————————————
| ? | ? | O | X | X | O | X |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
4
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | X | ? | ? |
————————————————————————————
| ? | ? | X | O | O | ? | ? |
————————————————————————————
| ? | ? | O | X | X | O | X |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
2
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | O | ? | X | ? | ? |
————————————————————————————
| ? | ? | X | O | O | ? | ? |
————————————————————————————
| ? | ? | O | X | X | O | X |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
5
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | O | ? | X | ? | ? |
————————————————————————————
| ? | ? | X | O | O | X | ? |
————————————————————————————
| ? | ? | O | X | X | O | X |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
1
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | O | ? | X | ? | ? |
————————————————————————————
| ? | ? | X | O | O | X | ? |
————————————————————————————
| ? | O | O | X | X | O | X |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
4
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | X | ? | ? |
————————————————————————————
| ? | ? | O | ? | X | ? | ? |
————————————————————————————
| ? | ? | X | O | O | X | ? |
————————————————————————————
| ? | O | O | X | X | O | X |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
0
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | X | ? | ? |
————————————————————————————
| ? | ? | O | ? | X | ? | ? |
————————————————————————————
| ? | ? | X | O | O | X | ? |
————————————————————————————
| O | O | O | X | X | O | X |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
6
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | X | ? | ? |
————————————————————————————
| ? | ? | O | ? | X | ? | ? |
————————————————————————————
| ? | ? | X | O | O | X | X |
————————————————————————————
| O | O | O | X | X | O | X |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
6
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | X | ? | ? |
————————————————————————————
| ? | ? | O | ? | X | ? | O |
————————————————————————————
| ? | ? | X | O | O | X | X |
————————————————————————————
| O | O | O | X | X | O | X |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
2
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | X | ? | X | ? | ? |
————————————————————————————
| ? | ? | O | ? | X | ? | O |
————————————————————————————
| ? | ? | X | O | O | X | X |
————————————————————————————
| O | O | O | X | X | O | X |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
1
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | X | ? | X | ? | ? |
————————————————————————————
| ? | ? | O | ? | X | ? | O |
————————————————————————————
| ? | O | X | O | O | X | X |
————————————————————————————
| O | O | O | X | X | O | X |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
6
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | X | ? | X | ? | X |
————————————————————————————
| ? | ? | O | ? | X | ? | O |
————————————————————————————
| ? | O | X | O | O | X | X |
————————————————————————————
| O | O | O | X | X | O | X |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
6
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | O |
————————————————————————————
| ? | ? | X | ? | X | ? | X |
————————————————————————————
| ? | ? | O | ? | X | ? | O |
————————————————————————————
| ? | O | X | O | O | X | X |
————————————————————————————
| O | O | O | X | X | O | X |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
0
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | O |
————————————————————————————
| ? | ? | X | ? | X | ? | X |
————————————————————————————
| ? | ? | O | ? | X | ? | O |
————————————————————————————
| X | O | X | O | O | X | X |
————————————————————————————
| O | O | O | X | X | O | X |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
1
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | O |
————————————————————————————
| ? | ? | X | ? | X | ? | X |
————————————————————————————
| ? | O | O | ? | X | ? | O |
————————————————————————————
| X | O | X | O | O | X | X |
————————————————————————————
| O | O | O | X | X | O | X |
————————————————————————————

It is Huy's turn.
Please enter the column of the cell you would like to place your checker in:
3
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | O |
————————————————————————————
| ? | ? | X | ? | X | ? | X |
————————————————————————————
| ? | O | O | X | X | ? | O |
————————————————————————————
| X | O | X | O | O | X | X |
————————————————————————————
| O | O | O | X | X | O | X |
————————————————————————————

It is Jennifer's turn.
Please enter the column of the cell you would like to place your checker in:
1
————————————————————————————
| ? | ? | ? | ? | ? | ? | ? |
————————————————————————————
| ? | ? | ? | ? | ? | ? | O |
————————————————————————————
| ? | O | X | ? | X | ? | X |
————————————————————————————
| ? | O | O | X | X | ? | O |
————————————————————————————
| X | O | X | O | O | X | X |
————————————————————————————
| O | O | O | X | X | O | X |
————————————————————————————

Vertical win
Congratulations Jennifer! You won!
Would you like to continue playing? Y/N

N
Thanks for playing Connect 4!
Player 1: Huy has won 0 times.
Player 2: Jennifer has won 2 times.
There have been 0 ties.
Would you like to play a different game? Y/N
Y
Hello! What Game Would You Like To Play?
1. Tic Tac Toe
2. Order and Chaos
3. Connect Four
   2
   Let's play Order and Chaos!

Initializing the board...
Please enter the size for the square board:
6
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

Initializing the players...
How many players are playing?

2
Player 1 would you like to be Order or Chaos?

Order
Game Statistics:
ORDER: 0
CHAOS: 0

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
0
Choose a checker to place: X or O?
X
————————————————————————
| X | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
1
Choose a checker to place: X or O?
O
————————————————————————
| X | O | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

1
Please enter the column of the cell you would like to place your checker in:
1
Choose a checker to place: X or O?
X
————————————————————————
| X | O | ? | ? | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

2
Please enter the column of the cell you would like to place your checker in:
2
Choose a checker to place: X or O?
O
————————————————————————
| X | O | ? | ? | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————
| ? | ? | O | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

2
Please enter the column of the cell you would like to place your checker in:
1
Choose a checker to place: X or O?
O
————————————————————————
| X | O | ? | ? | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————
| ? | O | O | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

2
Please enter the column of the cell you would like to place your checker in:
3
Choose a checker to place: X or O?
X
————————————————————————
| X | O | ? | ? | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————
| ? | O | O | X | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

1
Please enter the column of the cell you would like to place your checker in:
0
Choose a checker to place: X or O?
X
————————————————————————
| X | O | ? | ? | ? | ? |
————————————————————————
| X | X | ? | ? | ? | ? |
————————————————————————
| ? | O | O | X | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

1
Please enter the column of the cell you would like to place your checker in:
3
Choose a checker to place: X or O?
O
————————————————————————
| X | O | ? | ? | ? | ? |
————————————————————————
| X | X | ? | O | ? | ? |
————————————————————————
| ? | O | O | X | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
4
Choose a checker to place: X or O?
O
————————————————————————
| X | O | ? | ? | O | ? |
————————————————————————
| X | X | ? | O | ? | ? |
————————————————————————
| ? | O | O | X | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

3
Please enter the column of the cell you would like to place your checker in:
1
Choose a checker to place: X or O?
X
————————————————————————
| X | O | ? | ? | O | ? |
————————————————————————
| X | X | ? | O | ? | ? |
————————————————————————
| ? | O | O | X | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

2
Please enter the column of the cell you would like to place your checker in:
0
Choose a checker to place: X or O?
X
————————————————————————
| X | O | ? | ? | O | ? |
————————————————————————
| X | X | ? | O | ? | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

4
Please enter the column of the cell you would like to place your checker in:
0
Choose a checker to place: X or O?
O
————————————————————————
| X | O | ? | ? | O | ? |
————————————————————————
| X | X | ? | O | ? | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————
| O | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
2
Choose a checker to place: X or O?
O
————————————————————————
| X | O | O | ? | O | ? |
————————————————————————
| X | X | ? | O | ? | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————
| O | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
3
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | ? |
————————————————————————
| X | X | ? | O | ? | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————
| O | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

1
Please enter the column of the cell you would like to place your checker in:
2
Choose a checker to place: X or O?
O
————————————————————————
| X | O | O | X | O | ? |
————————————————————————
| X | X | O | O | ? | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————
| O | ? | ? | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

4
Please enter the column of the cell you would like to place your checker in:
2
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | ? |
————————————————————————
| X | X | O | O | ? | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————
| O | ? | X | ? | ? | ? |
————————————————————————
| ? | ? | ? | ? | ? | ? |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

5
Please enter the column of the cell you would like to place your checker in:
1
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | ? |
————————————————————————
| X | X | O | O | ? | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————
| O | ? | X | ? | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

3
Please enter the column of the cell you would like to place your checker in:
3
Choose a checker to place: X or O?
O
————————————————————————
| X | O | O | X | O | ? |
————————————————————————
| X | X | O | O | ? | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | ? | O | ? | ? |
————————————————————————
| O | ? | X | ? | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

3
Please enter the column of the cell you would like to place your checker in:
2
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | ? |
————————————————————————
| X | X | O | O | ? | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | X | O | ? | ? |
————————————————————————
| O | ? | X | ? | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

4
Please enter the column of the cell you would like to place your checker in:
1
Choose a checker to place: X or O?
O
————————————————————————
| X | O | O | X | O | ? |
————————————————————————
| X | X | O | O | ? | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | X | O | ? | ? |
————————————————————————
| O | O | X | ? | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

1
Please enter the column of the cell you would like to place your checker in:
4
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | ? |
————————————————————————
| X | X | O | O | X | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | X | O | ? | ? |
————————————————————————
| O | O | X | ? | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

3
Please enter the column of the cell you would like to place your checker in:
4
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | ? |
————————————————————————
| X | X | O | O | X | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | X | O | X | ? |
————————————————————————
| O | O | X | ? | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

0
Please enter the column of the cell you would like to place your checker in:
5
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | X | O | X | ? |
————————————————————————
| O | O | X | ? | ? | ? |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

4
Please enter the column of the cell you would like to place your checker in:
5
Choose a checker to place: X or O?
O
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | X | O | X | ? |
————————————————————————
| O | O | X | ? | ? | O |
————————————————————————
| ? | X | ? | ? | ? | ? |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

5
Please enter the column of the cell you would like to place your checker in:
5
Choose a checker to place: X or O?
0
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | ? |
————————————————————————
| X | O | O | X | ? | ? |
————————————————————————
| ? | X | X | O | X | ? |
————————————————————————
| O | O | X | ? | ? | O |
————————————————————————
| ? | X | ? | ? | ? | 0 |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

2
Please enter the column of the cell you would like to place your checker in:
5
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | ? |
————————————————————————
| X | O | O | X | ? | X |
————————————————————————
| ? | X | X | O | X | ? |
————————————————————————
| O | O | X | ? | ? | O |
————————————————————————
| ? | X | ? | ? | ? | 0 |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

1
Please enter the column of the cell you would like to place your checker in:
5
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | X |
————————————————————————
| X | O | O | X | ? | X |
————————————————————————
| ? | X | X | O | X | ? |
————————————————————————
| O | O | X | ? | ? | O |
————————————————————————
| ? | X | ? | ? | ? | 0 |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

5
Please enter the column of the cell you would like to place your checker in:
3
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | X |
————————————————————————
| X | O | O | X | ? | X |
————————————————————————
| ? | X | X | O | X | ? |
————————————————————————
| O | O | X | ? | ? | O |
————————————————————————
| ? | X | ? | X | ? | 0 |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

3
Please enter the column of the cell you would like to place your checker in:
0
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | X |
————————————————————————
| X | O | O | X | ? | X |
————————————————————————
| X | X | X | O | X | ? |
————————————————————————
| O | O | X | ? | ? | O |
————————————————————————
| ? | X | ? | X | ? | 0 |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

3
Please enter the column of the cell you would like to place your checker in:
5
Choose a checker to place: X or O?
O
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | X |
————————————————————————
| X | O | O | X | ? | X |
————————————————————————
| X | X | X | O | X | O |
————————————————————————
| O | O | X | ? | ? | O |
————————————————————————
| ? | X | ? | X | ? | 0 |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

4
Please enter the column of the cell you would like to place your checker in:
4
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | X |
————————————————————————
| X | O | O | X | ? | X |
————————————————————————
| X | X | X | O | X | O |
————————————————————————
| O | O | X | ? | X | O |
————————————————————————
| ? | X | ? | X | ? | 0 |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

5
Please enter the column of the cell you would like to place your checker in:
0
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | X |
————————————————————————
| X | O | O | X | ? | X |
————————————————————————
| X | X | X | O | X | O |
————————————————————————
| O | O | X | ? | X | O |
————————————————————————
| X | X | ? | X | ? | 0 |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

5
Please enter the column of the cell you would like to place your checker in:
2
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | X |
————————————————————————
| X | O | O | X | ? | X |
————————————————————————
| X | X | X | O | X | O |
————————————————————————
| O | O | X | ? | X | O |
————————————————————————
| X | X | X | X | ? | 0 |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

5
Please enter the column of the cell you would like to place your checker in:
4
Choose a checker to place: X or O?
O
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | X |
————————————————————————
| X | O | O | X | ? | X |
————————————————————————
| X | X | X | O | X | O |
————————————————————————
| O | O | X | ? | X | O |
————————————————————————
| X | X | X | X | O | 0 |
————————————————————————

It is ORDER's turn.
Please enter the row of the cell you would like to place your checker in:

2
Please enter the column of the cell you would like to place your checker in:
4
Choose a checker to place: X or O?
X
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | X |
————————————————————————
| X | O | O | X | X | X |
————————————————————————
| X | X | X | O | X | O |
————————————————————————
| O | O | X | ? | X | O |
————————————————————————
| X | X | X | X | O | 0 |
————————————————————————

It is CHAOS's turn.
Please enter the row of the cell you would like to place your checker in:

4
Please enter the column of the cell you would like to place your checker in:
3
Choose a checker to place: X or O?
O
————————————————————————
| X | O | O | X | O | X |
————————————————————————
| X | X | O | O | X | X |
————————————————————————
| X | O | O | X | X | X |
————————————————————————
| X | X | X | O | X | O |
————————————————————————
| O | O | X | O | X | O |
————————————————————————
| X | X | X | X | O | 0 |
————————————————————————

Congratulations Chaos ! You won!
Would you like to play again? Y/N
N
Thanks for playing Order and Chaos!
Player 1: ORDER has won 0 times.
Player 2: CHAOS has won 1 times.

Would you like to play a different game? Y/N
N
Thank you for playing! Goodbye!
```