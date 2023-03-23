
import java.util.*;
public abstract class Hero implements Attackable {
    protected String name;
    protected int level;
    protected int HP;
    protected int MP;
    protected int strengthValue;
    protected int dexterityValue;
    protected int agilityValue;
    protected int gold;
    protected Inventory inventory;

    public Hero(String name, int level, int HP, int MP, int strengthValue, int dexterityValue, int agilityValue, int gold) {
        this.name = name;
        this.level = level;
        this.HP = HP;
        this.MP = MP;
        this.strengthValue = strengthValue;
        this.dexterityValue = dexterityValue;
        this.agilityValue = agilityValue;
        this.gold = gold;
    }

    public String toString() {
        return "{" + "Name: " + name + " Level: " + level + " HP: " + HP + " MP: " + MP + " Strength: " + strengthValue +
                " Dexterity: " + dexterityValue + " Agility: " + agilityValue + " Gold: " + gold + "}";
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public int getStrengthValue() {
        return strengthValue;
    }

    public int getDexterityValue() {
        return dexterityValue;
    }

    public int getAgilityValue() {
        return agilityValue;
    }

    public int getGold() {
        return gold;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setStrengthValue(int strengthValue) {
        this.strengthValue = strengthValue;
    }

    public void setDexterityValue(int dexterityValue) {
        this.dexterityValue = dexterityValue;
    }

    public void setAgilityValue(int agilityValue) {
        this.agilityValue = agilityValue;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void attack(Attackable target) {
        if (target instanceof Monster m) {
            int damage = this.strengthValue;
            int defense = m.getDefense();
            int dodge = m.getDodge();
            int damageDealt = damage - defense;
            if (damageDealt < 0) {
                damageDealt = 0;
            }
            int chance = (int) (Math.random() * 100);
            if (chance < dodge) {
                damageDealt = 0;
            }
            m.setHP(m.getHP() - damageDealt);
            System.out.println(this.name + " attacks " + m.getName() + " for " + damageDealt + " damage!");
        }
    }
}
