public class Cell {
    // I = inaccessible, M = market, C = common
    private char type;

    public Cell(char type) {
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public boolean equals (Cell other) {
        return this.type == other.type;
    }

    public String toString() {
        return Character.toString(type);
    }
}
