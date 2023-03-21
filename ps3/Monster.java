
public abstract class Monster {

    protected String name;
    protected int level;
    protected int HP;
    protected int damage;
    protected int defense;
    protected int dodge;

    public Monster(String name, int level, int HP, int damage, int defense, int dodge) {
        this.name = name;
        this.level = level;
        this.HP = HP;
        this.damage = damage;
        this.defense = defense;
        this.dodge = dodge;
    }

    public String toString() {
        return "Name: " + name + ", Level: " + level + ", HP: " + HP + ", Damage: " + damage + ", Defense: " + defense + ", Dodge: " + dodge;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHP() {
        return HP;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public int getDodge() {
        return dodge;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }


}
