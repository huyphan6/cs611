import java.util.*;

public class TTTBoardGame extends BoardGame{
    private TTTBoard board;
    private TTTPlayer[] players;
    private int turn;
    private int ties;

    public TTTBoardGame() {
    }

    public String getPlayersStats(){
        return "Player 1: " + players[0].toString() + " has won " + players[0].getScore() + " times. \n" +
                "Player 2: " + players[1].toString() + " has won " + players[1].getScore() + " times. \n" +
                "There have been " + ties + " ties.";
    }

    public TTTPlayer[] initPlayers(Scanner sc){
        System.out.println("Initializing the players...");
        System.out.println("Player 1 what is your name? \n");
        String player1Name = sc.next();
        System.out.println("Would you like to be X or O? \n");
        char player1Symbol = sc.next().charAt(0);
        this.players = new TTTPlayer[2];
        players[0] = new TTTPlayer(player1Name, player1Symbol);
        System.out.println("Player 2 what is your name? \n");
        String player2Name = sc.next();
        if (player2Name.equals(player1Name)) {
            System.out.println("Player 2 cannot be the same as Player 1. Please choose a different name.");
            player2Name = sc.next();
        }
        System.out.println("Would you like to be X or O? \n");
        if (player1Symbol == 'X') {
            players[1] = new TTTPlayer(player2Name, 'O');
        } else {
            players[1] = new TTTPlayer(player2Name, 'X');
        }
        System.out.println("Player 1: " + players[0].toString() + "'s Symbol: " + players[0].getSymbol() + "\n" +
                "Player 2: " + players[1].toString() + "'s Symbol: " + players[1].getSymbol());
        return players;
    }

    public TTTBoard initBoard(Scanner sc) {
        System.out.println("Initializing the board...");
        System.out.println("Please enter the size for the square board: ");
        int size = sc.nextInt();
        board = new TTTBoard(size);
        System.out.println(board.toString());
        return board;
    }

    public boolean continueGame(Scanner sc) {
        System.out.println("Would you like to play again? Y/N");
        char choice = sc.next().charAt(0);
        return choice == 'Y';
    }

    public boolean processMove(Scanner sc) {
        System.out.println("It is " + players[turn].toString() + "'s turn.");
        System.out.println("Please enter the row of the cell you would like to place your checker in: \n");
        int row = sc.nextInt();
        System.out.println("Please enter the column of the cell you would like to place your checker in: ");
        int col = sc.nextInt();
        board.addChecker(row, col, players[turn].getSymbol());
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

    public String printGameStatistics() {
        return "Player 1: " + players[0].toString() + " has won " + players[0].getScore() + " times. \n" +
                "Player 2: " + players[1].toString() + " has won " + players[1].getScore() + " times. \n" +
                "There have been " + ties + " ties.";
    }

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