
/*
 *
 * Author: Huy Phan
 * Assignment: PS1
 * Date: 02/03/2023
 *
 * */

import java.lang.*;
public class Play {

    public static void main (String[] args) {
        //Create player 1
        System.out.println("Enter player 1's name: ");
        String name1 = Player.scan.nextLine();
        System.out.println("Enter player 1's symbol: ");
        char symbol1 = Player.scan.next().charAt(0);
        Player player1 = new Player(name1, symbol1, 0);

        //Create player 2
        Player.scan.nextLine();
        System.out.println("Enter player 2's name: ");
        String name2 = Player.scan.nextLine();
        System.out.println("Enter player 2's symbol: ");
        char symbol2 = Player.scan.next().charAt(0);
        Player player2 = new Player(name2, symbol2, 0);

        //Create board
        System.out.println("Enter the number of rows: ");
        int rows = Board.scan.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = Board.scan.nextInt();

        //Initialize board
        Board board = new Board(rows, cols);
        board.initializeBoard();
        board.printBoard();

        System.out.println("Player 1 Name : " + player1.getName());
        System.out.println("Player 1 Symbol: " + player1.getSymbol());
        System.out.println("Player 2 Name: " + player2.getName());
        System.out.println("Player 2 Symbol: " + player2.getSymbol());

        int turn = -1;
        int p1 = -1;
        int p2 = 1;
        Player current;
        boolean playAgain = true;
        boolean gameOver = false;

        /*
         *
         * Board Coordinates:
         * (0,0) (0,1), (0,2)
         * (1,0) (1,1), (1,2)
         * (2,0) (2,1), (2,2)
         *
         */

        // while loop that keeps the game going until someone wins
        while (playAgain) {
            while (!gameOver) {
                if (p1 == turn) {
                    current = player1;
                } else {
                    current = player2;
                }
                System.out.println("It is " + current.getName() + "'s turn");
                System.out.println("Enter the row: ");
                int row = Board.scan.nextInt();
                System.out.println("Enter the column: ");
                int col = Board.scan.nextInt();
                board.addPiece(row, col, current.getSymbol());
                board.printBoard();
                board.checkIfWin();
                if (board.getIsWinner()) {
                    System.out.println(current.getName() + " has won!");
                    current.addPoints();
                    gameOver = true;
                    break;
                }
                if (board.getIsTie()) {
                    System.out.println("It's a tie!");
                    gameOver = true;
                    break;
                }

                turn *= -1;

            }
            System.out.println(player1.getName() + "'s score: " + player1.getPoints());
            System.out.println(player2.getName() + "'s score: " + player2.getPoints());

            System.out.println("Would you like to play again? (y/n): ");
            char answer = Board.scan.next().charAt(0);
            if (Character.toLowerCase(answer) == 'y') {
                System.out.println("Sweet let's keep going");
                gameOver = false;
                board.initializeBoard();
                board.printBoard();
            } else {
                System.out.println("Thanks for playing");
                break;
            }

        }
    }
}
