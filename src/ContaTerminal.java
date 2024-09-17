import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criar um objeto Scanner para leitura dos dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        // Limpar o buffer do scanner para ler a próxima entrada corretamente
        scanner.nextLine();

        // Solicitar e ler a agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();


        // Solicitar e ler o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        

        // Solicitar e ler o saldo
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Fechar o scanner
        scanner.close();

        // Exibir a mensagem formatada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
