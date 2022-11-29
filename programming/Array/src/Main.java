import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        array(); //Вызов метода в коттором у нас реализован одномерный массив и его вывод
        twoArray(); //Вызов метода в коттором у нас реализован двумерный массив и его вывод
    }
    public static void array(){
        int [] arr = {1, 3, 5, 7, 2, 4, 6, 9, 8, 0}; // Создали статичный однамерный массив
        System.out.println("Одномерный массив arr: " + Arrays.toString(arr)); //Вывод одномерного массива через вспомогательный метод Arrays
    }
    public static void twoArray(){
        int [][] twoArr= new int [3][4]; // Создаём двумерный массив, а так же задаём диапозон
        twoArr[0][0] = 5;//записали значение 5 в ячейку на пересечении нулевой строки и нулевого столбца
        twoArr[0][1] = 7; //записали значение 7 в ячейку на пересечении нулевой строки и первого столбца
        twoArr[0][2]  = 3;
        twoArr[0][3] = 17;
        twoArr[1][0] = 7;
        twoArr[1][1] = 0;
        twoArr[1][2] = 1;
        twoArr[1][3] = 12;
        twoArr[2][0] = 8;
        twoArr[2][1] = 1;
        twoArr[2][2] = 2;
        twoArr[2][3] = 3;
        System.out.println("Двухмерный массив twoArr:  " + Arrays.deepToString(twoArr)); //Вывод двумерного массива через вспомогательный метод Arrays
    }
}