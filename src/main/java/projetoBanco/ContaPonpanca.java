package projetoBanco;

public class ContaPonpanca extends Conta{


    public ContaPonpanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfoComuns();
    }
}
