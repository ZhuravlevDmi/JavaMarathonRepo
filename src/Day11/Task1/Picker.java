package Day11.Task1;



public class Picker implements Worker{
    private int salary;
    Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }
    @Override
    public void bonus() {
        if (warehouse.getCountOrder() >= 1500){
            salary = salary * 3;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

