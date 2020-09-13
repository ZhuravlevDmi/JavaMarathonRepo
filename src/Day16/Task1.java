package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers");
        Scanner sc = new Scanner(file);
        double sum = 0;
       String line = sc.nextLine();
       String[] numbers = line.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            sum += Double.parseDouble(numbers[i]);
        }
        double result = sum / numbers.length;
        System.out.println(result);
        System.out.printf("%.3f", result);
        System.out.println("\n" + result);
    }
}
