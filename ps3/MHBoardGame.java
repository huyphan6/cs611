
import java.util.*;
public class MHBoardGame extends BoardGame{

    private MHBoard board;
    private ArrayList<Hero> heroTeam;
    private boolean continueGame = true;
    private Market market;
    private Inventory inventory;

    public MHBoardGame() {
    }
    public MHBoard getBoard() {
        return board;
    }
    public void setBoard(MHBoard board) {
        this.board = board;
    }
    public ArrayList<Hero> getHeroTeam() {
        return heroTeam;
    }
    public void setHeroTeam(ArrayList<Hero> heroTeam) {
        this.heroTeam = heroTeam;
    }
    public boolean isContinueGame() {
        return continueGame;
    }
    public void setContinueGame(boolean continueGame) {
        this.continueGame = continueGame;
    }
    @Override
    public MHBoard initBoard(Scanner sc) {
        System.out.println("Initializing the board...");
        System.out.println("This game is played on a square board of at least 8 [WE RECOMMEND STARTING WITH 8]. What size board would you like to play on? \n");
        int boardSize;

        do {
            System.out.println("Please enter a integer 8 or greater!\n");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a integer! Please Try Again!");
                sc.next();
            }
            boardSize = sc.nextInt();
        } while (boardSize <= 7);

        board = new MHBoard(boardSize);
        System.out.println(board);

        System.out.println("*** Empty squares represent common spaces [where battles can occur] ***");
        System.out.println("*** Squares with an 'I' represent inaccessible spaces [you cannot move here] ***");
        System.out.println("*** Squares with an 'M' represent market spaces [you can buy items here] *** \n");

        System.out.println("*** Your team will be denoted by the character 'X' on the board *** \n");

        //If (0,0) is not available, then the user will be prompted to enter a new coordinate
        int x = 0;
        int y = 0;
        // please spawn next to or in the market so that you can purchase weapons before battling
        while (board.getCell(x, y).getType() != ' ') {
            System.out.println("Please enter valid common space coordinates to start your team on the board. \n");
            System.out.println("We recommend starting your team next to the market so that you can purchase weapons before battling. \n");
            do {
                System.out.println("Please enter the x coordinate of the space you want to start on: ");
                while (!sc.hasNextInt()) {
                    System.out.println("That's not a integer! Please Try Again!");
                    sc.next();
                }
                x = sc.nextInt();
            } while (x < 0 || x > boardSize - 1);

            do {
                System.out.println("Please enter the y coordinate of the space you want to start on: ");
                while (!sc.hasNextInt()) {
                    System.out.println("That's not a integer! Please Try Again!");
                    sc.next();
                }
                y = sc.nextInt();
            } while (y < 0 || y > boardSize - 1);
        }

        board.setCell(x, y, 'X');
        board.setCurrentX(x);
        board.setCurrentY(y);
        System.out.println(board);

