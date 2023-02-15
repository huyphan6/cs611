import java.util.*;

public class PlayAllGames {
    private OCBoardGame ocBoardGame;
    private TTTBoardGame tttBoardGame;
    private Player[] players;

    public PlayAllGames() {
        this.ocBoardGame = new OCBoardGame();
        this.tttBoardGame = new TTTBoardGame();
    }

    public void startAllGames(Scanner sc) {
        //
    }

    public void playOCBoardGame(Scanner sc) {
        ocBoardGame.playGame(sc);
    }

    public void playTTTBoardGame(Scanner sc) {
        tttBoardGame.playGame(sc);
    }

    public void gamePrompter(Scanner sc) {
        System.out.println("Hello! What Game Would You Like To Play?");
        System.out.println("1. Tic Tac Toe");
        System.out.println("2. Order and Chaos");
        System.out.println("3. Connect Four");

        int gameChoice = sc.nextInt();

        PlayAllGames playAllGames = new PlayAllGames();

        // switch statement to choose game
        switch (gameChoice) {
            case 1:
                playAllGames.playTTTBoardGame(sc);
                startNewSession(sc);
                break;
            case 2:
                playAllGames.playOCBoardGame(sc);
                startNewSession(sc);
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid game choice.");
                break;
            }
        }

    public void startNewSession(Scanner sc) {
        System.out.println("Would you like to play a different game? Y/N");
        char choice = sc.next().charAt(0);
        if (choice == 'Y') {
            gamePrompter(sc);
        }
        System.out.println("Thank you for playing! Goodbye!");
        sc.close();
        }
    }

