package Day6.Task3;

import java.util.Random;

public class Teacher {
    Random rd = new Random();
    private String surname;
    private String subject;


    void rates(Student s){
        int estimation = rd.nextInt(4) + 2;
        String estimationStr = null;
        if(estimation == 5) estimationStr = "Отлично";
        if(estimation == 4) estimationStr = "Хорошо";
        if(estimation == 3) estimationStr = "Удовлетворительно";
        if(estimation == 2) estimationStr = "Неудовлетворительно";

        System.out.println("Преподаватель " + surname + " оценил студента " +
                s.getSurname() + " по предмету " + subject + " на оценку " + estimationStr);
    }

    public Teacher(String surname, String subject) {
        this.surname = surname;
        this.subject = subject;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
