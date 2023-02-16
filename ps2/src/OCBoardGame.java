import java.util.Scanner;

import java.io.*;

public class OCBoardGame extends BoardGame{

    //this is where all the game logic will be implemented
    // initializeGame method
    // continueGame method
    // processMove method for order and chaos
    // addChecker method
    //playGame method that calls methods and facilitates the game

    private OCBoard board;
    private OCPlayer[] players;
    private int turn;
    private boolean isTeams;

    // Constructor
    public OCBoardGame() {
    }

    // prints the game stats after the players no longer want to continue playing this game
    @Override
    public String getPlayersStats() {
        if (isTeams) {
            return "Team 1: " + players[0].toString() + " has won " + players[0].getScore() + " times. \n" +
                    "Team 2: " + players[1].toString() + " has won " + players[1].getScore() + " times. \n";
        } else {
            return "Player 1: " + players[0].toString() + " has won " + players[0].getScore() + " times. \n" +
                    "Player 2: " + players[1].toString() + " has won " + players[1].getScore() + " times. \n";
        }
    }

    // initialize the players
    @Override
    public OCPlayer[] initPlayers(Scanner sc) {
        System.out.println("Initializing the players...");
        System.out.println("How many players are playing? \n");
        int numPlayers = sc.nextInt();
        if (numPlayers > 2) {
            System.out.println("Please form two teams! \n");
            System.out.println("Team 1, would you like play as Order or Chaos? \n");
            String team1Name = sc.next().toUpperCase();
            while (!team1Name.equals("ORDER") && !team1Name.equals("CHAOS")) {
                System.out.println("Please choose either Order or Chaos.");
                team1Name = sc.next().toUpperCase();
            }
            this.players = new OCPlayer[2];
            players[0] = new OCPlayer("Team " + team1Name);
            String team2Name;
            if (team1Name.equals("ORDER")) {
                team2Name = "CHAOS";
            } else {
                team2Name = "ORDER";
            }
            players[1] = new OCPlayer("Team " + team2Name);
        }
        else {
            System.out.println("Player 1 would you like to be Order or Chaos? \n");
            String player1Name = sc.next().toUpperCase();
            this.players = new OCPlayer[2];
            players[0] = new OCPlayer(player1Name);
            while (!player1Name.equals("ORDER") && !player1Name.equals("CHAOS")) {
                System.out.println("Please choose either Order or Chaos.");
                player1Name = sc.next().toUpperCase();
            }
            String player2Name;
            if (player1Name.equals("ORDER")) {
                player2Name = "CHAOS";
            } else {
                player2Name = "ORDER";
            }
            players[1] = new OCPlayer(player2Name);
        }
        return players;
    }

    // initialize the board
    @Override
    public OCBoard initBoard(Scanner sc) {
        System.out.println("Initializing the board...");
        System.out.println("Please enter the size for the square board: ");
        int size = sc.nextInt();
        board = new OCBoard(size);
        System.out.println(board.toString());
        return board;
    }

    // Checks if the user wants to repeat the game
    @Override
    public boolean continueGame(Scanner sc) {
        System.out.println("Would you like to play again? Y/N");
        char choice = sc.next().charAt(0);
        return choice == 'Y';
    }

    // processes moves for order and chaos
    @Override
    public boolean processMove(Scanner sc) {
        System.out.println("It is " + players[turn].toString() + "'s turn.");

        boolean tryAgain = true;
        while (tryAgain) {
            try {
                System.out.println("Please enter the row of the cell you would like to place your checker in: \n");
                int row = sc.nextInt();
                System.out.println("Please enter the column of the cell you would like to place your checker in: ");
                int col = sc.nextInt();
                System.out.println("Choose a checker to place: X or O?");
                char checker = sc.next().charAt(0);
                board.addChecker(row, col, checker);
                tryAgain = false;
                System.out.println(board.toString());

                if (board.isWin(board.getCell(row, col))) {
                    System.out.println("Congratulations " + "Order " + "! You won!");
                    players[0].addScore();
                    turn = 0;
                    return true;
                }
                if (board.isFull() && !board.isWin(board.getCell(row, col))) {
                    System.out.println("Congratulations " + "Chaos " + "! You won!");
                    players[1].addScore();
                    turn = 0;
                    return true;
                }
                turn = (turn + 1) % 2;
                return false;
            }
            catch (IllegalArgumentException e){
                if (e.getMessage().equals("Coordinates are out of bounds")) {
                    System.out.println("Coordinates are out of bounds. Please try again.");
                }
                else {
                    System.out.println("This cell is already occupied. Please try again.");
                }
            }
        }
        return false;
    }

    // prints the game statistics after a win or a loss
    @Override
    public String printGameStatistics() {
        if (isTeams) {
            return "Game Statistics: \n" + players[0].toString() + ": " + players[0].getScore() + "\n" +
                    players[1].toString() + ": " + players[1].getScore() + "\n";
        }
        else {
            return "Game Statistics: \n" + players[0].toString() + ": " + players[0].getScore() + "\n" +
                    players[1].toString() + ": " + players[1].getScore() + "\n";
        }
    }

    // method that is responsible for running the game
    @Override
    public void playGame(Scanner sc) {
        System.out.println("Let's play Order and Chaos! \n");
        OCBoard board = initBoard(sc);
        OCPlayer[] players = initPlayers(sc);
        boolean win = false;
        boolean playAgain = false;
        while (!playAgain){
            board.initializeBoard();
            System.out.println(printGameStatistics());
            while (!win) {
                if (processMove(sc)) {
                    win = true;
                };
            }
            if (continueGame(sc)) {
                win = false;
            } else {
                System.out.println("Thanks for playing Order and Chaos!");
                System.out.println(getPlayersStats());
                playAgain = true;
            }
        }
    }
}
