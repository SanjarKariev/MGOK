import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {2, 1, 4, 8, 7, 5, 6, 3}; // Одномерный не сортированный массив
        System.out.println(Arrays.toString(unsortedArray)); // Вывод не отсортированного массива
        choiceSort(unsortedArray); // Вызов метода choiceSort и указываем unsortArray указывая что именно нужно отсартировать
    }
    public static void choiceSort(int[] arrayToSort){ // Создаём метод в котором будет всё сортироваться и сразу задаём название массива
        /*1. Проходим по массиву
          2. Находим минимальный элемент
          3. Меняем местами первый и миннимальный элемент
          4. Повторяем пока не пройдём по всему массиву*/
        int indexMin; // Создаём переменную в которой будет храниться миннимальное значение массива
        for (int index = 0; index < arrayToSort.length - 1; index++) { // Цикл проходит по всему массиву и сравнивает кроме последнего, поэтому мы пишем -1
            indexMin = index; // Приравниваем значения из общего массива к минемальному, что бы было с чем сравнивать
            for (int indexToScan = index; indexToScan < arrayToSort.length; indexToScan++) { // Проходим по массиву и сравниваем
                if(arrayToSort[indexMin] > arrayToSort[indexToScan]){ // Создаём условие в котором проверяется, если значение в перемменой indexMin больше чем в indexToScan, то
                    indexMin = indexToScan; // Меняем значения местами
                }
            }
            int temp = arrayToSort[index]; // Создаём новую временную переменную в которой храним наши отсортированные данные
            arrayToSort[index] = arrayToSort[indexMin]; // Сравниваем наши массивы
            arrayToSort[indexMin] = temp; // Отсартированный массив записываем в temp
        }
        System.out.println(Arrays.toString(arrayToSort)); //Вывод массива с помощью вспомогательной функции Arrays
    }
}