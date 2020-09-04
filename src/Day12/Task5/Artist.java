package Day12.Task5;

public class Artist {
    private String name;
    private int age;

    @Override
    public String toString() {
        return name;
    }

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
