package Day11.Task1;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        for (int i = 0; i < 1500; i++) {
            picker.doWork();
        }
        picker.bonus();
        System.out.println(warehouse);
        System.out.println("Зарплта сборщика: " + picker.getSalary());

        System.out.println();

        for (int i = 0; i < 1000; i++) {
            courier.doWork();
        }
        courier.bonus();
        System.out.println(warehouse);
        System.out.println("Зарплта курьера: " + courier.getSalary());
    }
}
