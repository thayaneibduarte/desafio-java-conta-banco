
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja Bem-Vindo ao seu banco digital!");
        System.out.println("Para início dos procedimentos, por gentileza digite seu nome completo e clique em (ENTER):");
        String nomeCliente = scanner.nextLine();

        System.out.println("Insira o número de sua Agência e aperte (ENTER):");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Novamente com o número de sua Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora para finalização das operações, me diga o Saldo que deseja retirar no dia de hoje:");
        double saldo = scanner.nextDouble();

        scanner.close();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %d, conta %d, e seu saldo R$ %.2f já está disponível para saque!%n", 
                  nomeCliente, numeroAgencia, numeroConta, saldo);
}
}
