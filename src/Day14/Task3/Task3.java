package Day14.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjectList());
    }
    public static List<Person> parseFileToObjectList(){
        List<Person> list = new ArrayList<>();
        try {
            File file = new File("people");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();

                list.add(new Person(person[0], Integer.parseInt(person[1])));

            }
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch(IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        return null;

    }
}
