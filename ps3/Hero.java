
import java.util.*;
public abstract class Hero {
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
        return "{" + "\n" + "Name: " + name + "\n" + "Level: " + level + "\n" + "HP: " + HP + "\n" + "MP: " + MP + "\n" + "Strength: " + strengthValue + "\n" +
                "Dexterity: " + dexterityValue + "\n" + "Agility: " + agilityValue + "\n" + "Gold: " + gold + "\n" + "}";
    }
}
