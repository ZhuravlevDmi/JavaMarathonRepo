package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10.
 Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
 а) Длине массива
 б) Количестве чисел больше 8
 в) Количестве чисел равных 1
 г) Количестве четных чисел
 д) Количестве нечетных чисел
 е) Сумме всех элементов массива
 */

public class Task1 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int moreEight = 0;
        int equallyOne = 0;
        int even = 0;
        int notEven = 0;
        int sumArr = 0;

        System.out.println("Введите число n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(11);
            if(arr[i] > 8) moreEight++;
            if(arr[i] == 1) equallyOne++;
            if(arr[i] % 2 == 0) even++;
            if(arr[i] % 2 != 0) notEven++;
            sumArr += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + moreEight);
        System.out.println("Количество чисел равных 1: " + equallyOne);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + notEven);
        System.out.println("Сумма всех элементов массива: " + sumArr);
    }
}
