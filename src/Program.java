public class Program {
    public static void main(String[] args) {
        System.out.println(getAgeDiff((byte) 20, (byte) 10));
    }

    public static byte getAgeDiff(byte age1, byte age2) {
        int sum;
        if (age1 < age2) {
            sum = age2 - age1;
        } else {
            sum = age1 - age2;
        }
        return (byte) sum;
    }
}






