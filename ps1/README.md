# CS611:  Assignment 1
## Tic Tac Toe
---------------------------------------------------------------------------

Huy Phan\
hphan6@bu.edu\
U99944177

## Files
---------------------------------------------------------------------------
There are 3 files

1. Board: defines the board class + object and houses board related methods such as resetting, checking for ties and wins, etc.
2. Player: defines a player class + object
3. Play: this is where the game is played

## Notes
---------------------------------------------------------------------------
My board coordinates are as follows:

(0,0) (0,1), (0,2)\
(1,0) (1,1), (1,2)\
(2,0) (2,1), (2,2)

## How to compile and run
---------------------------------------------------------------------------
1. Navigate to the directory "pa1" after unzipping the files
2. Run the following instructions:
   <Example below>
   javac -d bin src/*.java
   java -cp bin Main

## Input/Output Example
---------------------------------------------------------------------------

Enter player 1's name:\
Huy\
Enter player 1's symbol:\
X\
Enter player 2's name:\
Jane\
Enter player 2's symbol:\
O\
Enter the number of rows:\
3\
Enter the number of columns:\
3\
? ? ?\
? ? ?\
? ? ?\
Player 1 Name : Huy\
Player 1 Symbol: X\
Player 2 Name: Jane\
Player 2 Symbol: O\
It is Huy's turn\
Enter the row:\
0\
Enter the column:\
0\
X ? ?\
? ? ?\
? ? ?\
It is Jane's turn\
Enter the row:\
1\
Enter the column:\
0\
X ? ?\
O ? ?\
? ? ?\
It is Huy's turn\
Enter the row:\
0\
Enter the column:\
1\
X X ?\
O ? ?\
? ? ?\
It is Jane's turn\
Enter the row:\
1\
Enter the column:\
1\
X X ?\
O O ?\
? ? ?\
It is Huy's turn\
Enter the row:\
0\
Enter the column:\
2\
X X X\
O O ?\
? ? ?\
Huy has won!\
Huy's score: 1\
Jane's score: 0\
Would you like to play again? (y/n):\
n\
Thanks for playing