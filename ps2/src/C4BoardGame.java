import java.util.*;
import java.lang.*;
import static java.lang.Character.toUpperCase;

public class C4BoardGame extends BoardGame{

    private C4Board board;
    private C4Player[] players;
    private int turn;
    private int ties;
    private boolean isTeams;

    public C4BoardGame() {
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
    public C4Player[] initPlayers(Scanner sc){
        System.out.println("Initializing the players...");
        System.out.println("How many players are playing? \n");
        int numPlayers = sc.nextInt();
        if (numPlayers > 2) {
            isTeams = true;
            System.out.println("Please form two teams! \n");
            System.out.println("Team 1: what is your team name? \n");
            String team1Name = "Team " + sc.next();
            System.out.println("Would you like to play as X or O? \n");
            char team1Symbol = toUpperCase(sc.next().charAt(0));
            while (team1Symbol != 'X' && team1Symbol != 'O') {
                System.out.println("Please choose either X or O.");
                team1Symbol = sc.next().charAt(0);
            }
            this.players = new C4Player[2];
            players[0] = new C4Player(team1Name, team1Symbol);
            System.out.println("Team 2: what is your team name? \n");
            String team2Name = "Team " + sc.next();
            while (team2Name.equals(team1Name)) {
                System.out.println("Team 2 cannot have the same name as Team 1. Please choose a different name.");
                team2Name = sc.next();
            }
            if (team1Symbol == 'X') {
                players[1] = new C4Player(team2Name, 'O');
            } else {
                players[1] = new C4Player(team2Name, 'X');
            }
        }
        else {
            System.out.println("Player 1 what is your name? \n");
            String player1Name = sc.next();
            System.out.println("Would you like play as X or O? \n");
            char player1Symbol = toUpperCase(sc.next().charAt(0));
            while (player1Symbol != 'X' && player1Symbol != 'O') {
                System.out.println("Please choose either X or O.");
                player1Symbol = sc.next().charAt(0);
            }
            this.players = new C4Player[2];
            players[0] = new C4Player(player1Name, player1Symbol);
            System.out.println("Player 2 what is your name? \n");
            String player2Name = sc.next();
            while (player2Name.equals(player1Name)) {
                System.out.println("Player 2 cannot have the same name as Player 1. Please choose a different name.");
                player2Name = sc.next();
            }
            if (player1Symbol == 'X') {
                players[1] = new C4Player(player2Name, 'O');
            } else {
                players[1] = new C4Player(player2Name, 'X');
            }
        }
        return players;
}

    @Override
    public C4Board initBoard(Scanner sc){
        System.out.println("Initializing the board...");
        System.out.println("How many rows would you like the board to have? \n");
        int rows = sc.nextInt();
        if (rows < 6) {
            System.out.println("The board must have at least 6 rows. \n");
            rows = sc.nextInt();
        }
        System.out.println("How many columns would you like the board to have? \n");
        int columns = sc.nextInt();
        if (columns < 7) {
            System.out.println("The board must have at least 7 columns. \n");
            columns = sc.nextInt();
        }
        this.board = new C4Board(rows, columns);
        System.out.println(board.toString());
        return board;
    }

    @Override
    public boolean continueGame(Scanner sc){
        System.out.println("Would you like to continue playing? Y/N \n");
        char choice = sc.next().charAt(0);
        return choice == 'Y';
    }

    @Override
    public boolean processMove(Scanner sc) {
        System.out.println("It is " + players[turn].toString() + "'s turn.");
        System.out.println("Please enter the column of the cell you would like to place your checker in: ");
        int col = sc.nextInt();
        Cell currentCell = board.addChecker(col, players[turn].getSymbol());
        if (currentCell.equals(new Cell('?'))){
            while (currentCell.equals(new Cell('?'))) {
                System.out.println("That column is full. Please choose another column.");
                col = sc.nextInt();
                currentCell = board.addChecker(col, players[turn].getSymbol());
            }
        }
        System.out.println(board.toString());

        if (board.isWin(currentCell)) {
            System.out.println("Congratulations " + players[turn].toString() + "! You won!");
            players[turn].addScore();
            turn = 0;
            return true;
        }
        if (board.isFull() && !board.isWin(currentCell)) {
            System.out.println("It's a tie!");
            ties++;
            turn = 0;
            return true;
        }
        turn = (turn + 1) % 2;
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
        System.out.println("Let's play Connect Four! \n");
        C4Board board = initBoard(sc);
        C4Player[] players = initPlayers(sc);
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
                System.out.println("Thanks for playing Connect 4!");
                System.out.println(getPlayersStats());
                playAgain = true;
            }
        }
    }
}
