package Day4;

import java.util.Random;

/**
 2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 Затем, используя циклы for each вывести:
 наибольший элемент массива
 наименьший элемент массива
 количество элементов массива, оканчивающихся на 0
 сумму элементов массива, оканчивающихся на 0

 Использовать сортировку запрещено.
 */

public class Task2 {
    public static void main(String[] args) {
        Random rd = new Random();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int endsZero = 0;
        int sumEndZero = 0;
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10001);
        }
        for(int num : arr){
            if(num > max) max = num;
            if(num < min) min =num;
            if(num % 10 == 0 || num == 0) {
                sumEndZero += num;
                endsZero++;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + endsZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumEndZero);
    }
}
