import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Strings = new ArrayList<String>();
        ArrayList<Integer> Intg = new ArrayList<>();

        Strings.add("Foma");
        Strings.add("Foma");
        Intg.add(12);

        Strings.add("Anton");
        Intg.add(15);

        System.out.println("Name: " + Strings);
        System.out.println("Year: " + Intg);
        System.out.println(Strings.size());
        System.out.println(Intg.size());
    }
}