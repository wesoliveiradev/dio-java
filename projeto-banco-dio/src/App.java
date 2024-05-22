import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente Wes = new Cliente();
        Wes.setNome("Wesley");
        Conta cc = new ContaCorrente(Wes);
        Conta poupanca = new ContaPoupanca(Wes);

    //Depósito
        System.out.println("Deseja fazer um depósito ? S/N\n");
        String op = sc.next().toUpperCase();

        while (!op.equals("S") & !op.equals("N")){
            System.out.println("Desculpe! Não entendi a sua escolha!");
            System.out.println("Deseja fazer um depósito ? S/N\n");
            op = sc.next().toUpperCase();
        }
        if (op.equals("S")){
            System.out.println("Qual o valor? ");
            double valor = sc.nextDouble();
            cc.depositar(valor);

            System.out.println("Deseja ver o extrato? S/N\n");
            op = sc.next().toUpperCase();

            while (!op.equals("S") & !op.equals("N")){
                System.out.println("Desculpe, não entendi a sua escolha!");
                System.out.println("Deseja imprimir o extrato ? S/N\n");
                op = sc.next().toUpperCase();
            }
            if (op.equals("S")){
                cc.imprimirExtrato();
            }
        }

    //Transferência
        System.out.println("Deseja fazer uma transferência para poupança ? S/N\n");
        op = sc.next().toUpperCase();

        while (!op.equals("S") & !op.equals("N")){
            System.out.println("Desculpe! Não entendi a sua escolha!");
            System.out.println("Deseja fazer uma transferência para poupança ? S/N\n");
            op = sc.next().toUpperCase();
        }
        if (op.equals("S")){
            System.out.println("Qual o valor? ");
            double valor = sc.nextDouble();
            cc.transferir(valor, poupanca);
        }

    //Pagar Contas
        System.out.println("Deseja pagar uma conta? S/N\n");
        op = sc.next().toUpperCase();

        while (!op.equals("S") & !op.equals("N")){
            System.out.println("Desculpe! Não entendi a sua escolha!");
            System.out.println("Deseja pagar uma conta? S/N\n");
            op = sc.next().toUpperCase();
        }
        if (op.equals("S")){
            System.out.println("Qual valor da conta a ser paga? ");
            double valorConta = sc.nextDouble();
            cc.pagarConta(valorConta);
        }


    //Simulação de juros Poupança
        System.out.println("Deseja fazer uma simulação de juros ? S/N\n");
        op = sc.next().toUpperCase();

        while (!op.equals("S") & !op.equals("N")){
            System.out.println("Desculpe, não entendi a sua escolha!");
            System.out.println("Deseja fazer uma simulação de juros ? S/N\n");
            op = sc.next();
        }
        if (Objects.equals(op, "S")) {
            SimulacaoJuros simulacao = new SimulacaoJuros(poupanca.getSaldo(), 5, 10);
            simulacao.exibirResultado();
        }

    //Extrato
        System.out.println("Deseja imprimir o extrato? S/N\n");
        op = sc.next().toUpperCase();
        while (!op.equals("S") & !op.equals("N")){
            System.out.println("Desculpe, não entendi a sua escolha!");
            System.out.println("Deseja imprimir o extrato ? S/N\n");
            op = sc.next().toUpperCase();
        }
        if (op.equals("S")){
            System.out.println("Qual extrato deseja imprimir ? \n 1 - Conta Corrente \n 2 - Conta Poupança ");
            int opExtrato = sc.nextInt();
            switch (opExtrato){
                case 1:
                    cc.imprimirExtrato();
                    break;
                case 2:
                    poupanca.imprimirExtrato();
                    break;
                default:
                    System.out.println("Escolha uma opção");
            }
        }

        System.out.println("Deseja imprimir outro extrato? S/N\n");
        op = sc.next().toUpperCase();
        while (!op.equals("S") & !op.equals("N")){
            System.out.println("Desculpe, não entendi a sua escolha!");
            System.out.println("Deseja imprimir outro extrato ? S/N\n");
            op = sc.next().toUpperCase();
        }
        if (op.equals("S")){
            System.out.println("Qual extrato deseja imprimir ? \n 1 - Conta Corrente \n 2 - Conta Poupança ");
            int opExtrato = sc.nextInt();
            switch (opExtrato){
                case 1:
                    cc.imprimirExtrato();
                case 2:
                    poupanca.imprimirExtrato();
            }
        }
    }
}