public abstract class Board {
    protected Cell[][] board;

    public Board(int size) {
        this.board = new Cell[size][size];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Cell('I');
            }
        }
    }
}
