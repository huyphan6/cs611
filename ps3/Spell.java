
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Spell extends Item{
    private int damage;
    private int manaCost;
    // spellType values accepted: "Fire", "Ice", "Lightning"
    private String spellType;

    public Spell(String name, int price, int level, int damage, int manaCost, String spellType) {
        super(name, price, level);
        this.damage = damage;
        this.manaCost = manaCost;
        this.spellType = spellType;
    }

    public int getDamage() {
        return damage;
    }

    public int getManaCost() {
        return manaCost;
    }

    public String getSpellType() {
        return spellType;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public void setSpellType(String spellType) {
        this.spellType = spellType;
    }

    public String toString() {
        return "Spell Name: " + name + ", Price: " + price + ", Level Required: " + level + ", Damage: " + damage + ", Mana Cost: " + manaCost + ", Spell Type: " + spellType;
    }

    public static ArrayList<Spell> initFireSpells() {
        String line = "";
        String splitBy = ", ";
        ArrayList<Spell> fireSpells = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Items/FireSpells.txt"));
            while ((line = br.readLine()) != null)
            {
                String[] fireSpell = line.split(splitBy);

                Spell s = new Spell(fireSpell[0], Integer.parseInt(fireSpell[1]), Integer.parseInt(fireSpell[2]), Integer.parseInt(fireSpell[3]), Integer.parseInt(fireSpell[4]), "Fire");
                fireSpells.add(s);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return fireSpells;
    }

    public static ArrayList<Spell> initIceSpells() {
        String line = "";
        String splitBy = ", ";
        ArrayList<Spell> iceSpells = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Items/IceSpells.txt"));
            while ((line = br.readLine()) != null)
            {
                String[] iceSpell = line.split(splitBy);

                Spell s = new Spell(iceSpell[0], Integer.parseInt(iceSpell[1]), Integer.parseInt(iceSpell[2]), Integer.parseInt(iceSpell[3]), Integer.parseInt(iceSpell[4]), "Ice");
                iceSpells.add(s);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return iceSpells;
    }

    public static ArrayList<Spell> initLightningSpells() {
        String line = "";
        String splitBy = ", ";
        ArrayList<Spell> lightningSpells = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Items/LightningSpells.txt"));
            while ((line = br.readLine()) != null)
            {
                String[] lightningSpell = line.split(splitBy);

                Spell s = new Spell(lightningSpell[0], Integer.parseInt(lightningSpell[1]), Integer.parseInt(lightningSpell[2]), Integer.parseInt(lightningSpell[3]), Integer.parseInt(lightningSpell[4]), "Lightning");
                lightningSpells.add(s);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return lightningSpells;
    }
}
