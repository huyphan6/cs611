import java.util.Scanner;

public abstract class BoardGame extends Game{
    Board board;

    // prints the game stats after the players no longer want to continue playing this game
    public abstract String getPlayersStats();
    // initialize the players
    public abstract Player[] initPlayers(Scanner sc);
    // initialize the board
    public abstract Board initBoard(Scanner sc);
    // continue the game
    public abstract boolean continueGame(Scanner sc);
    // process moves
    public abstract boolean processMove(Scanner sc);
    // print game stats
    public abstract String printGameStatistics();
    // play the game
    public abstract void playGame(Scanner sc);
}
