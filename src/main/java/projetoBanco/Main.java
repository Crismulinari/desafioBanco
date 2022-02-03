package projetoBanco;

public class Main {
    public static void main(String[] args){
        Cliente cristiano = new Cliente();
        cristiano.setNome("Cristiano");

        Conta cc = new ContaCorrente(cristiano);
        cc.depositar(100);

        Conta cp = new ContaPonpanca(cristiano);
        cc.transferir(100, cp);

        cc.imprimirInfoComuns();
        cp.imprimirInfoComuns();

    }
}
