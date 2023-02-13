import java.util.*;

public abstract class Board {

    private Cell[][] Board;
    private int x;
    private int y;

    public Board (int x, int y) {
        this.x = x;
        this.y = y;
        Board = new Cell[x][y];
    }

    public abstract boolean isWinningMove(int x, int y);

    public void printBoard() {
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void resetBoard() {
        for (int i = 0; i < Board.length; i++) {
            Arrays.fill(Board[i], '?');
        }
    }
}
