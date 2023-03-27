
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Dragon extends Monster{

    public Dragon (String name, int level, int HP, int damage, int defense, int dodge) {
        super(name, level, HP, damage, defense, dodge);
    }

    public static ArrayList<Monster> initDragons() {
        String line = "";
        String splitBy = ", ";
        ArrayList<Monster> dragons = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Monsters/Dragons.txt"));
            while ((line = br.readLine()) != null)
            {
                String[] dragon = line.split(splitBy);

                Dragon d = new Dragon(dragon[0], Integer.parseInt(dragon[1]), 100, Integer.parseInt(dragon[2]), Integer.parseInt(dragon[3]), Integer.parseInt(dragon[4]));
                dragons.add(d);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return dragons;
    }
}
