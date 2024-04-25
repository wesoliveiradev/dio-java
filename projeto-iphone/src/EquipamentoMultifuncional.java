// Classe que representa o equipamento multifuncional
public class EquipamentoMultifuncional extends Equipamento {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public void usarReprodutorMusical() {
        System.out.println("Abrir Reprodutor");
    }

    public void usarAparelhoTelefonico() {
        System.out.println("Abrir telefone");
    }

    public void usarNavegadorInternet() {
        System.out.println("Abrir Navegador");
    }
}
