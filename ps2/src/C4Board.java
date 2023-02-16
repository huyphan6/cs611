public class C4Board extends Board{
    final int winCondition = setWinCondition(4);

    //Constructor
    public C4Board(int rows, int cols) {
        super(rows, cols);
    }

    public int getRows() {
        return board.length;
    }

    public int getCols() {
        return board[0].length;
    }

    // Connect4 has a special addChecker method that adds a checker to the bottom of a column
    public Cell addChecker(int col, char checker) {
        if (col < 0 || col > board[0].length) {
            throw new IllegalArgumentException("Coordinates are out of bounds");
        }

        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][col].isEmpty() && board[i][col] != null) {
                board[i][col].setChecker(checker);
                return board[i][col];
            }
        }
        return new Cell('?');
    }

    //Override methods to check for wins in Connect 4

    @Override
    // check for four in a row horizontally
    public boolean isHorizontalWin(Cell checker){
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length - 3; j++) {
                if (board[i][j].equals(checker) && board[i][j + 1].equals(checker) &&
                        board[i][j + 2].equals(checker) && board[i][j + 3].equals(checker) && board[i][j] != null) {
                    System.out.println("Horizontal win");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isVerticalWin(Cell checker){
        int count = 0;
        for (int i = 0; i < board.length - 3; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals(checker) && board[i+1][j].equals(checker) &&
                        board[i+2][j].equals(checker) && board[i+3][j].equals(checker) && board[i][j] != null) {
                    System.out.println("Vertical win");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isDiagonalUpWin(Cell checker){
        int count = 0;
        for (int i = 3; i < board.length; i++) {
            for (int j = 0; j < board[i].length - 3; j++) {
                if (board[i][j].equals(checker) && board[i-1][j+1].equals(checker) &&
                        board[i-2][j+2].equals(checker) && board[i-3][j+3].equals(checker) && board[i][j] != null) {
                    System.out.println("Diagonal up win");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isDiagonalDownWin(Cell checker){
        int count = 0;
        for (int i = 0; i < board.length - 3; i++) {
            for (int j = 0; j < board[i].length - 3; j++) {
                if (board[i][j].equals(checker) && board[i+1][j+1].equals(checker) &&
                        board[i+2][j+2].equals(checker) && board[i+3][j+3].equals(checker) && board[i][j] != null) {
                    System.out.println("Diagonal down win");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isWin(Cell checker){
        if (isHorizontalWin(checker) || isVerticalWin(checker) || isDiagonalUpWin(checker) || isDiagonalDownWin(checker)) {
            return true;
        }
        return false;
    }
}
