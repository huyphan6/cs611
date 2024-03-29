
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
// Favored on dexterity and agility
public class Sorcerer extends Hero{

    public Sorcerer (String name, int level, int HP, int MP, int strengthValue, int dexterityValue, int agilityValue, int gold, Inventory inventory, int XP) {
        super(name, level, HP, MP, strengthValue, dexterityValue, agilityValue, gold, inventory, XP);
    }

    public static ArrayList<Hero> initSorcerers() {
        String line = "";
        String splitBy = ", ";
        ArrayList<Hero> sorcerers = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Heroes/Sorcerers.txt"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] sorcerer = line.split(splitBy);    // use comma as separator

                Sorcerer p = new Sorcerer(sorcerer[0], 1, 100, Integer.parseInt(sorcerer[1]), Integer.parseInt(sorcerer[2]), Integer.parseInt(sorcerer[3]), Integer.parseInt(sorcerer[4]), Integer.parseInt(sorcerer[5]), new Inventory(), 0);
                sorcerers.add(p);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return sorcerers;
    }
}
