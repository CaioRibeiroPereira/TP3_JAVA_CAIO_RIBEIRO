// Exercício 2 - Criando a Classe “Produto”
class Produto {
    // Atributos
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    //Exercicio 05
    // Métodos get
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Métodos set
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void setQuantidadeEmEstoque(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    // Exercicio 03
    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    //
    public void alterarQuantidade(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    //
    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}

// Exercício 04
public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setNome("Arroz");
        produto.setPreco(5.99);
        produto.setQuantidadeEmEstoque(100);


        produto.exibirInformacoes();


        produto.alterarPreco(6.49);
        produto.alterarQuantidade(80);


        System.out.println("\nApós as alterações:");
        produto.exibirInformacoes();

        // Exercício 05
        produto.setNome("Arroz Integral tipo 1");
        produto.setPreco(7.99);
        produto.setQuantidadeEmEstoque(30);

        // Exercicio 05
        System.out.println("\nApós o uso dos setters:");
        produto.exibirInformacoes();


        System.out.println("\nAtravés dos getters:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
    }
}
