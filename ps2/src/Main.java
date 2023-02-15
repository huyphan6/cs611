import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Calls playallgames class and its methods to play all games and implement session

        // Create a new Scanner object for user input
        Scanner sc = new Scanner(System.in);
        PlayAllGames playAllGames = new PlayAllGames();
        playAllGames.gamePrompter(sc);

    }
}
