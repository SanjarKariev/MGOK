import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        logic();
    }
    public static void menu(){
        System.out.println("Выберите тип операции:"
                + "\n" + "1. Сложение"
                + "\n" + "2. Вычитание"
                + "\n" + "3. Умножение"
                + "\n" + "4. Деление"
                + "\n" + "Выберите операцию -> ");

    }
    public static void logic(){
        int a = scanner.nextInt();
        System.out.println("Введите первое значение: ");
        int b = scanner.nextInt();
        System.out.println("Введите второе значение: ");
        int c = scanner.nextInt();

        switch (a){
            case 1:
                int sum = b + c;
                System.out.println("Ответ: " + sum);
                break;
            case 2:
                int raz = b - c;
                System.out.println("Ответ: " + raz);
                break;
            case 3:
                int umn = b * c;
                System.out.println("Ответ: " + umn);
                break;
            case 4:
                if (c == 0) {
                    System.out.println("!Делить на 0 нельзя!"
                            + "\n" + "Попробуйте снова");
                    menu();
                    logic();
                }
                int del = b / c;
                System.out.println("Ответ: " + del);
        }
    }
}