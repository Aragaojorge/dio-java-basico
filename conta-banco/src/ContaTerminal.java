import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, digite o número da sua agência: ");
            String agencia = scanner.next();

            scanner.nextLine();
            
            System.out.print("Por favor, digite o número da sua conta: ");
            int numero = scanner.nextInt();
            
            System.out.print("Por favor, digite o seu nome: ");
            String nomeCliente = scanner.next();

            scanner.nextLine();
            
            System.out.print("Por favor, digite o seu saldo: ");
            double saldo = scanner.nextDouble();
            
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                    "sua agência é " + agencia +
                    ", conta " + numero +
                    " e seu saldo " + saldo + " já está disponível para saque.");
        } catch(InputMismatchException e) {
            System.err.println("O número da conta e do seu saldo devem ser apenas números!");
        }
    }
}
