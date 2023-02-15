import java.util.*;

public abstract class Board {
    protected Cell[][] board;
    protected int winCondition;

    //Connect 4 board constructor
    public Board (int rows, int cols) {
        if (rows < 6 || cols < 7) {
            throw new IllegalArgumentException("Board must be at least 6x7");
        }
        assert(cols == rows+1);
        this.board = new Cell[rows][cols];
        this.winCondition = 4;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Cell('?');
            }
        }
    }

    //Order and Chaos board constructor
    public Board(int size) {
        if (size < 3) {
            throw new IllegalArgumentException("Size must be at least 3x3");
        }
        this.board = new Cell[size][size];
        this.winCondition = size-1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Cell('?');
            }
        }
    }

    public int setWinCondition(int winCondition) {
        this.winCondition = winCondition;
        return winCondition;
    }

    public Cell getCell(int x, int y) {
        if (x < 0 || x > board.length || y < 0 || y > board.length) {
            throw new IllegalArgumentException("Coordinates are out of bounds");
        }
        return board[x][y];
    }

    public void addChecker(int x, int y, char checker) {
        if (x < 0 || x > board.length || y < 0 || y > board.length) {
            throw new IllegalArgumentException("Coordinates are out of bounds");
        }
        if (board[x][y] != null && board[x][y].isEmpty()) {
            board[x][y].setChecker(checker);
        }
        else {
            throw new IllegalArgumentException("Cell is occupied");
        }
    }

    // to string method that prints the board and egdes
    public String toString() {
        String result = "";
        result += " " + "—".repeat(4*(winCondition+1)) + "\n";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                result += "| " + board[i][j].getChecker() + " ";
            }
            result += "| \n " +"—".repeat(4*(winCondition+1)) + "\n";
        }
        return result;
    }

    public boolean isFull() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].getChecker() == '?' || board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j].setChecker('?');
            }
        }
    }

    public abstract boolean isHorizontalWin(Cell checker);
    public abstract boolean isVerticalWin(Cell checker);
    public abstract boolean isDiagonalUpWin(Cell checker);
    public abstract boolean isDiagonalDownWin(Cell checker);
    public abstract boolean isWin(Cell checker);
}
