
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
        return "Potion: " + name + ", Price: " + price + ", Level: " + level + ", Attribute Types: " + attributeTypes + ", Attribute Increase: " + attributeIncrease;
    }

    public static ArrayList<Potion> initPotions() {

        Potion healing = new Potion("Healing_Potion", 250, 1, new ArrayList<String>(List.of("Health")), 100);
        Potion strength = new Potion("Strength_Potion", 200, 1, new ArrayList<String>(List.of("Strength")), 75);
        Potion magic = new Potion("Magic_Potion", 350, 2, new ArrayList<String>(List.of("Mana")), 100);
        Potion luck = new Potion("Luck_Elixir", 500, 4, new ArrayList<String>(List.of("Agility")), 65);
        Potion mermaid = new Potion("Mermaid_Tears", 850, 5, new ArrayList<String>(List.of("Health", "Mana", "Strength", "Agility")), 100);
        Potion ambrosia = new Potion("Ambrosia", 1000, 8, new ArrayList<String>(List.of("Health", "Mana", "Strength", "Dexterity", "Defense", "Agility")), 150);

        return new ArrayList<Potion>(List.of(healing, strength, magic, luck, mermaid, ambrosia));
    }
}
