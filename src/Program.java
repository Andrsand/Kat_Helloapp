import java.math.BigInteger;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        printArray(new int[]{});
    }

    public static void printArray(int[] numbers) {
        if (numbers.length == 0) {
            System.out.print("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < numbers.length - 1; i++) {
                System.out.print(numbers[i] + ", ");
            }
            System.out.print(numbers[numbers.length - 1] + "]");
        }

    }
}






