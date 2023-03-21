
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

// Ice Spells reduces the damage to the target
public class IceSpell extends Spell{

    public IceSpell(String name, int price, int level, int damage, int manaCost) {
        super(name, price, level, damage, manaCost);
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

                IceSpell s = new IceSpell(iceSpell[0], Integer.parseInt(iceSpell[1]), Integer.parseInt(iceSpell[2]), Integer.parseInt(iceSpell[3]), Integer.parseInt(iceSpell[4]));
                iceSpells.add(s);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return iceSpells;
    }
}
