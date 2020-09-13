package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1");
        File file2 = new File("file2");
        Scanner sc = new Scanner(file1);
        Scanner sc2 = new Scanner(file2);
        PrintWriter pw1 = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);
        Random rd = new Random();
        for (int i = 0; i < 1000; i++) {
            pw1.println(rd.nextInt(101));
        }
        pw1.close();
        int counter = 0;
        int sum = 0;
        double result;
        while(sc.hasNextLine()){
            sum += Integer.parseInt(sc.nextLine());
            counter++;
            if(counter == 20){
                result = (double)sum / counter;
                pw2.println(result);
                sum = 0;
                counter = 0;
            }
        }
        pw2.close();
        double itvet = 0;
        int counter1 = 0;
        while(sc2.hasNextLine()){
            itvet += Double.parseDouble(sc2.nextLine());
            counter1++;
        }
        System.out.println(itvet / counter1);
        System.out.println((int)(itvet / counter1));

    }
}
