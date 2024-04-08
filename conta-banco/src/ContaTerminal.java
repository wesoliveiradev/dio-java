import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, insira o número da Agência: ");
        agencia = sc.nextLine();

        System.out.println("Agora digite o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe o seu nome completo: ");
        nomeCliente = sc.nextLine();        

        System.out.println("Informe seu saldo inicial: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo R$:" + saldo + " já está disponível para saque!");

        sc.close();
    }
}
