
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
// Favored on strength and dexterity
public class Paladin extends Hero{
    public Paladin (String name, int level, int HP, int MP, int strengthValue, int dexterityValue, int agilityValue, int gold) {
        super(name, level, HP, MP, strengthValue, dexterityValue, agilityValue, gold);
    }

    public static ArrayList<Hero> initPaladins() {
        String line = "";
        String splitBy = ", ";
        ArrayList<Hero> paladins = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Heroes/Paladins.txt"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] paladin = line.split(splitBy);    // use comma as separator

                Paladin p = new Paladin(paladin[0], 1, 100, Integer.parseInt(paladin[1]), Integer.parseInt(paladin[2]), Integer.parseInt(paladin[3]), Integer.parseInt(paladin[4]), Integer.parseInt(paladin[5]));
                paladins.add(p);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return paladins;
    }
}
