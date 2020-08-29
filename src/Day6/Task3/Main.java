package Day6.Task3;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ivanova", "physic");
        Student student = new Student("Zhuravlev");

        teacher.rates(student);
    }
}
