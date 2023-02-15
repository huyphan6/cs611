import java.util.*;

public class OCBoard extends Board{

    public OCBoard(int size) {
        super(size);
    }

    @Override
    public boolean isHorizontalWin(Cell checker){
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals(checker) && board[i][j] != null) {
                    count++;
                    if (count == winCondition) {
                        return true;
                    }
                }
                else {
                    count = 0;
                    break;
                }
            }
            count = 0;
        }
        return false;
    }

    @Override
    public boolean isVerticalWin(Cell checker){
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i].equals(checker) && board[j][i] != null) {
                    count++;
                    if (count == winCondition) {
                        return true;
                    }
                }
                else {
                    count = 0;
                    break;
                }
            }
            count = 0;
        }
        return false;
    }

    @Override
    public boolean isDiagonalUpWin(Cell checker){
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i].equals(checker) && board[i][i] != null) {
                count++;
                if (count == winCondition) {
                    return true;
                }
            }
            else {
                count = 0;
                break;
            }
        }
        return false;
    }

    @Override
    public boolean isDiagonalDownWin(Cell checker){
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][board.length-1-i].equals(checker) && board[i][board.length-1-i] != null) {
                count++;
                if (count == winCondition) {
                    return true;
                }
            }
            else {
                count = 0;
                break;
            }
        }
        return false;
    }

    public boolean isWin(Cell checker) {
        return isHorizontalWin(checker) || isVerticalWin(checker) || isDiagonalUpWin(checker) || isDiagonalDownWin(checker);
    }
}
