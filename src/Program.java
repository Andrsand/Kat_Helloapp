import java.math.BigInteger;

public class Program {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}







