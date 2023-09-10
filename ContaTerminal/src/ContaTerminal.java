import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Por favor, digite o numero da conta");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Por favor, digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome completo");
        String nomeCompleto = scanner.next();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }

}