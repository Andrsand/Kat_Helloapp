import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //createSubArrayBetween(new int[]{1, 3, 5, 6, 9, 11, 24}, 4, 10);

        int[] res = getSubArrayBetween(new int[]{1, 3, 5, 6, 9, 11, 24}, 3, 24);
        System.out.println(Arrays.toString(res));
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        return java.util.stream.IntStream.of(numbers).filter(n -> start <= n && n <= end).toArray();
    }

}




