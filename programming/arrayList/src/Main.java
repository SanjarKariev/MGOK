import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> Strings = new ArrayList<String>();
        ArrayList<Integer> Intg = new ArrayList<>();

        Strings.add(scan.nextLine());
        Intg.add(scan.nextInt());

        System.out.println("Name: " + Strings);
        System.out.println("Year: " + Intg);

    }
}