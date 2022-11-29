import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {2, 1, 4, 8, 7, 5, 6, 3}; // Одномерный не сортированный массив
        System.out.println("Не отсортированный массив: " + Arrays.toString(unsortedArray)); // Вывод не отсортированного массива
        bubbleSort(unsortedArray); // Вызов метода bubbleSort и указываем unsortArray указывая что именно нужно отсартировать
    }

    public static void bubbleSort(int [] arrToSort){ // Метод который будет производить сортировку а также получает на входе массив

        /*  1. Нужно пройти по массиву
            2. Сравинить 2 соседних элемента
            3. Повторяем пока массив не будет отсортирован */
        int changeCounter; // Переменная которая будет служить счётчиком

        do {
            changeCounter = 0;

            for (int index = 0; index < arrToSort.length - 1; index++) { //Цикл который повтаряет наши действия пока массив не будет отсортирован
                if (arrToSort[index] > arrToSort[index + 1]){ // условие на проверку большеле левое значение чем правое
                    int temp = arrToSort[index]; // Переменная в которую мы записываем левое значение нашего массива
                    arrToSort[index] = arrToSort[index + 1]; // Меняем местами
                    arrToSort[index + 1] = temp; // Записываем изменённые значения в нашу переменную
                    changeCounter++; // После того как отработал наше условие мы прибавляем 1 к нашему счётчику
                }
            }

        } while (changeCounter > 0); // Повторяем пока наш счёчик больше 0
        System.out.println("Отсортированный массив: " + Arrays.toString(arrToSort)); // Ввод отсортированного массива
    }
}