
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Spirit extends Monster{

    public Spirit (String name, int level, int HP, int damage, int defense, int dodge) {
        super(name, level, HP, damage, defense, dodge);
    }

    public static ArrayList<Monster> initSpirits() {
        String line = "";
        String splitBy = ", ";
        ArrayList<Monster> spirits = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Monsters/Spirits.txt"));
            while ((line = br.readLine()) != null)
            {
                String[] spirit = line.split(splitBy);

                Spirit s = new Spirit(spirit[0], Integer.parseInt(spirit[1]), 100, Integer.parseInt(spirit[2]), Integer.parseInt(spirit[3]), Integer.parseInt(spirit[4]));
                spirits.add(s);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return spirits;
    }
}
