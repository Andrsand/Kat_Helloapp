import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        int[] numbers = {0};
        int[] middle = getArrayMiddle(numbers);
        for (int num : middle) {
            System.out.print(num + " ");
        }

    }

    public static int[] getArrayMiddle(int[] numbers) {
        int length = numbers.length;
        if(numbers.length == 0){
            return new int[0];
        }
        if (length % 2 == 0) {
            return new int[]{numbers[length / 2 - 1], numbers[length / 2]}; // 2-1 - вывод индекса - 1 а дальше по аналогии...
        } else {
            return new int[]{numbers[length / 2]};
        }
    }
}









