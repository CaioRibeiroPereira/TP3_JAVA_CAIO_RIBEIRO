// Declaração da classe
class ContaBancaria {
    // Campos (atributos)
    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Metodo para depositar um valor
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    // Metodo para sacar um valor
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criação de um objeto
        ContaBancaria conta = new ContaBancaria("Caio Ribeiro", 1000.00);

        // Operações bancárias
        conta.depositar(500.00);
        conta.sacar(200.00);
    }
}
