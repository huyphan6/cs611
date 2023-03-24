
import java.util.*;
public class Market {
    private ArrayList<Item> potions = Potion.initPotions();
    private ArrayList<Item> weapons = Weapon.initWeapons();
    private ArrayList<Item> armors = Armor.initArmors();
    private ArrayList<Item> IceSpells = IceSpell.initIceSpells();
    private ArrayList<Item> FireSpells = FireSpell.initFireSpells();
    private ArrayList<Item> LightningSpells = LightningSpell.initLightningSpells();

    public String welcomeToMarket() {
        return ColoredText.getAnsiCyan() + ArtMessages.getWelcomeToMarket() + ColoredText.getAnsiReset();
    }

    public void buyAndSell(Scanner sc, ArrayList<Hero> heroTeam, Inventory inventory) {
        System.out.println(welcomeToMarket());
        System.out.println("\n Would you like to buy or sell? (b/s)");

        char buyOrSell;
        while (!sc.hasNext("[bsBS]")) {
            System.out.println("That's an invalid choice! Please Try Again!");
            sc.next();
        }
        buyOrSell = Character.toUpperCase(sc.next().charAt(0));
        System.out.println("You entered: " + buyOrSell);

        switch (buyOrSell) {
            case 'B':
                System.out.println("What would you like to buy? \n");
                System.out.println("[1]: Potions:");
                System.out.println("[2]: Weapons:");
                System.out.println("[3]: Armors:");
                System.out.println("[4]: Ice Spells:");
                System.out.println("[5]: Fire Spells:");
                System.out.println("[6]: Lightning Spells: \n");

                int buyChoice;
                do {
                    System.out.println(ColoredText.getAnsiReset() + "Please enter a integer between 1-6!");
                    while (!sc.hasNextInt()) {
                        System.out.println("That's not a integer! Please Try Again!");
                        sc.next();
                    }
                    buyChoice = sc.nextInt();
                } while (buyChoice > 6 || buyChoice < 1);

                switch (buyChoice) {
                    case 1:
                        System.out.println("Potions \n");
                        for (int i = 0; i < potions.size(); i++) {
                            System.out.println("[" + i + "]: " + potions.get(i).toString());
                        }

                        System.out.println("Which potion would you like to buy? \n");
                        int potionChoice;
                        do {
                            System.out.println("Please enter a integer between " + 0 + "-" + (potions.size() - 1) + "!");
                            while (!sc.hasNextInt()) {
                                System.out.println("That's not a integer! Please Try Again!");
                                sc.next();
                            }
                            potionChoice = sc.nextInt();
                        } while (potionChoice > potions.size()-1 || potionChoice < 0);

                        System.out.println("You chose: " + potions.get(potionChoice).toString());

                        // *************** add BUYING logic here ***************
                        break;
                    case 2:
                        System.out.println("Weapons \n");
                        for (int i = 0; i < weapons.size(); i++) {
                            System.out.println("[" + i + "]: " + weapons.get(i).toString());
                        }

                        System.out.println("Which weapon would you like to buy? \n");
                        int weaponChoice;
                        do {
                            System.out.println("Please enter a integer between " + 0 + "-" + (weapons.size() - 1) + "!");
                            while (!sc.hasNextInt()) {
                                System.out.println("That's not a integer! Please Try Again!");
                                sc.next();
                            }
                            weaponChoice = sc.nextInt();
                        } while (weaponChoice > weapons.size()-1 || weaponChoice < 0);

                        System.out.println("You chose: " + weapons.get(weaponChoice).toString());

                        // *************** add BUYING logic here ***************
                        break;
                    case 3:
                        System.out.println("Armors \n");
                        for (int i = 0; i < armors.size(); i++) {
                            System.out.println("[" + i + "]: " + armors.get(i).toString());
                        }

                        System.out.println("Which armor would you like to buy? \n");
                        int armorChoice;
                        do {
                            System.out.println("Please enter a integer between " + 0 + "-" + (armors.size() - 1) + "!");
                            while (!sc.hasNextInt()) {
                                System.out.println("That's not a integer! Please Try Again!");
                                sc.next();
                            }
                            armorChoice = sc.nextInt();
                        } while (armorChoice > armors.size()-1 || armorChoice < 0);

                        System.out.println("You chose: " + armors.get(armorChoice).toString());

                        // *************** add BUYING logic here ***************
                        break;
                    case 4:
                        System.out.println("Ice Spells \n");
                        for (int i = 0; i < IceSpells.size(); i++) {
                            System.out.println("[" + i + "]: " + IceSpells.get(i).toString());
                        }

                        System.out.println("Which Ice Spell would you like to buy? \n");
                        int IceSpellChoice;
                        do {
                            System.out.println("Please enter a integer between " + 0 + "-" + (IceSpells.size() - 1) + "!");
                            while (!sc.hasNextInt()) {
                                System.out.println("That's not a integer! Please Try Again!");
                                sc.next();
                            }
                            IceSpellChoice = sc.nextInt();
                        } while (IceSpellChoice > IceSpells.size()-1 || IceSpellChoice < 0);

                        System.out.println("You chose: " + IceSpells.get(IceSpellChoice).toString());

                        // *************** add BUYING logic here ***************
                        break;
                    case 5:
                        System.out.println("Fire Spells \n");
                        for (int i = 0; i < FireSpells.size(); i++) {
                            System.out.println("[" + i + "]: " + FireSpells.get(i).toString());
                        }

                        System.out.println("Which Fire Spell would you like to buy? \n");
                        int FireSpellChoice;
                        do {
                            System.out.println("Please enter a integer between " + 0 + "-" + (FireSpells.size() - 1) + "!");
                            while (!sc.hasNextInt()) {
                                System.out.println("That's not a integer! Please Try Again!");
                                sc.next();
                            }
                            FireSpellChoice = sc.nextInt();
                        } while (FireSpellChoice > FireSpells.size()-1 || FireSpellChoice < 0);

                        System.out.println("You chose: " + FireSpells.get(FireSpellChoice).toString());

                        // *************** add BUYING logic here ***************
                        break;
                    case 6:
                        System.out.println("Lightning Spells \n");
                        for (int i = 0; i < LightningSpells.size(); i++) {
                            System.out.println("[" + i + "]: " + LightningSpells.get(i).toString());
                        }

                        System.out.println("Which Lightning Spell would you like to buy? \n");
                        int LightningSpellChoice;
                        do {
                            System.out.println("Please enter a integer between " + 0 + "-" + (LightningSpells.size() - 1) + "!");
                            while (!sc.hasNextInt()) {
                                System.out.println("That's not a integer! Please Try Again!");
                                sc.next();
                            }
                            LightningSpellChoice = sc.nextInt();
                        } while (LightningSpellChoice > LightningSpells.size()-1 || LightningSpellChoice < 0);

                        System.out.println("You chose: " + LightningSpells.get(LightningSpellChoice).toString());

                        // *************** add BUYING logic here ***************
                        break;
                }
            case 'S':
                /// sell logic
        }

    }

    public static void main(String[] args) {
        Market m = new Market();
        Scanner sc = new Scanner(System.in);
        ArrayList<Hero> heroTeam = new ArrayList<Hero>();
        Inventory inventory = new Inventory(10);
        m.buyAndSell(sc, heroTeam, inventory);
    }
}
