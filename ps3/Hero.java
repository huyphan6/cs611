public abstract class Hero implements Attackable {
    protected String name;
    protected int level;
    protected int HP;
    protected int MP;
    protected int strengthValue;
    protected int dexterityValue;
    protected int agilityValue;
    protected int gold;
    protected Inventory inventory;
    protected Armor armorSlot;
    protected Weapon weaponSlot;
    protected int XP;

    public Hero(String name, int level, int HP, int MP, int strengthValue, int dexterityValue, int agilityValue, int gold, Inventory inventory, int XP) {
        this.name = name;
        this.level = level;
        this.HP = HP;
        this.MP = MP;
        this.strengthValue = strengthValue;
        this.dexterityValue = dexterityValue;
        this.agilityValue = agilityValue;
        this.gold = gold;
        this.inventory = inventory;
        this.XP = XP;
    }

    public String toString() {
        return "{" + "Name: " + name + ", Level: " + level + ", HP: " + HP + ", MP: " + MP + ", Strength: " + strengthValue +
                ", Dexterity: " + dexterityValue + ", Agility: " + agilityValue + ", Gold: " + gold + ", Inventory: " + inventory + "}";
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public int getStrengthValue() {
        return strengthValue;
    }

    public int getDexterityValue() {
        return dexterityValue;
    }

    public int getAgilityValue() {
        return agilityValue;
    }

    public int getGold() {
        return gold;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setStrengthValue(int strengthValue) {
        this.strengthValue = strengthValue;
    }

    public void setDexterityValue(int dexterityValue) {
        this.dexterityValue = dexterityValue;
    }

    public void setAgilityValue(int agilityValue) {
        this.agilityValue = agilityValue;
    }

    public void setArmorSlot(Armor armor) {
        this.armorSlot = armor;
    }

    public void setWeaponSlot(Weapon weapon) {
        this.weaponSlot = weapon;
    }

    public Armor getArmorSlot() {
        return armorSlot;
    }

    public Weapon getWeaponSlot() {
        return weaponSlot;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public void attack(Attackable target) {
        if (target instanceof Monster m) {
            int damage = this.strengthValue;
            int weaponDamage;
            int defense = m.getDefense();
            int dodge = (int) (m.getDodge() * 0.01);
            int damageDealt;
            if (weaponSlot == null) {
                weaponDamage = 0;
            }
            else{
                weaponDamage = weaponSlot.getDamage();
            }
            damageDealt = (int) ((damage + weaponDamage) * 0.05);
            if (damageDealt < 0) {
                damageDealt = 0;
            }
            int chance = (int) (Math.random() * 100);
            if (chance < dodge) {
                System.out.println(this.name + " attacks " + m.getName() + " but misses!");
                damageDealt = 0;
            }
            m.setHP(m.getHP() - damageDealt);
            System.out.println(this.name + " attacks " + m.getName() + " for " + damageDealt + " damage!");
        }
    }

    //A hero will require at least the mana
    //cost amount of MP to cast the spell. Therefore, if a hero has no MP, that hero cannot cast
    //any spells. If a hero has less than the mana cost of a spell, that hero cannot cast that spell.
    public void castSpell(Spell spell, Attackable target) {
        if (target instanceof Monster m) {
            if (this.MP < spell.getManaCost()) {
                System.out.println("You do not have enough mana to cast this spell!");
                return;
            }
            int damage = spell.getDamage();
            int defense = m.getDefense();
            int dodge = m.getDodge();
            int damageDealt = damage - defense;
            if (damageDealt < 0) {
                damageDealt = 0;
            }
            int chance = (int) (Math.random() * 100);
            if (chance < dodge) {
                damageDealt = 0;
            }
            m.setHP(m.getHP() - damageDealt);
            System.out.println(this.name + " casts " + spell.getName() + " on " + m.getName() + " for " + damageDealt + " damage!");
        }
    }

    public void usePotion(Potion potion) {
        // potions are used on the hero, and they are considered one time use
        // we must remove them from the inventory after use

        // iterate through the potion's attribute type list and apply the potion's value to the hero's attribute
        for (String attribute : potion.getAttributeType()) {
            switch (attribute) {
                case "Health":
                    this.setHP(this.getHP() + potion.getAttributeIncrease());
                    System.out.println("You used " + potion.getName() + " and gained " + potion.getAttributeIncrease() + " health!");
                    break;
                case "Mana":
                    this.setMP(this.getMP() + potion.getAttributeIncrease());
                    System.out.println("You used " + potion.getName() + " and gained " + potion.getAttributeIncrease() + " mana!");
                    break;
                case "Strength":
                    this.setStrengthValue(this.getStrengthValue() + potion.getAttributeIncrease());
                    System.out.println("You used " + potion.getName() + " and gained " + potion.getAttributeIncrease() + " strength!");
                    break;
                case "Dexterity":
                    this.setDexterityValue(this.getDexterityValue() + potion.getAttributeIncrease());
                    System.out.println("You used " + potion.getName() + " and gained " + potion.getAttributeIncrease() + " dexterity!");
                    break;
                case "Agility":
                    this.setAgilityValue(this.getAgilityValue() + potion.getAttributeIncrease());
                    System.out.println("You used " + potion.getName() + " and gained " + potion.getAttributeIncrease() + " agility!");
                    break;
            }
        }

    }
}
