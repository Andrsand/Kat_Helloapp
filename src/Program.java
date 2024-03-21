import java.util.Arrays;

public class Program {
        public static void main(String[] args) {
            int[] numbers = {1, 5, 2, 3, 4, 5, 5};
            int[] middle1 = getArrayMiddle(numbers);
            System.out.println(Arrays.toString(middle1));
        }
        public static int[] getArrayMiddle(int[] numbers) {
            if (numbers.length == 0) {
                return new int[0];
            }
            if (numbers.length % 2 == 0) {
                int[] result = new int[2];
                System.arraycopy(numbers, numbers.length / 2 - 1, result, 0, 2);
                return result;
            } else {
                int[] result = new int[1];
                System.arraycopy(numbers, numbers.length / 2, result, 0, 1);
                return result;
            }
        }
    }







    /*
    Создай метод java который принимает массив произвольной длины. Необходимо вернуть центральную часть массива.
    Причем если массив четной длины, нужно вернуть массив из двух элементов, если нечетной — из одного элемента.
    Если метод принимает числа: 1, 5, 2, 17 то должен вернуть массив с числами 5, 2.

    Если метод принимает числа: 14, 16, 3 то должен вернуть массив с числом 16.

    Сигнатура метода тo дoлжна быть такая: public static int[] getArrayMiddle(int[] numbers)
    Метод должен быть создан с помощью Arrays или System.arrayCopy.

    Всеравно не работает.
    Иправь, что бы работал ка этот метод но с использованием Arrays.copyOfRange

    public static int[] getArrayMiddle(int[] numbers) {
    int length = numbers.length;
    if (numbers.length == 0) {
        return new int[0];
    }
    if (length % 2 == 0) {
        return new int[]{numbers[length / 2 - 1], numbers[length / 2]}; // 2-1 - вывод индекса - 1 а дальше по аналогии...
    } else {
        return new int[]{numbers[length / 2]};
    }
}



    */






























