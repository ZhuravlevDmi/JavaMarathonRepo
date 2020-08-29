package Day6.Task1;

public class Main {
    public static void main(String[] args) {
        CarMain car1 = new CarMain();
        car1.setYearManufacture(2005);
        car1.setColor("White");
        car1.setModel("Corolla");

        car1.info();
        System.out.println(car1.ageDifference(2020));


        System.out.println("Год выпуска: " + car1.getYearManufacture());
        System.out.println("Цвет автомобиля: " + car1.getColor());
        System.out.println("Модель автомобиля: " + car1.getModel());
    }
}
