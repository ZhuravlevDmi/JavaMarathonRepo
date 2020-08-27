package Day4;

import java.util.Random;

/**
 3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
 Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
 В консоль вывести индекс строки, сумма чисел в которой максимальна.
 Если таких строк несколько, вывести индекс последней из них.
 */
public class Task3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int index = 0;
        int sum = Integer.MIN_VALUE;

        int[][] arr = new int[12][8];

        for (int i = 0; i < arr.length; i++) {
            int sumString = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rd.nextInt(51);
                sumString += arr[i][j];
            }
            if(sum < sumString){
                sum = sumString;
                index = i;
            }
        }
        System.out.println(index);
    }
}
