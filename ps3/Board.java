
import java.lang.*;
import static java.lang.System.out;
public abstract class Board {
    protected Cell[][] board;

    // We want our board to have 20% inaccessible cells, 30% market cells, and 50% common cells
    public Board(int size) {
        this.board = new Cell[size][size];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // picks a random number between 0 and 9
                int randomInt = (int)(Math.random()*10);
                if (randomInt >= 0 && randomInt < 2) {
                    board[i][j] = new Cell('I');
                }
                else if (randomInt >= 2 && randomInt < 5) {
                    board[i][j] = new Cell('M');
                }
                else {
                    board[i][j] = new Cell(' ');
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            sb.append("+");
            for (int j = 0; j < board[i].length; j++) {
                sb.append("---+");
            }
            sb.append("\n");
            sb.append("|");
            for (int j = 0; j < board[i].length; j++) {
                sb.append(" ").append(board[i][j]).append(" |");
            }
            sb.append("\n");
        }
        sb.append("+");
        for (int j = 0; j < board[0].length; j++) {
            sb.append("---+");
        }
        sb.append("\n");

        return sb.toString();
    }

    public int getSize() {
        return board.length;
    }

    public Cell getCell(int x, int y) {
        if (x < 0 || x > board.length || y < 0 || y > board.length) {
            throw new IllegalArgumentException("Coordinates are out of bounds");
        }
        return board[x][y];
    }

    public void setCell(int x, int y, char type) {
        if (x < 0 || x > board.length || y < 0 || y > board.length) {
            throw new IllegalArgumentException("Coordinates are out of bounds");
        }
        if (board[x][y].getType() == ' ') {
            board[x][y].setType(type);
        }
        else {
            throw new IllegalArgumentException("Cell is occupied");
        }
    }
}
