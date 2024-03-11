import java.math.BigInteger;

import static java.lang.Math.sqrt;

public class Program {
    public static void main(String[] args) {
        charExpression(1);
        }
    public static char charExpression(int a) {
        int sl = (int) '\\' + a;
        char symbol = (char) sl;
        System.out.println(symbol);
        return symbol;
    }
}






