public class ContaCorrente extends Conta {
    private double taxaManutencao = 10;

    public ContaCorrente(String titular) {
        super(titular);
    }

    public void cobrarTaxa() {
        if (saldo >= taxaManutencao) {
            saldo -= taxaManutencao;
            System.out.println("Taxa de manutenção de R$ " + taxaManutencao + " cobrada.");
        } else {
            System.out.println("Saldo insuficiente para cobrar taxa de manutenção.");
        }
    }
}
