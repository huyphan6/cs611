public abstract class Player {
    private String name;
    private Piece piece;
    private int score;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
        score = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public Piece getPiece() {
        return piece;
    }
    public void setPiece(Piece p) {
        piece = p;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int s) {
        score = s;
    }
    public void addScore(int s) {
        score += s;
    }

}
