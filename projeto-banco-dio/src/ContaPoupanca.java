public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("\n ----------------------------------\nExtrato Conta Poupança");
        super.imprimirInfosComun();
    }
}
