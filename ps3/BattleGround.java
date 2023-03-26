
import java.util.*;
public class BattleGround {

    private ArrayList<Monster> dragons = Dragon.initDragons();
    private ArrayList<Monster> exoskeletons = Exoskeleton.initExoskeletons();
    private ArrayList<Monster> spirits = Spirit.initSpirits();

    public String welcomeToBattleGround() {
        return ColoredText.getAnsiCyan() + ArtMessages.getTimeForBattle() + ColoredText.getAnsiReset() + "\n";
    }

    public int getHeroTeamHP(ArrayList<Hero> heroTeam) {
        int heroTeamHP = 0;
        for (Hero h : heroTeam) {
            heroTeamHP += h.getHP();
        }
        return heroTeamHP;
    }

    public int getMonsterTeamHP(ArrayList<Monster> monsterTeam) {
        int monsterTeamHP = 0;
        for (Monster m : monsterTeam) {
            monsterTeamHP += m.getHP();
        }
        return monsterTeamHP;
    }

    public void enterBattleGround(Scanner sc, ArrayList<Hero> heroTeam) {
        System.out.println("Entering the Battle Ground...");
        System.out.println(welcomeToBattleGround());

        //heroes will go one by one and in order attacking the monsters

        // add random monsters from each monster type to the battle
        ArrayList<Monster> monsterTeam = new ArrayList<Monster>();

        // pick a random monster type and add a random monster of that type to monster team
        for (int i = 0; i < heroTeam.size(); i++) {
            int randomMonsterType = (int) (Math.random() * 3);
            switch (randomMonsterType) {
                case 0:
                    monsterTeam.add(dragons.get((int) (Math.random() * dragons.size())));
                    break;
                case 1:
                    monsterTeam.add(exoskeletons.get((int) (Math.random() * exoskeletons.size())));
                    break;
                case 2:
                    monsterTeam.add(spirits.get((int) (Math.random() * spirits.size())));
                    break;
            }
        }

        // the battle continues until either all heroes have 0 HP or all the monsters have 0 HP
        while (getHeroTeamHP(heroTeam) > 0 || getMonsterTeamHP(monsterTeam) > 0) {
            // print the stats of the hero team
            System.out.println("Hero Team Stats:");
            for (Hero h : heroTeam) {
                System.out.println(h);
            }

            // print the stats of the monster team
            System.out.println("\nMonster Team Stats:");
            for (Monster m : monsterTeam) {
                System.out.println(m);
            }

            // hero team goes first
            for (Hero h : heroTeam) {
                // if the hero is alive, they can either choose to attack, cast a spell, use a potion, or equip armor
                if (h.getHP() > 0) {
                    System.out.println("\nHero: " + h.getName() + ", HP: " + h.getHP() + ", MP: " + h.getMP());
                    System.out.println("\nWhat would you like to do?");
                    System.out.println("[1]: Attack");
                    System.out.println("[2]: Cast a spell");
                    System.out.println("[3]: Use a potion");
                    System.out.println("[4]: Equip armor");
                    System.out.println("[5]: Equip weapon");

                    int heroDecision;
                    do {
                        System.out.println("Enter a number between 1 and 5: ");
                        while (!sc.hasNextInt()) {
                            System.out.println("That's not a number!");
                            sc.next();
                        }
                        heroDecision = sc.nextInt();
                    } while (heroDecision < 1 || heroDecision > 5);

                    switch (heroDecision) {
                        case 1:
                            // pick a random monster from the monster team to attack
                            int randomMonster = (int) (Math.random() * monsterTeam.size());
                            // if the monster is alive, they take damage
                            if (monsterTeam.get(randomMonster).getHP() > 0) {
                                h.attack(monsterTeam.get(randomMonster));
                            }
                            break;
                        case 2:
                            // choose a spell to cast from the hero's inventory
                            System.out.println("Which spell would you like to cast?");
                            for (int i = 0; i < h.getInventory().getItems().size(); i++) {
                                if (h.getInventory().getItems().get(i) instanceof Spell) {
                                    System.out.println("[" + (i) + "]: " + h.getInventory().getItems().get(i).getName());
                                }
                            }
                            int spellChoice;
                            do {
                                System.out.println("Enter a number between 0 and " + (h.getInventory().getItems().size() - 1) + ": ");
                                while (!sc.hasNextInt()) {
                                    System.out.println("That's not a number!");
                                    sc.next();
                                }
                                spellChoice = sc.nextInt();
                            } while (spellChoice < 0 || spellChoice > (h.getInventory().getItems().size() - 1));
                            // cast the spell on a random monster from the monster team
                            h.castSpell((Spell) h.getInventory().getItems().get(spellChoice), monsterTeam.get( (int) (Math.random() * monsterTeam.size())));
                            break;
                        case 3:
                            // choose a potion to use from the hero's inventory
                            System.out.println("Which potion would you like to use?");
                            for (int i = 0; i < h.getInventory().getItems().size(); i++) {
                                if (h.getInventory().getItems().get(i) instanceof Potion) {
                                    System.out.println("[" + (i) + "]: " + h.getInventory().getItems().get(i).getName());
                                }
                            }
                            int potionChoice;
                            do {
                                System.out.println("Enter a number between 0 and " + (h.getInventory().getItems().size() - 1) + ": ");
                                while (!sc.hasNextInt()) {
                                    System.out.println("That's not a number!");
                                    sc.next();
                                }
                                potionChoice = sc.nextInt();
                            } while (potionChoice < 0 || potionChoice > (h.getInventory().getItems().size() - 1));
                            // use the potion on the hero
                            h.usePotion((Potion) h.getInventory().getItems().get(potionChoice));
                            break;
                        case 4:
                            // choose armor to equip from the hero's inventory
                            System.out.println("Which armor would you like to equip?");
                            for (int i = 0; i < h.getInventory().getItems().size(); i++) {
                                if (h.getInventory().getItems().get(i) instanceof Armor) {
                                    System.out.println("[" + (i) + "]: " + h.getInventory().getItems().get(i).getName());
                                }
                            }
                            int armorChoice;
                            do {
                                System.out.println("Enter a number between 0 and " + (h.getInventory().getItems().size() - 1) + ": ");
                                while (!sc.hasNextInt()) {
                                    System.out.println("That's not a number!");
                                    sc.next();
                                }
                                armorChoice = sc.nextInt();
                            } while (armorChoice < 0 || armorChoice > (h.getInventory().getItems().size() - 1));
                            // equip the armor on the hero
                            h.setArmorSlot((Armor) h.getInventory().getItems().get(armorChoice));
                            break;
                        case 5:
                            // choose a weapon to equip from the hero's inventory
                            System.out.println("Which weapon would you like to equip?");
                            for (int i = 0; i < h.getInventory().getItems().size(); i++) {
                                if (h.getInventory().getItems().get(i) instanceof Weapon) {
                                    System.out.println("[" + (i) + "]: " + h.getInventory().getItems().get(i).getName());
                                }
                            }
                            int weaponChoice;
                            do {
                                System.out.println("Enter a number between 0 and " + (h.getInventory().getItems().size() - 1) + ": ");
                                while (!sc.hasNextInt()) {
                                    System.out.println("That's not a number!");
                                    sc.next();
                                }
                                weaponChoice = sc.nextInt();
                            } while (weaponChoice < 0 || weaponChoice > (h.getInventory().getItems().size() - 1));
                            // equip the weapon on the hero
                            h.setWeaponSlot((Weapon) h.getInventory().getItems().get(weaponChoice));
                            break;
                    }
                }
            }

            // monster team attacks second
            // monsters can only attack so each monster will attack one hero
            for (Monster m : monsterTeam) {
                // if the monster is alive, they can attack a random hero from the hero team
                if (m.getHP() > 0) {
                    int randomHero = (int) (Math.random() * heroTeam.size());
                    // if the hero is alive, they take damage
                    if (heroTeam.get(randomHero).getHP() > 0) {
                        m.attack(heroTeam.get(randomHero));
                    }
                }
            }

            // at the end of each round, heroes regain 10% of their HP and MP
            for (Hero h : heroTeam) {
                h.setHP(h.getHP() + (int) (h.getHP() * 0.1));
                h.setMP(h.getMP() + (int) (h.getMP() * 0.1));
            }
        }

        // check if the hero team is alive
        boolean heroTeamAlive = false;
        for (Hero h : heroTeam) {
            if (h.getHP() > 0) {
                heroTeamAlive = true;
                break;
            }
        }

        // if the hero team is still alive, they win and distribute rewards
        if (heroTeamAlive) {
            // heroes gain gold and XP after every battle:
            // gold gained = monster's level * 100
            // XP gained = monster's level * 2
            for (Monster m : monsterTeam) {
                for (Hero h : heroTeam) {
                    h.setGold(h.getGold() + (m.getLevel() * 100));
                    h.setXP(h.getXP() + (m.getLevel() * 2));
                }
            }

            //XP required for a hero to level up = hero's current level * 10
            // When a hero levels up, all of their skills increase by 5% of their current value
            for (Hero h : heroTeam) {
                if (h.getXP() >= h.getLevel() * 10) {
                    // increase level by 1
                    h.setLevel(h.getLevel() + 1);
                    // reset XP to 0
                    h.setXP(0);
                    // HP is max 100 so if the hero's HP is greater than 100, set it to 100
                    h.setHP(100);
                    // mana increases by 11%
                    h.setMP(h.getMP() + (int) (h.getMP() * 0.1));
                    // increase all skills by 5%
                    h.setStrengthValue(h.getStrengthValue() + (int) (h.getStrengthValue() * 0.05));
                    h.setDexterityValue(h.getDexterityValue() + (int) (h.getDexterityValue() * 0.05));
                    h.setAgilityValue(h.getAgilityValue() + (int) (h.getAgilityValue() * 0.05));
                }
            }
        }
        // if the hero team is dead, they lose and the game terminates
        else {
            System.out.println("Your team has been defeated!");
            System.out.println("GAME OVER");
            System.exit(0);
        }
    }

    public static void main (String[] args) {
        BattleGround bg = new BattleGround();
        Scanner sc = new Scanner(System.in);
        System.out.println(bg.welcomeToBattleGround());
        ArrayList<Hero> heroTeam = new ArrayList<>();
        heroTeam.add(new Paladin("HUY", 3, 100, 100, 100, 100, 100, 2000, new Inventory(), 0));
        heroTeam.add(new Warrior("JEN", 3, 100, 100, 100, 100, 100, 200, new Inventory(), 0));
        Weapon w = new Weapon("Sword", 100, 2, 200, 1);
        Armor a = new Armor("Shield", 100, 2, 200);
        Spell s = new Spell("Fireball", 100, 2, 200, 10);
        heroTeam.get(0).getInventory().addItem(a);
        heroTeam.get(1).getInventory().addItem(a);
        heroTeam.get(0).getInventory().addItem(w);
        heroTeam.get(1).getInventory().addItem(w);
        bg.enterBattleGround(sc, heroTeam);
    }
}
