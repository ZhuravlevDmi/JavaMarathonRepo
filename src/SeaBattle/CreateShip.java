package SeaBattle;

import org.w3c.dom.ls.LSOutput;

public interface CreateShip {
    //в утиль
//    void addHaloShip(Field field);
    void addShip(Field field);
    //в утиль
//    default boolean checkHalo(int y, int x, Field field) {
//        try {
//            boolean flag = false;
//            if(field.getField()[y][x] != "\uD83D\uDEE5" &&
//                    field.getField()[y - 1][x - 1] != "\uD83D\uDFE6" &&
//                    field.getField()[y - 1][x] != "\uD83D\uDFE6" &&
//                    field.getField()[y][x - 1] != "\uD83D\uDFE6" &&
//                    field.getField()[y][x + 1] != "\uD83D\uDFE6" &&
//                    field.getField()[y + 1][x] != "\uD83D\uDFE6" &&
//                    field.getField()[y + 1][x + 1] != "\uD83D\uDFE6" &&
//                    y > 0 && y < 11 && x > 0 && x < 11){
//                flag = true;
//            }
//            return flag;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//    default void entryShip(Field field){
//        for (int i = 0; i < field.getField().length; i++) {
//            for (int j = 0; j < field.getField().length; j++) {
//                if(field.getField()[i][j] == "☑")
//                    field.getField()[i][j] = "\uD83D\uDEE5";
//            }
//        }
//    }
//
//
//    default boolean checkShip(int y, int x, Field field) {
//        try {
//            boolean flag = false;
//            if(field.getField()[y][x] != "\uD83D\uDEE5" &&
//                    field.getField()[y - 1][x - 1] != "\uD83D\uDEE5" &&
//                    field.getField()[y - 1][x] != "\uD83D\uDEE5" &&
//                    field.getField()[y][x - 1] != "\uD83D\uDEE5" &&
//                    field.getField()[y][x + 1] != "\uD83D\uDEE5" &&
//                    field.getField()[y + 1][x] != "\uD83D\uDEE5" &&
//                    field.getField()[y + 1][x + 1] != "\uD83D\uDEE5" &&
//                    field.getField()[y - 1][x + 1] != "\uD83D\uDEE5" &&
//                    field.getField()[y + 1][x - 1] != "\uD83D\uDEE5" &&
//                    y > 0 && y < 11 && x > 0 && x < 11){
//                flag = true;
//            }
//            System.out.println("Есть контакт checkShip");
//            return flag;
//        } catch (Exception e) {
//            System.out.println("Сбой checkShip");
//            return false;
//        }
//    }

//    default boolean checkSquare(Field field) {
//        boolean flag = true;
//        for (int i = 0; i < field.getField().length -1; i++) {
//            for (int j = 0; j < field.getField().length - 1; j++) {
//                if(field.getField()[i][j] == "☑" &&
//                        field.getField()[i][j + 1] == "☑" &&
//                        field.getField()[i + 1][j] == "☑" &&
//                        field.getField()[i + 1][j + 1] == "☑"){
//                    flag = false;
//                    System.out.println("Квадрат запидрил");
//                }
//            }
//        }
//        System.out.println(flag);
//        return flag;
//    }
    //в утиль
//    default  boolean checkDeck(int y, int x, Field field) {      ????????????????
//        try {
//            boolean flag = false;
//            if(field.getField()[y][x] != "\uD83D\uDEE5" || field.getField()[y][x] != "☑"&&
//                    field.getField()[y - 1][x - 1] != "\uD83D\uDEE5" &&
//                    field.getField()[y - 1][x + 1] != "\uD83D\uDEE5" &&
//                    field.getField()[y + 1][x - 1] != "\uD83D\uDEE5" &&
//                    field.getField()[y + 1][x + 1] != "\uD83D\uDEE5" &&
//                    (field.getField()[y - 1][x] != "\uD83D\uDEE5" || field.getField()[y - 1][x] == "☑") &&
//                    (field.getField()[y][x - 1] != "\uD83D\uDEE5" || field.getField()[y][x - 1] == "☑") &&
//                    (field.getField()[y + 1][x] != "\uD83D\uDEE5" || field.getField()[y + 1][x] == "☑") &&
//                    (field.getField()[y][x + 1] != "\uD83D\uDEE5" || field.getField()[y][x + 1] == "☑") &&
//                    y > 0 && y < 11 && x > 0 && x < 11){
//                flag = true;
//            }
//            return flag;
//        } catch (Exception e) {
//            return false;
//        }
//    }

//    default boolean checkDeckTest(int y, int x, Field field) {
//        try {
//            if(field.getField()[y][x] == "⬜" &&
//                    field.getField()[y - 1][x] == "☑" ||
//                    field.getField()[y][x - 1] == "☑" ||
//                    field.getField()[y + 1][x] == "☑" ||
//                    field.getField()[y][x + 1] == "☑") {
//                System.out.println("Есть checkDeskTest");
//                return true;
//            }
//            System.out.println("Сбой checkDeckTest");
//            return false;
//        } catch (Exception e) {
//            System.out.println("checkDeckTest ошбика!");
//            return false;
//        }
//    }
//    default boolean mainTest (int y, int x, Field field) {
//
//        if(checkDeckTest(y,x,field) == true && checkShip(y,x,field) == true)  {
//            System.out.println("Есть контакт mainTest");
//            return true;
//        }
//        return false;
//    }




}
