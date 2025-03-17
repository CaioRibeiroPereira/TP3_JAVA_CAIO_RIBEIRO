//Exercicio 02
class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    //Exercicio 03
    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void alterarQuantidade(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}
//Exercicio 04
public class Main {
    public static void main(String[] args) {
        // Instancia o Produto
        Produto produto = new Produto();
        produto.nome = "Arroz";
        produto.preco = 5.99;
        produto.quantidadeEmEstoque = 100;

        // Atualiza preço e quantidade
        produto.alterarPreco(6.49);
        produto.alterarQuantidade(80);

        // Exibe as informações
        produto.exibirInformacoes();
    }
}
