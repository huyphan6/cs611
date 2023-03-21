import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LightningSpell extends Spell{
    // Lightning Spells reduce the dodge chance of the target

    public LightningSpell(String name, int price, int level, int damage, int manaCost) {
        super(name, price, level, damage, manaCost);
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

                LightningSpell s = new LightningSpell(lightningSpell[0], Integer.parseInt(lightningSpell[1]), Integer.parseInt(lightningSpell[2]), Integer.parseInt(lightningSpell[3]), Integer.parseInt(lightningSpell[4]));
                lightningSpells.add(s);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return lightningSpells;
    }

    public static void main(String[] args) {
        ArrayList<Spell> lightningSpells = initLightningSpells();
        for (Spell s : lightningSpells) {
            System.out.println(s);
        }
    }
}
