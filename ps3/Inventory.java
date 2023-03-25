
import java.util.*;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public boolean contains(Item item) {
        return items.contains(item);
    }

    public String toString() {
        String s = "{ ";
        for (Item i : items) {
            s += "(" + i.toString() + "), ";
        }
        return s + " }";
    }
}