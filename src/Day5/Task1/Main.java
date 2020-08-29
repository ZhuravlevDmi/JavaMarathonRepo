package Day5.Task1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearManufacture(2005);
        car1.setColor("White");
        car1.setModel("Corolla");

        System.out.println("Год выпуска: " + car1.getYearManufacture());
        System.out.println("Цвет автомобиля: " + car1.getColor());
        System.out.println("Модель автомобиля: " + car1.getModel());
    }
}
