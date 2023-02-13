import java.util.*;

public abstract class Board {
    private Cell[][] board;
    private int winCondition;

    public Board (int rows, int cols) {
        this.board = new Cell[rows][cols];
    }

    public void addChecker(int x, int y, char checker) {
        board[x][y].setChecker(checker);
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                result += board[i][j].toString();
            }
            result += "\n";
        }
        return result;
    }

    public boolean isFull() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].getChecker() == '?') {
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

    public boolean isHorizontalWin(Cell checker){
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (count == winCondition) {
                    return true;
                }
                if (board[i][j].equals(checker)) {
                    count++;
                }
            }
        }
        return false;
    }

    public boolean isVerticalWin(Cell checker){
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (count == winCondition) {
                    return true;
                }
                if (board[j][i].equals(checker)) {
                    count++;
                }
            }
        }
        return false;
    }

    public boolean isDiagonalDownWin(Cell checker){
        int count = 0;
        for (int i = 0; i < board.length-4; i++) {
            for (int j = 0; j < board[i].length-4; j++) {
                if (count == winCondition) {
                    return true;
                }
                if (board[i][j].equals(checker) && board[i+1][j+1].equals(checker) && board[i+2][j+2].equals(checker) && board[i+3][j+3].equals(checker) && board[i+4][j+4].equals(checker)) {
                    count++;
                }
            }
        }
        return false;
    }

    public boolean isDiagonalUpWin(Cell checker){
        int count = 0;
        for (int i = 4; i < board.length; i++) {
            for (int j = 4; j < board[i].length; j++) {
                if (count == winCondition) {
                    return true;
                }
                if (board[i][j].equals(checker) && board[i-1][j+1].equals(checker) && board[i-2][j+2].equals(checker) && board[i-3][j+3].equals(checker) && board[i-4][j+4].equals(checker)) {
                    count++;
                }
            }
        }
        return false;
    }

    public boolean isWin(Cell checker){
        return isHorizontalWin(checker) || isVerticalWin(checker) || isDiagonalUpWin(checker) || isDiagonalDownWin(checker);
    }
}
