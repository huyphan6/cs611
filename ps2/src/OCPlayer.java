public class OCPlayer extends Player{
    public OCPlayer(String name, OCPiece pieces) {
        super(name, pieces);
    }

    public void makeMove(int x, int y, Board board, Piece piece) {;
        board[x][y] = new OCCell(piece);
    }
}
