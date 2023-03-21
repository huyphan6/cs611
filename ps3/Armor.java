
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Armor extends Item{
    private int damageReduction;

    public Armor(String name, int price, int level, int damageReduction) {
        super(name, price, level);
        this.damageReduction = damageReduction;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
    }

    public String toString() {
        return "Armor: " + name + ", Price: " + price + ", Level Required: " + level + ", Damage Reduction: " + damageReduction;
    }

    public static ArrayList<Armor> initArmor() {
        String line = "";
        String splitBy = ", ";
        ArrayList<Armor> armors = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Items/Armory.txt"));
            while ((line = br.readLine()) != null)
            {
                String[] armor = line.split(splitBy);

                Armor a = new Armor(armor[0], Integer.parseInt(armor[1]), Integer.parseInt(armor[2]), Integer.parseInt(armor[3]));
                armors.add(a);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return armors;
    }
}
