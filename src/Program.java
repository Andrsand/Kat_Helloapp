import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 9, 11, 24};
        int[] result = getSubArrayBetween(numbers, 2, 15);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                count++;
            }
        }

        int[] result = new int[count];
        int in = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                result[in] = numbers[i];
                in++;
            }
        }

        return result;
    }
}









