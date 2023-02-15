import java.util.*;

public class PlayAllGames {
    private OCBoardGame ocBoardGame;

    public PlayAllGames() {
        this.ocBoardGame = new OCBoardGame();
    }

    public void startAllGames(Scanner sc) {
        //
    }

    public void playOCBoardGame(Scanner sc) {
        ocBoardGame.playGame(sc);
    }

}
