import java.util.Scanner;

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

    public OCBoardGame() {
    }

    // initialize the players
    public OCPlayer[] initPlayers(Scanner sc) {
        System.out.println("Initializing the players...");
        System.out.println("Player 1 will be Order and Player 2 will be Chaos. \n");
        players = new OCPlayer[2];
        players[0] = new OCPlayer("Order");
        players[1] = new OCPlayer("Chaos");
        return players;
    }
    // initialize the board
    public OCBoard initBoard(Scanner sc) {
        System.out.println("Initializing the board...");
        System.out.println("Please enter the size for the square board: ");
        int size = sc.nextInt();
        board = new OCBoard(size);
        System.out.println(board.toString());
        return board;
    }

    // Checks if the user wants to repeat the game
    public boolean continueGame(Scanner sc) {
        System.out.println("Would you like to play again? Y/N");
        char choice = sc.next().charAt(0);
        if (choice == 'Y') {
            return true;
        }
        return false;
    }

    // processes moves for order and chaos
    public boolean processMove(Scanner sc) {
        System.out.println("It is " + players[turn].toString() + "'s turn.");
        System.out.println("Please enter the row of the cell you would like to place your checker in: \n");
        int row = sc.nextInt();
        System.out.println("Please enter the column of the cell you would like to place your checker in: ");
        int col = sc.nextInt();
        System.out.println("Choose a checker to place: X or O?");
        char checker = sc.next().charAt(0);
        board.addChecker(row, col, checker);
        System.out.println(board.toString());
        turn = (turn + 1) % 2;

        if (board.isWin(board.getCell(row, col))) {
            System.out.println("Congratulations " + "Order " + "! You won!");
            players[0].addScore();
            return true;
        }
        if (board.isFull() && !board.isWin(board.getCell(row, col))) {
            System.out.println("Congratulations " + "Chaos " + "! You won!");
            players[1].addScore();
            return true;
        }
        return false;
    }

    // method that is responsible for running the game
    public void playGame(Scanner sc) {
        System.out.println("Let's play Order and Chaos! \n");
        OCBoard board = initBoard(sc);
        OCPlayer[] players = initPlayers(sc);
        boolean win = false;
        boolean playAgain = false;
        while (!playAgain){
            board.initializeBoard();
            System.out.println("Current scores: \n" + players[0].toString() + ": " + players[0].getScore() + "\n" + players[1].toString() + ": " + players[1].getScore() + "\n");
            while (!win) {
                if (processMove(sc)) {
                    win = true;
                };
            }
            if (continueGame(sc)) {
                win = false;
            } else {
                System.out.println("Thanks for playing!");
                playAgain = true;
            }
        }
    }
}
