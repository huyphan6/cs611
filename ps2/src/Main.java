import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! What Game Would You Like To Play?");
        System.out.println("1. Order and Chaos");
        System.out.println("2. Connect Four");

        Scanner sc = new Scanner(System.in);
        int gameChoice = sc.nextInt();

        PlayAllGames playAllGames = new PlayAllGames();

        // switch statement to choose game
        switch (gameChoice) {
            case 1:
                playAllGames.playOCBoardGame(sc);
                break;
            default:
                System.out.println("Invalid game choice.");
                break;
        }
    }
}
