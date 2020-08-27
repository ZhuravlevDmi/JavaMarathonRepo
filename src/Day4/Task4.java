package Day4;
import java.util.Random;

/**
 4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 Найти максимум среди сумм трех соседних элементов.
 Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.

 */
public class Task4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int max = Integer.MIN_VALUE;
        int maxRes = 0;
        int index = 0;
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10001);
        }
        for (int i = 2; i < arr.length ; i++) {
            maxRes = arr[i] + arr[i - 1] + arr[i - 2];
            if(maxRes > max){
                max = maxRes;
                index = i - 2;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
