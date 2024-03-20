import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        int[] arr = {8, 4, 7, 8, 9, 0};
        arr = inverseArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    public static int[] inverseArray(int[] numbers) {
        int[] result = new int[numbers.length]; // присваиваем массиву равнозначную numbers длину
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            result[index] = numbers[i];
            index++;
        }
        return result;
    }

}









