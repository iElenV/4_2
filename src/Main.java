import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int [] arr = new int[30];
       int min = 0;
       int max = 0;

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = -70 + (int) (Math.random() * (120 + 1));
            if (arr [i] > max) {
              max = arr [i];
            }
            if (arr [i] < min) {
                min = arr [i];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальное значение " + max);
        System.out.println("Минимальное значение " + min);

    }
}