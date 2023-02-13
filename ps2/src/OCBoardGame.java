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


    @Override
    public Player[] launchGame(Scanner sc) {
        return new Player[0];
    }
}
