package Day6.Task2;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane("Boing", 2014, 48, 30);
        plane.info();
        plane.fillUp(plane, 300);
        plane.info();


    }
}
