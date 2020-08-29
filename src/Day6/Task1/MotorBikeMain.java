package Day6.Task1;

public class MotorBikeMain {
    public static void main(String[] args) {
        MotorBike motorBike = new MotorBike(2000,"Red", "Ural");
        motorBike.info();
        System.out.println(motorBike.ageDifference(2020));
    }
}
