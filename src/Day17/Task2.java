package Day17;

public class Task2 {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();

        chessBoard.addFigure(ChessPiece.WHITE_PAWN,"a",2);
        chessBoard.addFigure(ChessPiece.WHITE_PAWN,"f",2);
        chessBoard.addFigure(ChessPiece.WHITE_PAWN,"h",2);
        chessBoard.addFigure(ChessPiece.WHITE_QUEEN,"d",2);
        chessBoard.addFigure(ChessPiece.WHITE_KING,"g",1);
        chessBoard.addFigure(ChessPiece.WHITE_ROOK,"f",1);
        chessBoard.addFigure(ChessPiece.WHITE_PAWN,"f",3);
        chessBoard.addFigure(ChessPiece.WHITE_BISHOP,"e",3);
        chessBoard.addFigure(ChessPiece.WHITE_PAWN,"e",4);
        chessBoard.addFigure(ChessPiece.WHITE_ROOK,"b",7);
        chessBoard.addFigure(ChessPiece.BLACK_ROOK,"a",8);
        chessBoard.addFigure(ChessPiece.BLACK_ROOK,"f",8);
        chessBoard.addFigure(ChessPiece.BLACK_KING,"g",8);
        chessBoard.addFigure(ChessPiece.BLACK_PAWN,"e",7);
        chessBoard.addFigure(ChessPiece.BLACK_PAWN,"f",7);
        chessBoard.addFigure(ChessPiece.BLACK_PAWN,"h",7);
        chessBoard.addFigure(ChessPiece.BLACK_PAWN,"g",6);
        chessBoard.addFigure(ChessPiece.BLACK_PAWN,"a",6);
        chessBoard.addFigure(ChessPiece.BLACK_KNIGHT,"c",6);
        chessBoard.addFigure(ChessPiece.BLACK_QUEEN,"a",5);
        chessBoard.addFigure(ChessPiece.BLACK_BISHOP,"d",4);
        
        chessBoard.print();

    }
}
