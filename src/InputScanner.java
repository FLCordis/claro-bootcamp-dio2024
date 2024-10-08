import java.util.Locale;
import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome  = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome  = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade  = scanner.nextInt();

        System.out.println("Digite seu altura: ");
        double altura  = scanner.nextDouble();

        System.out.println("Seu nome é " + nome + " " + sobrenome + ", tem " + idade + " anos e " + altura + "cm de altura.");

        scanner.close();
    }
}
