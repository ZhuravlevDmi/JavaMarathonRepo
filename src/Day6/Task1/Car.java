package Day6.Task1;

public class Car {
    private int yearManufacture;
    private String color;
    String model;
    void info(){
        System.out.println("Это автомобиль");
    }

    int ageDifference(int year){
        return year - yearManufacture;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
