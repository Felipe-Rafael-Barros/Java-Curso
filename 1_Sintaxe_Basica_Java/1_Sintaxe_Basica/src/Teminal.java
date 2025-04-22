import java.util.Locale;
import java.util.Scanner;

public class Teminal {
    public static void main(String[] args) {
        System.err.println("Primeiro teste");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.err.println("Qual seu nome?");
        String Nome = scanner.nextLine();
        System.err.println("Prazer em te conhecer, " + Nome);
        scanner.close();



    }
}
