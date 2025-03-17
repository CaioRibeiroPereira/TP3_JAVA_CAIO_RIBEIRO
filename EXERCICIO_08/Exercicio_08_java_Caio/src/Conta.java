public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    // Metodo de saque
    public void saca(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    // Metodo de depósito
    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Metodo de cálculo de rendimento
    public double calculaRendimento() {
        return saldo * 0.1; //10% de rendiment
    }
}
