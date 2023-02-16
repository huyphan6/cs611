import java.util.*;
import java.lang.*;
import static java.lang.Character.toUpperCase;

public class TTTBoardGame extends BoardGame{
    private TTTBoard board;
    private TTTPlayer[] players;
    private int turn;
    private int ties;
    private boolean isTeams;

    public TTTBoardGame() {
    }

    @Override
    public String getPlayersStats(){
        if (isTeams){
            return "Team 1: " + players[0].toString() + " has won " + players[0].getScore() + " times. \n" +
                    "Team 2: " + players[1].toString() + " has won " + players[1].getScore() + " times. \n" +
                    "There have been " + ties + " ties.";
        }
        else{
            return "Player 1: " + players[0].toString() + " has won " + players[0].getScore() + " times. \n" +
                    "Player 2: " + players[1].toString() + " has won " + players[1].getScore() + " times. \n" +
                    "There have been " + ties + " ties.";
        }
    }

    @Override
    public TTTPlayer[] initPlayers(Scanner sc){
        System.out.println("Initializing the players...");
        System.out.println("How many players are playing? \n");
        int numPlayers = sc.nextInt();
        if (numPlayers > 2) {
            isTeams = true;
            System.out.println("Please form two teams! \n");
            System.out.println("Team 1: what is your team name? \n");
            String team1Name = sc.next();
            System.out.println("Would you like to be X or O? \n");
            char team1Symbol = toUpperCase(sc.next().charAt(0));
            while (team1Symbol != 'X' && team1Symbol != 'O') {
                System.out.println("Please choose either X or O.");
                team1Symbol = sc.next().charAt(0);
            }
            this.players = new TTTPlayer[2];
            players[0] = new TTTPlayer(team1Name, team1Symbol);
            System.out.println("Team 2: what is your team name? \n");
            String team2Name = sc.next();
            while (team2Name.equals(team1Name)) {
                System.out.println("Team 2 cannot have the same name as Team 1. Please choose a different name.");
                team2Name = sc.next();
            }
            if (team1Symbol == 'X') {
                players[1] = new TTTPlayer(team2Name, 'O');
            } else {
                players[1] = new TTTPlayer(team2Name, 'X');
            }
        }
        else {
            System.out.println("Player 1 what is your name? \n");
            String player1Name = sc.next();
            System.out.println("Would you like to be X or O? \n");
            char player1Symbol = toUpperCase(sc.next().charAt(0));
            while (player1Symbol != 'X' && player1Symbol != 'O') {
                System.out.println("Please choose either X or O.");
                player1Symbol = sc.next().charAt(0);
            }
            this.players = new TTTPlayer[2];
            players[0] = new TTTPlayer(player1Name, player1Symbol);
            System.out.println("Player 2 what is your name? \n");
            String player2Name = sc.next();
            while (player2Name.equals(player1Name)) {
                System.out.println("Player 2 cannot be the same as Player 1. Please choose a different name.");
                player2Name = sc.next();
            }
            if (player1Symbol == 'X') {
                players[1] = new TTTPlayer(player2Name, 'O');
            } else {
                players[1] = new TTTPlayer(player2Name, 'X');
            }
        }
        return players;
    }

    @Override
    public TTTBoard initBoard(Scanner sc) {
        System.out.println("Initializing the board...");
        System.out.println("Please enter the size for the square board: ");
        int size = sc.nextInt();
        if (size < 3) {
            System.out.println("The board must be at least 3x3. Please enter a new size: ");
            size = sc.nextInt();
        }
        board = new TTTBoard(size);
        System.out.println(board.toString());
        return board;
    }

    @Override
    public boolean continueGame(Scanner sc) {
        System.out.println("Would you like to play again? Y/N");
        char choice = sc.next().charAt(0);
        return choice == 'Y';
    }

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
                board.addChecker(row, col, players[turn].getSymbol());
                tryAgain = false;
                System.out.println(board.toString());

                if (board.isWin(board.getCell(row, col))) {
                    System.out.println("Congratulations " + players[turn].toString() + "! You won!");
                    players[turn].addScore();
                    turn = 0;
                    return true;
                }
                if (board.isFull() && !board.isWin(board.getCell(row, col))) {
                    System.out.println("It's a tie!");
                    ties++;
                    turn = 0;
                    return true;
                }
                turn = (turn + 1) % 2;
                return false;
            }
            catch (IllegalArgumentException e) {
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

    @Override
    public String printGameStatistics() {
        if (isTeams) {
            return "Team 1: " + players[0].toString() + " has won " + players[0].getScore() + " times. \n" +
                    "Team 2: " + players[1].toString() + " has won " + players[1].getScore() + " times. \n" +
                    "There have been " + ties + " ties.";
        }
        else {
            return "Player 1: " + players[0].toString() + " has won " + players[0].getScore() + " times. \n" +
                    "Player 2: " + players[1].toString() + " has won " + players[1].getScore() + " times. \n" +
                    "There have been " + ties + " ties.";
        }
    }

    @Override
    public void playGame(Scanner sc) {
        System.out.println("Let's play Tic Tac Toe!");
        TTTBoard board = initBoard(sc);
        TTTPlayer[] players = initPlayers(sc);
        boolean win = false;
        boolean playAgain = false;
        while (!playAgain){
            board.initializeBoard();
            System.out.println(printGameStatistics());
            while (!win) {
                if (processMove(sc)) {
                    win = true;
                }
            }
            if (continueGame(sc)) {
                win = false;
            }
            else {
                System.out.println("Thanks for playing Tic Tac Toe!");
                System.out.println(getPlayersStats());
                playAgain = true;
            }
        }
    }

}