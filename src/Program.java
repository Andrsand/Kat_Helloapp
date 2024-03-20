import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        int[] firstArray = {};
        int[] secondArray = {1, 4, 3};

        int[] mergedAndSortedArray = mergeAndSort(firstArray, secondArray);

        for (int num : mergedAndSortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        if (firstArray.length == 0 && secondArray.length == 0) {
            return new int[]{};
        } else if (firstArray.length == 0) {
            return sortArray(secondArray);
        } else if (secondArray.length == 0) {
            return sortArray(firstArray);
        } else {
            int[] mergedArray = new int[firstArray.length + secondArray.length];
            int i = 0, j = 0, k = 0;

            while (i < firstArray.length && j < secondArray.length) {
                if (firstArray[i] < secondArray[j]) {
                    mergedArray[k++] = firstArray[i++];
                } else {
                    mergedArray[k++] = secondArray[j++];
                }
            }

            while (i < firstArray.length) {
                mergedArray[k++] = firstArray[i++];
            }
            while (j < secondArray.length) {
                mergedArray[k++] = secondArray[j++];
            }

            return sortArray(mergedArray);
        }
    }

    //сортировка массива методом пузырька
    private static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

//этот метод объединяет два массива и потом сортирует их
//если первый массив и второй массив пустые, то вернет пустой массив
//если первый массив пустой, то сортирует и возвращает второй массив
//если второй массив пустой, то сортирует и возвращает первый массив
//иначе создает новый массив для объединения двух массивов
//создает указатели для первого, второго и объединенного массива

// Объявляем цикл while, который будет выполняться, пока i меньше длины первого массива и j меньше длины второго массива
// Если значение из первого массива меньше значения из второго массива, добавляем его в объединенный массив и увеличиваем i на 1
// Иначе, добавляем значение из второго массива в объединенный массив и увеличиваем j на 1

// Далее добавляем оставшиеся элементы из первого массива в объединенный массив
// И оставшиеся элементы из второго массива

// Возвращаем объединенный массив, отсортированный функцией sortArray


// Этот код представляет собой сортировку массива методом пузырька
// Он перебирает элементы массива и меняет их местами, если текущий элемент больше следующего
// После завершения внутреннего цикла все элементы до i-того будут отсортированы
// После завершения внешнего цикла весь массив будет отсортирован
// Функция возвращает отсортированный массив

















