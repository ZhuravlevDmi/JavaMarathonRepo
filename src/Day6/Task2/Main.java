package Day6.Task2;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane("Boing", 2014, 48, 30);
        plane.fillUp(plane, 300);
        plane.info();
        plane.setYearManufacture(2015);
        plane.setLength(50);
        plane.fillUp(plane,50);
        plane.info();
    }

}
