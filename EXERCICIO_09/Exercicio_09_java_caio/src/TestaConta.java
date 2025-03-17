public class TestaConta {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.titular = "Caio Ribeiro Pereira";
        conta.numero = 12345;
        conta.agencia = "0001";
        conta.saldo = 1000.0;
        conta.dataAbertura = "19/06/2022";

        System.out.println("Informações iniciais da conta:");
        System.out.println("Titular: " + conta.titular);
        System.out.println("Número da Conta: " + conta.numero);
        System.out.println("Agência: " + conta.agencia);
        System.out.println("Saldo inicial: R$" + conta.saldo);
        System.out.println("Data de Abertura: " + conta.dataAbertura);
        System.out.println();

        // saque
        System.out.println("Tentando sacar R$500.00...!!!");
        conta.saca(400);
        System.out.println("Saldo após saque R$" + conta.saldo);
        System.out.println();

        //depósito
        System.out.println("Tentando depositar R$300.00...!!!");
        conta.deposita(500.0);
        System.out.println("Saldo após depósito: R$" + conta.saldo);
        System.out.println();

        // rendimento
        double rendimento = conta.calculaRendimento();
        System.out.println("O rendimento de 10% sobre o saldo é R$" + rendimento);
        System.out.println("Saldo final: R$" + (conta.saldo + rendimento));
    }
}
