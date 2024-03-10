

public class Program {
    public static void main(String[] args) {
        System.out.println(fillArray(4));
    }

    static int[] fillArray(int x) {
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = i;
        }
        return array;
    }
}





