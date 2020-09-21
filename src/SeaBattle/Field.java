package SeaBattle;

public class Field extends AbstractField {
    private String[][] field = new String[12][12];



    public Field(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = "⬜";
            }
        }
       addNumberAndLetterOrField();
    }


//    void print() {
//        for (int i = 0; i < field.length; i++) {
//            for (int j = 0; j < field.length; j++) {
//                System.out.print(field[i][j]);
//            }
//            System.out.println();
//        }
//    }

    public String[][] getField() {
        return field;
    }


    public void clearField(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if(field[i][j] == "☑")
                    field[i][j] = "⬜";
            }
        }
    }
//    public void addNumberAndLetterOrField() {
//        field[0][0] = "  ";
//        field[0][1] = "а ";
//        field[0][2] = "б";
//        field[0][3] = "в ";
//        field[0][4] = "г";
//        field[0][5] = "д ";
//        field[0][6] = "е";
//        field[0][7] = "ж";
//        field[0][8] = "з ";
//        field[0][9] = "и";
//        field[0][10] = "к";
//        for (int i = 1; i < field.length; i++) {
//            field[i][0] = Integer.toString(i) + " ";
//            if(i == 10)
//                field[i][0] = field[i][0] = Integer.toString(i);
//    }
//        for (int i = 0; i < 12; i++) {
//            field[11][i] = " ";
//            field [i][11] = " ";
//        }
//}
}
