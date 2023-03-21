
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Spell extends Item{
    private int damage;
    private int manaCost;

    public Spell(String name, int price, int level, int damage, int manaCost) {
        super(name, price, level);
        this.damage = damage;
        this.manaCost = manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public String toString() {
        return "Spell Name: " + name + ", Price: " + price + ", Level Required: " + level + ", Damage: " + damage + ", Mana Cost: " + manaCost;
    }
}
