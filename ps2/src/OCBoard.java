import java.util.*;

public class OCBoard extends Board{
    private Cell[][] OCBoard;
    private int winCondition;

    public OCBoard(int rows, int cols) {
        super(rows, cols);
        this.winCondition = rows-1;
    }

    @Override
    public boolean isHorizontalWin(Cell checker) {
        int count = 0;
        for (int i = 0; i < OCBoard.length; i++) {
            for (int j = 0; j < OCBoard[i].length; j++) {
                if (count == winCondition) {
                    return true;
                }
                if (OCBoard[i][j].equals(checker)) {
                    count++;
                }
            }
        }
        return false;
    }

    public static void main (String[] args) {
        OCBoard OCboard = new OCBoard(6,6);

        // initialize board
        OCboard.initializeBoard();

        // add checkers
        OCboard.addChecker(0,0, 'O');

        // print board
        System.out.println(OCboard.toString());
    }

}
