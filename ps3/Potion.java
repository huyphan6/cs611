
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Potion extends Item{
    private ArrayList<String> attributeTypes;
    private int attributeIncrease;

    public Potion(String name, int price, int level, ArrayList<String> attributeType, int attributeIncrease) {
        super(name, price, level);
        this.attributeTypes = attributeType;
        this.attributeIncrease = attributeIncrease;
    }

    public ArrayList<String> getAttributeType() {
        return attributeTypes;
    }

    public int getAttributeIncrease() {
        return attributeIncrease;
    }

    public void setAttributeTypes(ArrayList<String> attributeTypes) {
        this.attributeTypes = attributeTypes;
    }

    public void setAttributeIncrease(int attributeIncrease) {
        this.attributeIncrease = attributeIncrease;
    }

    public String toString() {
        return "Potion: " + name + ", Price: " + price + ", Level: " + level + ", Attribute Types Affected: " + attributeTypes + ", Attribute Increase: " + attributeIncrease;
    }

    public static ArrayList<Potion> initPotions() {
        String line = "";
        String splitBy = ", ";
        ArrayList<Potion> potions = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Items/Potions.txt"));
            while ((line = br.readLine()) != null)
            {
                String[] potion = line.split(splitBy);

                String name = potion[0];
                int price = Integer.parseInt(potion[1]);
                int level = Integer.parseInt(potion[2]);
                ArrayList<String> attributeType = new ArrayList<String>(Arrays.asList(potion[4].split("/")));
                int attributeIncrease = Integer.parseInt(potion[3]);


                Potion s = new Potion(name, price, level, attributeType, attributeIncrease);
                potions.add(s);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return potions;
    }

    public static void main (String[] args) {
        ArrayList<Potion> potions = initPotions();
        for (Potion p : potions) {
            System.out.println(p);
        }
    }
}
