# Banco-Digital-Dio
Projeto usando POO em java.

# Banco - Sistema de Contas

Este projeto é uma solução orientada a objetos em Java que simula as funcionalidades de um banco que oferece aos seus clientes dois tipos de contas: **Corrente** e **Poupança**. As contas possuem funcionalidades de **depósito**, **saque** e **transferência** entre contas da própria instituição.

## Funcionalidades

- **Depósito**: Permite adicionar um valor ao saldo da conta.
- **Saque**: Permite retirar um valor do saldo da conta, se houver saldo suficiente.
- **Transferência**: Permite transferir um valor entre contas do mesmo banco.
- **Taxa de Manutenção**: Cobrança mensal para contas correntes.
- **Rendimento**: Aplicação de rendimento em contas poupança.

## Estrutura do Projeto

### Classes

- **Conta**: Classe abstrata que define as operações básicas de uma conta.
- **ContaCorrente**: Extensão da classe `Conta` que inclui a funcionalidade de taxa de manutenção.
- **ContaPoupanca**: Extensão da classe `Conta` que inclui a funcionalidade de rendimento.
- **Main**: Classe principal que demonstra o uso das funcionalidades do sistema.

## Exemplo de Uso

```java
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
