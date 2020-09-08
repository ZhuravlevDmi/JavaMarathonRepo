package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("shoes.csv");
        File file1 = new File("shoesFile");

        Scanner sc = new Scanner(file);
        PrintWriter pw = new PrintWriter(file1);

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] shoesArr = line.split(";");
            if(shoesArr[2].equals("0")){
                pw.println(line);
            }
        }
        pw.close();
    }
}
