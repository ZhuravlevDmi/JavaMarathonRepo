package Day8.Task2;

public class Plane {
    private String manufacturer;
    private int yearManufacture;
    private int length;
    private int weight;
    private int tankVolume = 0;

    public Plane(String manufacturer, int yearManufacture, int length, int weight) {
        this.manufacturer = manufacturer;
        this.yearManufacture = yearManufacture;
        this.length = length;
        this.weight = weight;
    }

    void info(){
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + yearManufacture +
                ", длина: " + length + ", вес: " + weight + " , объем топлива в баке: " + tankVolume);
    }

    @Override
    public String toString() {
        return "Изготовитель: " + manufacturer + ", год выпуска: " + yearManufacture +
                ", длина: " + length + ", вес: " + weight + " , объем топлива в баке: " + tankVolume;
    }

    void fillUp(Plane p, int Volume){
        p.setTankVolume(p.tankVolume +Volume);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
