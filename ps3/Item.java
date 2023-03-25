public class Item {
    protected String name;
    protected int price;
    protected int level;

    public Item(String name, int price, int level) {
        this.name = name;
        this.price = price;
        this.level = level;
    }

    public String toString() {
        return "Item: " + name + ", Price: " + price + ", Level: " + level;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getLevel() {
        return level;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
