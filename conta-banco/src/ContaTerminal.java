import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int conta = scanner.nextInt();
        
        System.out.println("Digite o número da agencia: ");
        String agencia = scanner.next();

        System.out.println("Nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é, " + agencia + " conta, " + conta + " e seu saldo, " + saldo + " ja está disponivel para saque!" );












    }
}
