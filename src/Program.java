public class Program {
    public static void main(String[] args) {
        int[] firstArray = {1, 3, 7, 5};
        int[] secondArray = {8, 4, 2, 4};

        int[] mergedAndSortedArray = mergeAndSort(firstArray, secondArray);

        for (int num : mergedAndSortedArray) {
            System.out.print(num + " ");
        }
    }

    //метод - объединяет два массива и потом сортирует их
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        if (firstArray.length == 0 && secondArray.length == 0) { // сли первый массив и второй массив пустые, то вернет пустой массив
            return new int[]{};
        } else if (firstArray.length == 0) {  // если первый массив пустой, то сортирует и возвращает второй массив
            return sortArray(secondArray);   // sortArray - используем отдельный метод пузырьковой сортировки
        } else if (secondArray.length == 0) {  //если второй массив пустой, то сортирует и возвращает первый массив
            return sortArray(firstArray);
        } else {
            int[] finalArray = new int[firstArray.length + secondArray.length]; //иначе создает новый массив для объединения двух массивов
            int i = 0, j = 0, k = 0; //создает указатели для первого, второго и объединенного массива

            // циклы - на случай если из массивов - пустой. Этот блок кода в принципе - лишний
            while (i < firstArray.length && j < secondArray.length) { //  Wикл while - пока i меньше длины первого массива и j меньше длины второго массива
                if (firstArray[i] < secondArray[j]) {   // Если значение из первого массива меньше значения из второго массива, добавляем его в объединенный массив и увеличиваем i на 1
                    finalArray[k++] = firstArray[i++];
                } else {
                    finalArray[k++] = secondArray[j++];  // Иначе, добавляем значение из второго массива в объединенный массив и увеличиваем j на 1
                }
            }

            while (i < firstArray.length) {         // Добавляем оставшиеся элементы из первого массива в объединенный массив
                finalArray[k++] = firstArray[i++];
            }
            while (j < secondArray.length) {        // И оставшиеся элементы из второго массива
                finalArray[k++] = secondArray[j++];
            }

            return sortArray(finalArray);           // Возвращаем объединенный массив, отсортированный методом sortArray
        }
    }

    // метод сортировки массива способом пузырька
    // перебирает элементы массива и меняет их местами, если текущий элемент больше следующего
    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) { // После завершения внешнего цикла весь массив будет отсортирован
            for (int j = i + 1; j < array.length; j++) { //  После завершения внутреннего цикла все элементы до i-того будут отсортированы
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array; // Функция возвращает отсортированный массив
    }
}



























