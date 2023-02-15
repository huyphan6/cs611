public class TTTPlayer extends Player{
    private String name;
    private char symbol;

    //Constructor
    public TTTPlayer(String name, char symbol) {
        super();
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
