

public class Cell {
    // This is the mark or piece or checker that is stored in the cell
    private char checker;

    public Cell(char checker) {
        this.checker = checker;
    }

    public String toString() {
        return Character.toString(checker);
    }

    public boolean equals (Cell other) {
        return this.checker == other.checker;
    }

    public char getChecker() {
        return checker;
    }

    public void setChecker(char checker) {
        this.checker = checker;
    }

    public boolean isEmpty() {
        return checker == '?';
    }

}
