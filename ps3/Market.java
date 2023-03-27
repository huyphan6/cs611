
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

    public void enterMarket(Scanner sc, ArrayList<Hero> heroTeam) {
        System.out.println(welcomeToMarket());

        for (int j = 0; j < heroTeam.size(); j++) {
            for (int i = 0; i < heroTeam.size(); i++) {
                System.out.println(ColoredText.getAnsiCyan() + "Hero " + (i + 1) + ": " + heroTeam.get(i) + ColoredText.getAnsiReset());
            }

            System.out.println("\nWhich hero would you like to buy or sell for? (1-" + heroTeam.size() + ")");

            int heroChoice;
            do {
                System.out.println("Please enter a integer between " + 1 + "-" + heroTeam.size() + "!");
                while (!sc.hasNextInt()) {
                    System.out.println("That's not a integer! Please Try Again!");
                    sc.next();
                }
                heroChoice = sc.nextInt();
            } while (heroChoice > heroTeam.size() || heroChoice < 1);

            System.out.println("You chose Hero: " + heroChoice + ", " + heroTeam.get(heroChoice - 1));

            System.out.println("\nWould you like to buy, sell or exit? (b/s/e)");

            char buyOrSell;
            while (!sc.hasNext("[bseBSE]")) {
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
                            for (int i = 1; i < potions.size() + 1; i++) {
                                System.out.println("[" + i + "]: " + potions.get(i - 1).toString());
                            }

                            System.out.println("Which potion would you like to buy? \n");
                            int potionChoice = 0;
                            while (potionChoice > potions.size() || potionChoice < 1) {
                                do {
                                    System.out.println("Please enter a integer between " + 1 + "-" + (potions.size()) + "!");
                                    while (!sc.hasNextInt()) {
                                        System.out.println("That's not a integer! Please Try Again!");
                                        sc.next();
                                    }
                                    potionChoice = sc.nextInt();
                                } while (potionChoice > potions.size() || potionChoice < 1);
                                // *************** add BUYING logic here ***************
                                while (heroTeam.get(heroChoice - 1).getGold() < potions.get(potionChoice - 1).getPrice()) {
                                    System.out.println("You don't have enough gold to buy this item!\n");
                                    for (int i = 1; i < potions.size() + 1; i++) {
                                        System.out.println("[" + i + "]: " + potions.get(i - 1).toString());
                                    }
                                    do {
                                        System.out.println("Please enter a integer between " + 1 + "-" + (potions.size()) + "!");
                                        while (!sc.hasNextInt()) {
                                            System.out.println("That's not a integer! Please Try Again!");
                                            sc.next();
                                        }
                                    } while (potionChoice > potions.size() || potionChoice < 1);
                                    potionChoice = sc.nextInt();
                                }
                            }

                            System.out.println("You chose: " + potions.get(potionChoice - 1).toString());

                            // add item to the hero's inventory
                            heroTeam.get(heroChoice - 1).getInventory().addItem(potions.get(potionChoice - 1));
                            System.out.println("Successfully added " + potions.get(potionChoice - 1).toString() + " to your inventory!\n");
                            System.out.println("Your inventory now contains: " + heroTeam.get(heroChoice - 1).getInventory() + "\n");

                            // remove gold from hero's gold
                            heroTeam.get(heroChoice - 1).setGold(heroTeam.get(heroChoice - 1).getGold() - potions.get(potionChoice - 1).getPrice());
                            System.out.println("You now have " + heroTeam.get(heroChoice - 1).getGold() + " gold left!\n");

                            break;
                        case 2:
                            System.out.println("Weapons \n");
                            for (int i = 1; i < weapons.size() + 1; i++) {
                                System.out.println("[" + i + "]: " + weapons.get(i - 1).toString());
                            }

                            System.out.println("Which weapon would you like to buy? \n");
                            int weaponChoice;
                            do {
                                do {
                                    System.out.println("Please enter a integer between " + 1 + "-" + (weapons.size()) + "!");
                                    while (!sc.hasNextInt()) {
                                        System.out.println("That's not a integer! Please Try Again!");
                                        sc.next();
                                    }
                                    weaponChoice = sc.nextInt();
                                } while (weaponChoice > weapons.size() || weaponChoice < 1);

                                // *************** add BUYING logic here ***************
                                while (heroTeam.get(heroChoice - 1).getGold() < weapons.get(weaponChoice - 1).getPrice()) {
                                    System.out.println("You don't have enough gold to buy this item!\n");
                                    for (int i = 1; i < weapons.size() + 1; i++) {
                                        System.out.println("[" + i + "]: " + weapons.get(i - 1).toString());
                                    }
                                    do {
                                        System.out.println("Please enter a integer between " + 1 + "-" + (weapons.size()) + "!");
                                        while (!sc.hasNextInt()) {
                                            System.out.println("That's not a integer! Please Try Again!");
                                            sc.next();
                                        }
                                    } while (weaponChoice > weapons.size() || weaponChoice < 1);
                                    weaponChoice = sc.nextInt();
                                }
                            } while (weaponChoice > weapons.size() || weaponChoice < 1);

                            System.out.println("You chose: " + weapons.get(weaponChoice - 1).toString());

                            // add item to the hero's inventory
                            heroTeam.get(heroChoice - 1).getInventory().addItem(weapons.get(weaponChoice - 1));
                            System.out.println("Successfully added " + weapons.get(weaponChoice - 1).toString() + " to your inventory!\n");
                            System.out.println("Your inventory now contains: " + heroTeam.get(heroChoice - 1).getInventory().toString() + "\n");

                            // remove gold from hero's gold
                            heroTeam.get(heroChoice - 1).setGold(heroTeam.get(heroChoice - 1).getGold() - weapons.get(weaponChoice - 1).getPrice());
                            System.out.println("You now have " + heroTeam.get(heroChoice - 1).getGold() + " gold left!\n");

                            break;
                        case 3:
                            System.out.println("Armors \n");
                            for (int i = 1; i < armors.size() + 1; i++) {
                                System.out.println("[" + i + "]: " + armors.get(i - 1).toString());
                            }

                            System.out.println("Which armor would you like to buy? \n");
                            int armorChoice;
                            do {
                                do {
                                    System.out.println("Please enter a integer between " + 1 + "-" + (armors.size()) + "!");
                                    while (!sc.hasNextInt()) {
                                        System.out.println("That's not a integer! Please Try Again!");
                                        sc.next();
                                    }
                                    armorChoice = sc.nextInt();
                                } while (armorChoice > armors.size() || armorChoice < 1);
                                // *************** add BUYING logic here ***************
                                while (heroTeam.get(heroChoice - 1).getGold() < armors.get(armorChoice - 1).getPrice()) {
                                    System.out.println("You don't have enough gold to buy this item!\n");
                                    for (int i = 1; i < armors.size() + 1; i++) {
                                        System.out.println("[" + i + "]: " + armors.get(i - 1).toString());
                                    }
                                    do {
                                        System.out.println("Please enter a integer between " + 1 + "-" + (armors.size()) + "!");
                                        while (!sc.hasNextInt()) {
                                            System.out.println("That's not a integer! Please Try Again!");
                                            sc.next();
                                        }
                                    } while (armorChoice > armors.size() || armorChoice < 1);
                                    armorChoice = sc.nextInt();
                                }
                            } while (armorChoice > armors.size() || armorChoice < 1);

                            System.out.println("You chose: " + armors.get(armorChoice - 1).toString());

                            // add item to the hero's inventory
                            heroTeam.get(heroChoice - 1).getInventory().addItem(armors.get(armorChoice - 1));
                            System.out.println("Successfully added " + armors.get(armorChoice - 1).toString() + " to your inventory!\n");
                            System.out.println("Your inventory now contains: " + heroTeam.get(heroChoice - 1).getInventory().toString() + "\n");

                            // remove gold from hero's gold
                            heroTeam.get(heroChoice - 1).setGold(heroTeam.get(heroChoice - 1).getGold() - armors.get(armorChoice - 1).getPrice());
                            System.out.println("You now have " + heroTeam.get(heroChoice - 1).getGold() + " gold left!\n");

                            break;
                        case 4:
                            System.out.println("Ice Spells \n");
                            for (int i = 1; i < IceSpells.size() + 1; i++) {
                                System.out.println("[" + i + "]: " + IceSpells.get(i - 1).toString());
                            }

                            System.out.println("Which Ice Spell would you like to buy? \n");
                            int IceSpellChoice;
                            do {
                                do {
                                    System.out.println("Please enter a integer between " + 1 + "-" + (IceSpells.size()) + "!");
                                    while (!sc.hasNextInt()) {
                                        System.out.println("That's not a integer! Please Try Again!");
                                        sc.next();
                                    }
                                    IceSpellChoice = sc.nextInt();
                                } while (IceSpellChoice > IceSpells.size() || IceSpellChoice < 1);
                                // *************** add BUYING logic here ***************
                                while (heroTeam.get(heroChoice - 1).getGold() < IceSpells.get(IceSpellChoice - 1).getPrice()) {
                                    System.out.println("You don't have enough gold to buy this item!\n");
                                    for (int i = 1; i < IceSpells.size() + 1; i++) {
                                        System.out.println("[" + i + "]: " + IceSpells.get(i - 1).toString());
                                    }
                                    do {
                                        System.out.println("Please enter a integer between " + 1 + "-" + (IceSpells.size()) + "!");
                                        while (!sc.hasNextInt()) {
                                            System.out.println("That's not a integer! Please Try Again!");
                                            sc.next();
                                        }
                                    } while (IceSpellChoice > IceSpells.size() || IceSpellChoice < 1);
                                    IceSpellChoice = sc.nextInt();
                                }
                            }
                            while (IceSpellChoice > IceSpells.size() || IceSpellChoice < 1);

                            System.out.println("You chose: " + IceSpells.get(IceSpellChoice - 1).toString());

                            // add item to the hero's inventory
                            heroTeam.get(heroChoice - 1).getInventory().addItem(IceSpells.get(IceSpellChoice - 1));
                            System.out.println("Successfully added " + IceSpells.get(IceSpellChoice - 1).toString() + " to your inventory!\n");
                            System.out.println("Your inventory now contains: " + heroTeam.get(heroChoice - 1).getInventory().toString() + "\n");

                            // remove gold from hero's gold
                            heroTeam.get(heroChoice - 1).setGold(heroTeam.get(heroChoice - 1).getGold() - IceSpells.get(IceSpellChoice - 1).getPrice());
                            System.out.println("You now have " + heroTeam.get(heroChoice - 1).getGold() + " gold left!\n");

                            break;
                        case 5:
                            System.out.println("Fire Spells \n");
                            for (int i = 1; i < FireSpells.size() + 1; i++) {
                                System.out.println("[" + i + "]: " + FireSpells.get(i - 1).toString());
                            }

                            System.out.println("Which Fire Spell would you like to buy? \n");
                            int FireSpellChoice;
                            do {
                                do {
                                    System.out.println("Please enter a integer between " + 1 + "-" + (FireSpells.size()) + "!");
                                    while (!sc.hasNextInt()) {
                                        System.out.println("That's not a integer! Please Try Again!");
                                        sc.next();
                                    }
                                    FireSpellChoice = sc.nextInt();
                                } while (FireSpellChoice > FireSpells.size() || FireSpellChoice < 1);
                                // *************** add BUYING logic here ***************
                                while (heroTeam.get(heroChoice - 1).getGold() < FireSpells.get(FireSpellChoice - 1).getPrice()) {
                                    System.out.println("You don't have enough gold to buy this item!\n");
                                    for (int i = 1; i < FireSpells.size() + 1; i++) {
                                        System.out.println("[" + i + "]: " + FireSpells.get(i - 1).toString());
                                    }
                                    do {
                                        System.out.println("Please enter a integer between " + 1 + "-" + (FireSpells.size()) + "!");
                                        while (!sc.hasNextInt()) {
                                            System.out.println("That's not a integer! Please Try Again!");
                                            sc.next();
                                        }
                                    } while (FireSpellChoice > FireSpells.size() || FireSpellChoice < 1);
                                    FireSpellChoice = sc.nextInt();
                                }
                            } while (FireSpellChoice > FireSpells.size() || FireSpellChoice < 1);

                            System.out.println("You chose: " + FireSpells.get(FireSpellChoice - 1).toString());

                            // add item to the hero's inventory
                            heroTeam.get(heroChoice - 1).getInventory().addItem(FireSpells.get(FireSpellChoice - 1));
                            System.out.println("Successfully added " + FireSpells.get(FireSpellChoice - 1).toString() + " to your inventory!\n");
                            System.out.println("Your inventory now contains: " + heroTeam.get(heroChoice - 1).getInventory().toString() + "\n");

                            // remove gold from hero's gold
                            heroTeam.get(heroChoice - 1).setGold(heroTeam.get(heroChoice - 1).getGold() - FireSpells.get(FireSpellChoice - 1).getPrice());
                            System.out.println("You now have " + heroTeam.get(heroChoice - 1).getGold() + " gold left!\n");

                            break;
                        case 6:
                            System.out.println("Lightning Spells \n");
                            for (int i = 1; i < LightningSpells.size() + 1; i++) {
                                System.out.println("[" + i + "]: " + LightningSpells.get(i - 1).toString());
                            }

                            System.out.println("Which Lightning Spell would you like to buy? \n");
                            int LightningSpellChoice;
                            do {
                                do {
                                    System.out.println("Please enter a integer between " + 1 + "-" + (LightningSpells.size()) + "!");
                                    while (!sc.hasNextInt()) {
                                        System.out.println("That's not a integer! Please Try Again!");
                                        sc.next();
                                    }
                                    LightningSpellChoice = sc.nextInt();
                                } while (LightningSpellChoice > LightningSpells.size() || LightningSpellChoice < 1);
                                // *************** add BUYING logic here ***************
                                while (heroTeam.get(heroChoice - 1).getGold() < LightningSpells.get(LightningSpellChoice - 1).getPrice()) {
                                    System.out.println("You don't have enough gold to buy this item!\n");
                                    for (int i = 1; i < LightningSpells.size() + 1; i++) {
                                        System.out.println("[" + i + "]: " + LightningSpells.get(i - 1).toString());
                                    }
                                    do {
                                        System.out.println("Please enter a integer between " + 1 + "-" + (LightningSpells.size()) + "!");
                                        while (!sc.hasNextInt()) {
                                            System.out.println("That's not a integer! Please Try Again!");
                                            sc.next();
                                        }
                                    } while (LightningSpellChoice > LightningSpells.size() || LightningSpellChoice < 1);
                                    LightningSpellChoice = sc.nextInt();
                                }
                            } while (LightningSpellChoice > LightningSpells.size() || LightningSpellChoice < 1);

                            System.out.println("You chose: " + LightningSpells.get(LightningSpellChoice - 1).toString());

                            // add item to the hero's inventory
                            heroTeam.get(heroChoice - 1).getInventory().addItem(LightningSpells.get(LightningSpellChoice - 1));
                            System.out.println("Successfully added " + LightningSpells.get(LightningSpellChoice - 1).toString() + " to your inventory!\n");
                            System.out.println("Your inventory now contains: " + heroTeam.get(heroChoice - 1).getInventory().toString() + "\n");

                            // remove gold from hero's gold
                            heroTeam.get(heroChoice - 1).setGold(heroTeam.get(heroChoice - 1).getGold() - LightningSpells.get(LightningSpellChoice - 1).getPrice());
                            System.out.println("You now have " + heroTeam.get(heroChoice - 1).getGold() + " gold left!\n");

                            break;
                    }
                    break;
                case 'S':
                    /// sell logic
                    System.out.println("What would you like to sell from your inventory? \n");
                    System.out.println("Your inventory contains: " + heroTeam.get(heroChoice - 1).getInventory() + "\n");

                    for (int i = 1; i < heroTeam.get(heroChoice - 1).getInventory().getItems().size() + 1; i++) {
                        System.out.println("[" + i + "]: " + heroTeam.get(heroChoice - 1).getInventory().getItems().get(i - 1).toString());
                    }

                    System.out.println("Which item would you like to sell? \n");
                    int itemChoice;
                    do {
                        System.out.println("Please enter a integer between " + 1 + "-" + (heroTeam.get(heroChoice - 1).getInventory().getItems().size()) + "!");
                        while (!sc.hasNextInt()) {
                            System.out.println("That's not a integer! Please Try Again!");
                            sc.next();
                        }
                        itemChoice = sc.nextInt();
                    } while (itemChoice > heroTeam.get(heroChoice - 1).getInventory().getItems().size() || itemChoice < 1);

                    /// items will sell for 50% of their original price
                    Item toSell = heroTeam.get(heroChoice - 1).getInventory().getItems().get(itemChoice - 1);
                    int sellPrice = (int) (toSell.getPrice() * 0.5);

                    System.out.println("You're choosing to sell: " + toSell + "\n");

                    // add gold to hero's gold
                    heroTeam.get(heroChoice - 1).setGold(heroTeam.get(heroChoice - 1).getGold() + sellPrice);
                    System.out.println("Here is your updated inventory: " + heroTeam.get(heroChoice - 1).getInventory().toString() + "\n");
                    System.out.println("You now have " + heroTeam.get(heroChoice - 1).getGold() + " gold!\n");

                    break;
                case 'E':
                    System.out.println("Exiting Market");
                    break;
            }
        }
    }
}
