package SeaBattle;

import java.util.Scanner;

public class FourDeckShip implements CreateShip, TranslationCoordinates {


    @Override
    public void addShip(Field field) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты куда установить четырехпалубный корабль, например (а 5), только без скобок");
        while (true) {
            String coordinates = sc.nextLine();
            int x1 = coordinatesX(coordinates);
            int y1 = coordinatesY(coordinates);
            //в утиль
//            if(checkHalo(y, x, field) == true && checkShip(y, x, field) == true) {
            if (checkShip(y1, x1, field) == true) {
                field.getField()[y1][x1] = "☑";
                System.out.println("Перва палуба записана");
                field.print();
                String coordinates2 = sc.nextLine();
                int x2 = coordinatesX(coordinates2);
                int y2 = coordinatesY(coordinates2);
                if (mainTest(y2, x2, field) == true) {
                    field.getField()[y2][x2] = "☑";
                    System.out.println("Вторая палуба записана");
                    field.print();
                    String coordinates3 = sc.nextLine();
                    int x3 = coordinatesX(coordinates3);
                    int y3 = coordinatesY(coordinates3);
                    if (mainTest(y3, x3, field) == true) {
                        field.getField()[y3][x3] = "☑";
                        System.out.println("Палуба №3 готова");
                        field.print();
                        String coordinates4 = sc.nextLine();
                        int x4 = coordinatesX(coordinates4);
                        int y4 = coordinatesY(coordinates4);
                        if (mainTest(y4, x4, field) == true) {
                            field.getField()[y4][x4] = "☑";
                            if(checkSquare(field) == true){
                                System.out.println("Палуба №4 готова");
                                entryShip(field);
                                field.print();
                                break;
                            }
                        }
                    }
                    System.out.println("Все херня, давай сначала");
                    field.clearField();
                    field.print();
                } else
                    System.out.println(("Давай заново, чето нето"));
            }
        }
    }
}
