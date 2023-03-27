
import java.util.*;
public class GameCenter {

    protected MHBoardGame mhBoardGame;

    public GameCenter() {
        this.mhBoardGame = new MHBoardGame();
    }

    public void playMHBoardGame(Scanner sc) {
        mhBoardGame.playGame(sc);
    }
}
