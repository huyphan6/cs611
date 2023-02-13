import java.util.*;

public class PlayOC extends BoardGame{
    public static void main(String[] args) {
        System.out.println("Welcome to Order and Chaos!");

        OCPlayer player1 = new OCPlayer("Player 1", new OCPiece(new char[]{'X', 'O'}));
        OCPlayer player2 = new OCPlayer("Player 2", new OCPiece(new char[]{'O', 'X'}));
        OCBoard board = new OCBoard(3, 3);
        board.printOCBoard();
    }
}
