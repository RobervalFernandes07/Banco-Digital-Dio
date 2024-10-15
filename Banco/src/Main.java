//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("João");
        ContaPoupanca cp = new ContaPoupanca("Maria");

        cc.depositar(1000);
        cp.depositar(500);

        cc.sacar(200);
        cc.transferir(100, cp);

        cp.aplicarRendimento();
        cc.cobrarTaxa();

        System.out.println("Saldo Conta Corrente de João: R$ " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança de Maria: R$ " + cp.getSaldo());
    }
}
