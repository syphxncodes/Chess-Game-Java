public abstract class Tile {


    int tileCoordinate;
    Tile(int tileCoordinate){
        this.tileCoordinate=tileCoordinate;
    }
    public abstract boolean isTileOccupied();
    //public abstract Piece getPiece();
    public static final class EmptyTile{
        EmptyTile(int coordinate){

        }
    }
}
