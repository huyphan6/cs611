
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class FireSpell extends Spell{
    // Fire Spells reduce the defense of the target
    public FireSpell(String name, int price, int level, int damage, int manaCost) {
        super(name, price, level, damage, manaCost);
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

                FireSpell s = new FireSpell(fireSpell[0], Integer.parseInt(fireSpell[1]), Integer.parseInt(fireSpell[2]), Integer.parseInt(fireSpell[3]), Integer.parseInt(fireSpell[4]));
                fireSpells.add(s);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return fireSpells;
    }
}
