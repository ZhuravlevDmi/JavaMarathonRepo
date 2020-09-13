package Day17;

public enum ChessPiece {
    WHITE_KING(100,"♔"), WHITE_QUEEN(9,"♕"), WHITE_ROOK(5,"♖"),
    WHITE_BISHOP(3.5,"♗"), WHITE_KNIGHT(3,"♘"), WHITE_PAWN(1, "♙"),
    BLACK_KING(100,"♚"), BLACK_QUEEN(9,"♛"), BLACK_ROOK(5,"♜"),
    BLACK_BISHOP(3.5,"♝"), BLACK_KNIGHT(3,"♞"), BLACK_PAWN(1,"♟"),
    EMPTY(-1, "_");

    private double price;
    private String name;

    ChessPiece(double price, String name){
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
