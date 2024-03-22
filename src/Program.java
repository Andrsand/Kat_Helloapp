import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arr;
        printOddNumbers(arr = new int[]{2, 4, 5, 6, 10, 15});
    }

    public static void printOddNumbers(int[] array) {
        if (array.length == 0) {
            System.out.println("");
            return;
        }

        boolean firstComma = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                if (firstComma) {
                    System.out.print(",");
                } else {
                    firstComma = true;
                }
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }
}

/*
Реализуй метод java который принимает массив и выводит в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести курсор на новую строку.После последнего числа на выводе не должно быть запятой.
Сигнатура метода такая: public static void printOddNumbers(int[] arr)
Метод должен быть реализован только с комощью обычных циклов или логических операторов.
Если на входе числа 3,5,20,8,7,3,100 то на выходе должно быть 3,5,7,3
*/





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






























