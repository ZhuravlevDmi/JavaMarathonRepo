package Day9.Task1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Dmitrii","GO-092");
        Teacher teacher = new Teacher("Olga","physick");
        System.out.println(student.getStudyGroup());
        System.out.println(teacher.getSubject());
        student.printInfo();
        teacher.printInfo();
    }
}
