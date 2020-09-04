package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carModel = new ArrayList<>();
        carModel.add("Lada");
        carModel.add("Toyota");
        carModel.add("BMW");
        carModel.add("Mercedes-Benz");
        carModel.add("Audi");

        printArr(carModel);

        carModel.add(3,"Opel");
        carModel.remove(0);

        printArr(carModel);

    }
    static void printArr(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
