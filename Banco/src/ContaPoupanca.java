
public class ContaPoupanca extends Conta {
    private double rendimento = 0.02; // 2% de rendimento

    public ContaPoupanca(String titular) {
        super(titular);
    }

    public void aplicarRendimento() {
        saldo += saldo * rendimento;
        System.out.println("Rendimento de 2% aplicado. Novo saldo: R$ " + saldo);
    }
}
