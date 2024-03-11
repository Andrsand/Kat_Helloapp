public class Program {
    public static void main(String[] args) {
        charExpression(1);
        }
    public static void charExpression(int a) {
        int sl = (int) '\\' + a;
        char symbol = (char) sl;
        System.out.println(symbol);
    }
}






