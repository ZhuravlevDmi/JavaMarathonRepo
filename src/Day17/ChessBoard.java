package Day17;

import java.util.Arrays;

public class ChessBoard {
    private int Y = 8;
    private int X = 8;
    private ChessPiece[][] board = new ChessPiece[Y][X];

    public ChessBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = ChessPiece.EMPTY;
            }
        }
    }
    public void addFigure(ChessPiece chessPiece, String letter, int number){
        int num = 8;
        switch (letter){
            case "a":
                    num = 0;
                    break;
            case "b":
                num = 1;
                break;
            case "c":
                num = 2;
                break;
            case "d":
                num = 3;
                break;
            case "e":
                num = 4;
                break;
            case "f":
                num = 5;
                break;
            case "g":
                num = 6;
                break;
            case "h":
                num = 7;
                break;
            default:
                System.out.println("Такой позиции не существует");
                break;
        }
        if(number == 8)
            number = 0;
        else if (number == 7)
            number = 1;
        else if (number == 6)
            number = 2;
        else if (number == 5)
            number = 3;
        else if (number == 4)
            number = 4;
        else if (number == 3)
            number = 5;
        else if (number == 2)
            number = 6;
        else if (number == 1)
            number = 7;

        try {
            board[number][num] = chessPiece;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Заново надо");
        }
    }

    public void print(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
