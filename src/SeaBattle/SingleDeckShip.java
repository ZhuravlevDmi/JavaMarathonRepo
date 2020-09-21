package SeaBattle;

import java.util.Scanner;

public class SingleDeckShip implements CreateShip, TranslationCoordinates{


    @Override
    public void addShip(Field field) {
        field.print();
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты куда установить однопалубный корабль, например (а 5), только без скобок");

        while(true){
            String coordinates = sc.nextLine();
            x = coordinatesX(coordinates);
            y = coordinatesY(coordinates);
//            if(checkHalo(y, x, field) == true && checkShip(y, x, field) == true) {
            if(checkShip(y, x, field) == true) {
                field.getField()[y][x] = "☑";
                entryShip(field);
                field.print();
                break;
            } else
                System.out.println(("Алё, введи еще раз, не попал в поле"));
        }
    }
    //в утиль
//    @Override
//    public void addHaloShip(Field field) {
//        for (int i = 0; i < field.getField().length; i++) {
//            for (int j = 0; j < field.getField().length; j++) {
//                if(field.getField()[i][j] == "\uD83D\uDEE5" ){
//                    field.getField()[i - 1][j - 1] = "\uD83D\uDFE6";
//                    field.getField()[i - 1][j] = "\uD83D\uDFE6";
//                    field.getField()[i][j - 1] = "\uD83D\uDFE6";
//                    field.getField()[i][j + 1] = "\uD83D\uDFE6";
//                    field.getField()[i + 1][j] = "\uD83D\uDFE6";
//                    field.getField()[i + 1][j + 1] = "\uD83D\uDFE6";
//                }
//                field.addNumberAndLetterOrField();
//            }
//        }
//    }


}
