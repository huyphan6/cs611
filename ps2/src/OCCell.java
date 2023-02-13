public class OCCell extends Cell{
    private int x;
    private int y;
    private Piece piece;
    public OCCell(Piece p){
        this.piece = p;
    }
    public Piece getPiece(){
        return piece;
    }

    public void setOCCell(Piece p){
        this.piece = p;
    }
    public boolean isOccupied(){
        return piece != null;
    }

}
