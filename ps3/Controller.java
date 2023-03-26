
import java.util.*;
public class Controller {

    public static String printMoves() {
        return "W: Move Up \nA: Move Left \nS: Move Down  \nD: Move Right \nQ: Quit";
    }

    // 20% chance of no battles, 80% chance of battles
    public static boolean rollDice() {
        int randomInt = (int)(Math.random()*10);
        return randomInt < 0 || randomInt >= 2;
    }

    public static boolean moveUp(MHBoard board, Market market, BattleGround battleGround, ArrayList<Hero> heroTeam) {
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

            Scanner sc = new Scanner(System.in);
            market.enterMarket(sc, heroTeam);

            return true;
        }
        else {
            if (!board.getCell(board.getCurrentX(), board.getCurrentY()).equals(new Cell('M'))) {
                board.removeCell(board.getCurrentX(), board.getCurrentY());
            }
            board.setCurrentX(currX + 1);
            board.setCell(board.getCurrentX(), board.getCurrentY(), 'X');
            System.out.println("You moved up!");

            if (rollDice()) {
                System.out.println("Prepare for battle!");
                Scanner sc = new Scanner(System.in);
                battleGround.enterBattleGround(sc, heroTeam);
            }

            return true;
        }
    }

    public static boolean moveDown(MHBoard board, Market market, BattleGround battleGround, ArrayList<Hero> heroTeam) {
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

            Scanner sc = new Scanner(System.in);
            market.enterMarket(sc, heroTeam);

            return true;
        }
        else {
            if (!board.getCell(board.getCurrentX(), board.getCurrentY()).equals(new Cell('M'))) {
                board.removeCell(board.getCurrentX(), board.getCurrentY());
            }
            board.setCurrentX(currX - 1);
            board.setCell(board.getCurrentX(), board.getCurrentY(), 'X');
            System.out.println("You moved down!");

            if (rollDice()) {
                System.out.println("Prepare for battle!");
                Scanner sc = new Scanner(System.in);
                battleGround.enterBattleGround(sc, heroTeam);
            }

            return true;
        }
    }

    public static boolean moveLeft(MHBoard board, Market market, BattleGround battleGround, ArrayList<Hero> heroTeam) {
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

            Scanner sc = new Scanner(System.in);
            market.enterMarket(sc, heroTeam);

            return true;
        }
        else {
            if (!board.getCell(board.getCurrentX(), board.getCurrentY()).equals(new Cell('M'))) {
                board.removeCell(board.getCurrentX(), board.getCurrentY());
            }
            board.setCurrentY(currY - 1);
            board.setCell(board.getCurrentX(), board.getCurrentY(), 'X');
            System.out.println("You moved left!");

            if (rollDice()) {
                System.out.println("Prepare for battle!");
                Scanner sc = new Scanner(System.in);
                battleGround.enterBattleGround(sc, heroTeam);
            }

            return true;
        }
    }

    public static boolean moveRight(MHBoard board, Market market, BattleGround battleGround, ArrayList<Hero> heroTeam) {
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

            Scanner sc = new Scanner(System.in);
            market.enterMarket(sc, heroTeam);

            return true;
        }
        else {
            if (!board.getCell(board.getCurrentX(), board.getCurrentY()).equals(new Cell('M'))) {
                board.removeCell(board.getCurrentX(), board.getCurrentY());
            }
            board.setCurrentY(currY + 1);
            board.setCell(board.getCurrentX(), board.getCurrentY(), 'X');
            System.out.println("You moved right!");

            if (rollDice()) {
                System.out.println("Prepare for battle!");
                Scanner sc = new Scanner(System.in);
                battleGround.enterBattleGround(sc, heroTeam);
            }

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

    public static void processMove(Scanner sc, MHBoard board, Market market, BattleGround battleGround, ArrayList<Hero> heroTeam) {
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
                moveUp(board, market, battleGround, heroTeam);
                System.out.println(board);
                System.out.println(youAreHere(board));
                break;
            case 'S':
                moveDown(board, market, battleGround, heroTeam);
                System.out.println(board);
                System.out.println(youAreHere(board));
                break;
            case 'A':
                moveLeft(board, market, battleGround, heroTeam);
                System.out.println(board);
                System.out.println(youAreHere(board));
                break;
            case 'D':
                moveRight(board, market, battleGround, heroTeam);
                System.out.println(board);
                System.out.println(youAreHere(board));
                break;
            case 'Q':
                System.out.println("Quitting the game...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid move! Please try again!");
                break;
        }
    }

}