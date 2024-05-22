public class SimulacaoJuros {
    private double principal;
    private double taxaJuros;
    private int periodos;

    public SimulacaoJuros(double principal, double taxaJuros, int periodos) {
        this.principal = principal;
        this.taxaJuros = taxaJuros;
        this.periodos = periodos;
    }

    public double calcularJurosSimples() {
        return principal * (taxaJuros / 100) * periodos;
    }

    public double calcularJurosCompostos() {
        return principal * Math.pow(1 + (taxaJuros / 100), periodos) - principal;
    }

    public void exibirResultado() {
        System.out.println("\n ------------------------------------------ \nSimulação de Juros \n");
        System.out.println("Principal: " + principal);
        System.out.println("Taxa de Juros: " + taxaJuros + "%");
        System.out.println("Períodos: " + periodos);
        System.out.println("Juros Simples: " + calcularJurosSimples());
        System.out.println("Juros Compostos: " + calcularJurosCompostos());
    }
}

