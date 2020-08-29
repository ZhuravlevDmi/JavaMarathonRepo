package Day6.Task1;

public class MotorBike {
    private int yearManufacture;
    private String color;
    String model;

    void info(){
        System.out.println("Это мотоцикл");
    }
    int ageDifference(int year){
        return year - yearManufacture;
    }

    public MotorBike(int yearManufacture, String color, String model) {
        this.yearManufacture = yearManufacture;
        this.color = color;
        this.model = model;
    }
}
