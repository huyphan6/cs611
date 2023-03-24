import static java.lang.System.out;

public class MHBoard extends Board{
    private int currentX;
    private int currentY;

    public MHBoard(int size) {
        super(size);
    }

    public int getCurrentX() {
        return currentX;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }

}