        return board;
    }

    public ArrayList<Hero> initHeroTeam(Scanner sc) {
        System.out.println("Initializing the hero team...");
        System.out.println("How many heroes would you like to be on your team? \n");
        int teamSize;

        do {
            System.out.println("Please enter a integer between 1-3!");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a integer! Please Try Again!");
                sc.next();
            }
            teamSize = sc.nextInt();
        } while (teamSize > 3 || teamSize < 1);
        System.out.println("Thank you! You wanted a team size of " + teamSize);

        heroTeam = new ArrayList<>(teamSize);

        ArrayList<Hero> paladins = Paladin.initPaladins();
        ArrayList<Hero> warriors = Warrior.initWarriors();
        ArrayList<Hero> sorcerers = Sorcerer.initSorcerers();

        for (int i = 0; i < teamSize; i++) {
            System.out.println(ColoredText.getAnsiReset() + "Please choose which heroes you want on your team! \n");
            System.out.println(ColoredText.getAnsiRed() + "[1]: Paladins:");
            System.out.println(ColoredText.getAnsiGreen() + "[2]: Warriors:");
            System.out.println(ColoredText.getAnsiBlue() + "[3]: Sorcerers: \n");

            int heroChoice;
            do {
                System.out.println(ColoredText.getAnsiReset() + "Please enter a integer between 1-3!");
                while (!sc.hasNextInt()) {
                    System.out.println("That's not a integer! Please Try Again!");
                    sc.next();
                }
                heroChoice = sc.nextInt();
            } while (heroChoice > 3 || heroChoice < 1);

            switch (heroChoice) {
                case 1:
                    System.out.println(ColoredText.getAnsiRed() + "Paladins: \n");
                    for (int j = 0; j < paladins.size(); j++) {
                        System.out.println(j + ": " + paladins.get(j).toString());
                    }

                    System.out.println(ColoredText.getAnsiReset() +"\nWhich paladin would you like to choose? \n");
                    int paladinChoice;
                    do {
                        System.out.println("Please enter a integer between " + 0 + "-" + (paladins.size() - 1) + "!");
                        while (!sc.hasNextInt()) {
                            System.out.println("That's not a integer! Please Try Again!");
                            sc.next();
                        }
                        paladinChoice = sc.nextInt();
                    } while (paladinChoice > paladins.size()-1 || paladinChoice < 0);

                    // ADDS HERO CHOICE TO TEAM
                    heroTeam.add(paladins.get(paladinChoice));
                    System.out.println("\nAdded " + paladins.get(paladinChoice).name + " to your team! \n");

                    break;
                case 2:
                    System.out.println(ColoredText.getAnsiGreen() + "Warriors: \n");
                    for (int j = 0; j < warriors.size(); j++) {
                        System.out.println(j + ": " + warriors.get(j).toString());
                    }

                    System.out.println(ColoredText.getAnsiReset() + "\nWhich warrior would you like to choose? \n");
                    int warriorChoice;
                    do {
                        System.out.println("Please enter a integer between " + 0 + "-" + (warriors.size() - 1) + "!");
                        while (!sc.hasNextInt()) {
                            System.out.println("That's not a integer! Please Try Again!");
                            sc.next();
                        }
                        warriorChoice = sc.nextInt();
                    } while (warriorChoice > warriors.size()-1 || warriorChoice < 0);

                    // ADDS HERO CHOICE TO TEAM
                    heroTeam.add(warriors.get(warriorChoice));
                    System.out.println("\nAdded " + warriors.get(warriorChoice).name + " to your team! \n");

                    break;
                case 3:
                    System.out.println(ColoredText.getAnsiBlue() + "Sorcerers: \n");
                    for (int j = 0; j < sorcerers.size(); j++) {
                        System.out.println(j + ": " + sorcerers.get(j).toString());
                    }

                    System.out.println(ColoredText.getAnsiReset() + "\nWhich sorcerer would you like to choose? \n");
                    int sorcererChoice;
                    do {
                        System.out.println("Please enter a integer between " + 0 + "-" + (sorcerers.size() - 1) + "!");
                        while (!sc.hasNextInt()) {
                            System.out.println("That's not a integer! Please Try Again!");
                            sc.next();
                        }
                        sorcererChoice = sc.nextInt();
                    } while (sorcererChoice > sorcerers.size()-1 || sorcererChoice < 0);

                    // ADDS HERO CHOICE TO TEAM
                    heroTeam.add(sorcerers.get(sorcererChoice));
                    System.out.println("\nAdded " + sorcerers.get(sorcererChoice).name + " to your team! \n");

                    break;
            }
        }

        System.out.println(ColoredText.getAnsiReset() + "Here is your team's lineup!: \n" + heroTeam + "\n");

        return heroTeam;
    }

    public void playGame(Scanner sc) {
        System.out.println(ColoredText.getAnsiPurple() + ArtMessages.getWelcome() + ColoredText.getAnsiReset() + "\nWelcome To Monsters and Heroes! \n");
        board = initBoard(sc);
        heroTeam = initHeroTeam(sc);
        Market market = new Market();
        BattleGround battleGround = new BattleGround();

        String validMoves = Controller.printMoves();
        System.out.println(board);

        while (continueGame) {
            Controller.processMove(sc, board, market, battleGround, heroTeam);
        }
    }
}
