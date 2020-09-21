package SeaBattle;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DoubleDeckShip implements CreateShip, TranslationCoordinates{

    //в утиль
//    @Override
//    public void addHaloShip(Field field) {
//
//    }

    @Override
    public void addShip(Field field) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты куда установить двухпалубный корабль, например (а 5), только без скобок");
        while(true){
            String coordinates = sc.nextLine();
            x = coordinatesX(coordinates);
            y = coordinatesY(coordinates);
            //в утиль
//            if(checkHalo(y, x, field) == true && checkShip(y, x, field) == true) {
            if(checkShip(y, x, field) == true) {
                field.getField()[y][x] = "☑";
                System.out.println("Перва палуба записана");
                field.print();
                String coordinates2 = sc.nextLine();
                int x1 = coordinatesX(coordinates2);
                int y1 = coordinatesY(coordinates2);
                if(mainTest(y1,x1,field) == true ){
               field.getField()[y1][x1] = "☑";
                    System.out.println("Готово");
                    entryShip(field);
                    field.print();
                break;
                }
                System.out.println("Вторая палуба не зашла, давай заново");
                field.clearField();
                field.print();
            } else
                System.out.println(("Давай заново, чето нето"));
        }
    }
}
