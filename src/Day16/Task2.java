package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        List<int[]> arrArr = new ArrayList<>();
        File file = new File("file1");
        File file1 = new File("file2");
        Scanner sc = new Scanner(file);
        PrintWriter pw = new PrintWriter(file);
        PrintWriter pw2 = new PrintWriter(file1);
        Random rd = new Random();
        for (int i = 0; i < 1000; i++) {
            pw.println(rd.nextInt(101));
        }
        pw.close();

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            Integer.parseInt(line);
        }
    }
}
