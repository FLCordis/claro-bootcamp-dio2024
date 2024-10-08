import java.util.InputMismatchException;

public class TryingCatch {
    public static void main(String[] args) {
        try {
            String nome = args[0];
            String sobrenome = args[1];
            int idade = Integer.valueOf(args[2]);
            double altura = Double.valueOf(args[3]);

            System.out.println("Olá, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("E " + altura + "cm de altura.");
        } catch (InputMismatchException e) {
            System.out.println("Os valores inseridos não foram no formato certo! Tente novamente.");
        }
    }
}
