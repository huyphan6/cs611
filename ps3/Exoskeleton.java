
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Exoskeleton extends Monster{

    public Exoskeleton (String name, int level, int HP, int damage, int defense, int dodge) {
        super(name, level, HP, damage, defense, dodge);
    }

    public static ArrayList<Monster> initExoskeletons() {
        String line = "";
        String splitBy = ", ";
        ArrayList<Monster> exoskeletons = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Monsters/Exoskeletons.txt"));
            while ((line = br.readLine()) != null)
            {
                String[] exoskeleton = line.split(splitBy);

                Exoskeleton e = new Exoskeleton(exoskeleton[0], Integer.parseInt(exoskeleton[1]), 100, Integer.parseInt(exoskeleton[2]), Integer.parseInt(exoskeleton[3]), Integer.parseInt(exoskeleton[4]));
                exoskeletons.add(e);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return exoskeletons;
    }
}
