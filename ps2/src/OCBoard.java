public class OCBoard extends Board{
    private OCCell[][] OCBoard;

    public OCBoard (int x, int y) {
        super(x, y);
        OCBoard = new OCCell[x][y];
    }

    public void printOCBoard() {
        super.printBoard();
    }

    public void resetOCBoard() {
        super.resetBoard();
    }

    @Override
    public boolean isWinningMove(int x, int y) {
        // TODO Auto-generated method stub
        return false;
    }

}
