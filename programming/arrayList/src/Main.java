import java.util.ArrayList; // Объязательно подключить библеотеку
import java.util.Scanner; // Объязательно подключить библеотеку

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Подключение сканера

        ArrayList<String> Strings = new ArrayList<String>(); // Подключение ArrayList с типом данных String
        ArrayList<Integer> Intg = new ArrayList<>(); // Подключение ArrayList с типом данных int

        /*Добавление занчений в ArrayList*/

        System.out.println("Input string text: ");
        Strings.add(scan.nextLine()); // Добавлениеинформации в list с типом данный String, через scanner.nextLine, так как String принемает только текстовые значения
        System.out.println("Input int number: ");
        Intg.add(scan.nextInt()); // Добавлениеинформации в list с типом данный int, через scanner.nextInt, так как int принемает только целочисленные значения

        /*Удаление знаяений из List*/
        Strings.remove(scan.nextLine());
        Intg.remove(scan.nextInt());

        System.out.println("Name: " + Strings); // Вывод всех добавленных значений в ArrayList<String>
        System.out.println("Year: " + Intg); // Вывод всех добавленных значений в ArrayList<Integer>

    }
}