public abstract class Piece {
    private char[] pieces;

    public Piece(char[] pieces) {
        this.pieces = pieces;
    }

    public char[] getPieces() {
        return pieces;
    }

    public void setPieces(char[] p) {
        pieces = p;
    }
}
