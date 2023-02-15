public abstract class Player {
    protected int score;

    public Player() {
        this.score = 0;
    }
    public String toString() {
        return "Player";
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score++;
    }

}
