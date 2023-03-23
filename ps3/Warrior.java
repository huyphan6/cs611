
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

// Favored on strength and agility
public class Warrior extends Hero {
    public Warrior (String name, int level, int HP, int MP, int strengthValue, int dexterityValue, int agilityValue, int gold) {
        super(name, level, HP, MP, strengthValue, dexterityValue, agilityValue, gold);
    }

    public static ArrayList<Hero> initWarriors(){
        String line = "";
        String splitBy = ", ";
        ArrayList<Hero> warriors = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Heroes/Warriors.txt"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] warrior = line.split(splitBy);    // use comma as separator

                Warrior w = new Warrior(warrior[0], 1, 100, Integer.parseInt(warrior[1]), Integer.parseInt(warrior[2]), Integer.parseInt(warrior[3]), Integer.parseInt(warrior[4]), Integer.parseInt(warrior[5]));
                warriors.add(w);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return warriors;
    }
}
