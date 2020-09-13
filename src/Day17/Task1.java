package Day17;



public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] figure = {ChessPiece.WHITE_PAWN,
                ChessPiece.WHITE_PAWN,
                ChessPiece.WHITE_PAWN,
                ChessPiece.WHITE_PAWN,
                ChessPiece.BLACK_ROOK,
                ChessPiece.BLACK_ROOK,
                ChessPiece.BLACK_ROOK,
                ChessPiece.BLACK_ROOK};

        for (int i = 0; i < figure.length; i++) {
            System.out.print(figure[i].getName() + " ");
        }
    }
}
