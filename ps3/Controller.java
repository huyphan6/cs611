
import java.util.*;
public class Controller {

    public static String printMoves() {
        return "W: Move Up \nA: Move Left \nS: Move Down  \nD: Move Right \nI: Show Info \nM: Enter Market \nQ: Quit";
    }

    public static boolean moveUp(MHBoardGame game) {
        int currX = game.getCurrentX();
        int currY = game.getCurrentY();
        if (currX == game.getBoard().getSize() - 1) {
            System.out.println("You cannot move up!");
            return false;
        } else {
            game.setCurrentY(currX + 1);
            System.out.println("You moved up!");
            return true;
        }
    }

    public static boolean moveDown(MHBoardGame game) {
        int currX = game.getCurrentX();
        int currY = game.getCurrentY();
        if (currY == 0) {
            System.out.println("You cannot move down!");
            return false;
        } else {
            game.setCurrentY(currX - 1);
            System.out.println("You moved down!");
            return true;
        }
    }

    public static boolean moveLeft(MHBoardGame game) {
        int currX = game.getCurrentX();
        int currY = game.getCurrentY();
        if (currY == 0) {
            System.out.println("You cannot move left!");
            return false;
        } else {
            game.setCurrentX(currY - 1);
            System.out.println("You moved left!");
            return true;
        }
    }

    public static boolean moveRight(MHBoardGame game) {
        int currX = game.getCurrentX();
        int currY = game.getCurrentY();
        if (currY == game.getBoard().getSize() - 1) {
            System.out.println("You cannot move right!");
            return false;
        } else {
            game.setCurrentX(currY + 1);
            System.out.println("You moved right!");
            return true;
        }
    }

    public static boolean quit(MHBoardGame game) {
        System.out.println("Quitting the game...");
        System.exit(0);
        return true;
    }

    public static void processMove(Scanner sc, MHBoardGame game) {
        System.out.println(printMoves());
        System.out.println("Please enter a move a valid move: ");
        char move;
        while (!sc.hasNext("[wasdimqWASDIMQ]")) {
            System.out.println("That's an invalid move!");
            sc.next();
        }
        move = sc.next().charAt(0);
        move = Character.toUpperCase(move);

        System.out.println("You entered: " + move);

        switch (move) {
            case 'W':
                moveUp(game);
                break;
            case 'S':
                moveDown(game);
                break;
            case 'A':
                moveLeft(game);
                break;
            case 'D':
                moveRight(game);
                break;
            case 'Q':
                System.out.println("Quitting the game...");
                System.exit(0);
                break;
            case 'I':
                System.out.println(game.getBoard());
                break;
            case 'M':
                System.out.println("Entering the market...");
                break;
            default:
                System.out.println("Invalid move! Please try again!");
                break;
        }
    }

}