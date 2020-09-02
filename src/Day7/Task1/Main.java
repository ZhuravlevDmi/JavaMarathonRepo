package Day7.Task1;

public class Main {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Boing",2015,35,35);
        Plane plane2 = new Plane("Tu-124",2005,35,41);

        Plane.lenghtComparsion(plane1,plane2);
    }
}
