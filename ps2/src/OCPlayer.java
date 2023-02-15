public class OCPlayer extends Player{
    private String name;

    public OCPlayer(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
