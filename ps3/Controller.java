
import java.util.*;
public class Controller {

    public static String printMoves() {
        return "W: Move Up \nA: Move Left \nS: Move Down  \nD: Move Right \nI: Show Info \nM: Enter Market \nQ: Quit";
    }

    public static boolean moveUp(MHBoard board) {
        int currX = board.getCurrentX();
        int currY = board.getCurrentY();
        if (currX == board.getSize() - 1) {
            System.out.println("You cannot move up!");
            return false;
        }
        else if (board.getCell(currX + 1, currY).equals(new Cell('I'))) {
            System.out.println("This is an inaccessible space!");
            return false;
        }
        else if (board.getCell(currX + 1, currY).equals(new Cell('M'))) {
            board.removeCell(board.getCurrentX(), board.getCurrentY());
            board.setCurrentX(currX + 1);
            System.out.println("You have reached the market!");
            return true;
        }
        else {
            if (!board.getCell(board.getCurrentX(), board.getCurrentY()).equals(new Cell('M'))) {
                board.removeCell(board.getCurrentX(), board.getCurrentY());
            }
            board.setCurrentX(currX + 1);
            board.setCell(board.getCurrentX(), board.getCurrentY(), 'X');
            System.out.println("You moved up!");
            return true;
        }
    }

    public static boolean moveDown(MHBoard board) {
        int currX = board.getCurrentX();
        int currY = board.getCurrentY();
        if (currX == 0) {
            System.out.println("You cannot move down!");
            return false;
        }
        else if (board.getCell(currX - 1, currY).equals(new Cell('I'))) {
            System.out.println("This is an inaccessible space!");
            return false;
        }
        else if (board.getCell(currX - 1, currY).equals(new Cell('M'))) {
            board.removeCell(board.getCurrentX(), board.getCurrentY());
            board.setCurrentX(currX - 1);
            System.out.println("You have reached the market!");
            return true;
        }
        else {
            if (!board.getCell(board.getCurrentX(), board.getCurrentY()).equals(new Cell('M'))) {
                board.removeCell(board.getCurrentX(), board.getCurrentY());
            }
            board.setCurrentX(currX - 1);
            board.setCell(board.getCurrentX(), board.getCurrentY(), 'X');
            System.out.println("You moved down!");
            return true;
        }
    }

    public static boolean moveLeft(MHBoard board) {
        int currX = board.getCurrentX();
        int currY = board.getCurrentY();
        if (currY == 0) {
            System.out.println("You cannot move left!");
            return false;
        }
        else if (board.getCell(currX, currY - 1).equals(new Cell('I'))) {
            System.out.println("This is an inaccessible space!");
            return false;
        }
        else if (board.getCell(currX, currY - 1).equals(new Cell('M'))) {
            board.removeCell(board.getCurrentX(), board.getCurrentY());
            board.setCurrentY(currY - 1);
            System.out.println("You have reached the market!");
            return true;
        }
        else {
            if (!board.getCell(board.getCurrentX(), board.getCurrentY()).equals(new Cell('M'))) {
                board.removeCell(board.getCurrentX(), board.getCurrentY());
            }
            board.setCurrentY(currY - 1);
            board.setCell(board.getCurrentX(), board.getCurrentY(), 'X');
            System.out.println("You moved left!");
            return true;
        }
    }

    public static boolean moveRight(MHBoard board) {
        int currX = board.getCurrentX();
        int currY = board.getCurrentY();
        if (currY == board.getSize() - 1) {
            System.out.println("You cannot move right!");
            return false;
        }
        else if (board.getCell(currX, currY + 1).equals(new Cell('I'))) {
            System.out.println("This is an inaccessible space!");
            return false;
        }
        else if (board.getCell(currX, currY + 1).equals(new Cell('M'))) {
            board.removeCell(board.getCurrentX(), board.getCurrentY());
            board.setCurrentY(currY + 1);
            System.out.println("You have reached the market!");
            return true;
        }
        else {
            if (!board.getCell(board.getCurrentX(), board.getCurrentY()).equals(new Cell('M'))) {
                board.removeCell(board.getCurrentX(), board.getCurrentY());
            }
            board.setCurrentY(currY + 1);
            board.setCell(board.getCurrentX(), board.getCurrentY(), 'X');
            System.out.println("You moved right!");
            return true;
        }
    }

    public static boolean quit(MHBoardGame game) {
        System.out.println("Quitting the game...");
        System.exit(0);
        return true;
    }

    public static String youAreHere(MHBoard board) {
        return "YOU ARE HERE (" + board.getCurrentX() + ", " + board.getCurrentY() + ")" + " CELL TYPE: " + board.getCell(board.getCurrentX(), board.getCurrentY()).getType() + "\n";
    }

    public static void processMove(Scanner sc, MHBoard board) {
        System.out.println(printMoves());
        System.out.println("\nPlease enter a move a valid move: ");
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
                moveUp(board);
                System.out.println(board);
                System.out.println(youAreHere(board));
                break;
            case 'S':
                moveDown(board);
                System.out.println(board);
                System.out.println(youAreHere(board));
                break;
            case 'A':
                moveLeft(board);
                System.out.println(board);
                System.out.println(youAreHere(board));
                break;
            case 'D':
                moveRight(board);
                System.out.println(board);
                System.out.println(youAreHere(board));
                break;
            case 'Q':
                System.out.println("Quitting the game...");
                System.exit(0);
                break;
            case 'I':
                System.out.println(board);
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