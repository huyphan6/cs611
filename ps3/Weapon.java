
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Weapon extends Item{
    private int damage;
    private int numHandsRequired; // values accepted: 1 or 2

    public Weapon(String name, int price, int level, int damage, int numHandsRequired) {
        super(name, price, level);
        this.damage = damage;
        this.numHandsRequired = numHandsRequired;
    }

    public int getDamage() {
        return damage;
    }

    public int getNumHandsRequired() {
        return numHandsRequired;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setNumHandsRequired(int numHandsRequired) {
        this.numHandsRequired = numHandsRequired;
    }

    public String toString() {
        return "Weapon: " + name + ", Price: " + price + ", Level Required: " + level + ", Damage: " + damage + ", NumHandsRequired: " + numHandsRequired;
    }

    public static ArrayList<Weapon> initWeapons() {
        String line = "";
        String splitBy = ", ";
        ArrayList<Weapon> weapons = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Items/Weaponry.txt"));
            while ((line = br.readLine()) != null)
            {
                String[] weapon = line.split(splitBy);

                Weapon w = new Weapon(weapon[0], Integer.parseInt(weapon[1]), Integer.parseInt(weapon[2]), Integer.parseInt(weapon[3]), Integer.parseInt(weapon[4]));
                weapons.add(w);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return weapons;
    }
}
