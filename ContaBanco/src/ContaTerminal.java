import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.\n",
                nomeCliente, agencia, numeroConta, saldo);

        scanner.close();

    }
}
