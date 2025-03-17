// Exercício 2
class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    //EXERCICIO 06
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Exercicio 05
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void setQuantidadeEmEstoque(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    // exercicio 03
    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }


    public void alterarQuantidade(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}

// Exercício 4
public class Main {
    public static void main(String[] args) {
        // Exercício 6
        Produto produto = new Produto("Arroz", 5.99, 100);

        // Exercício 4
        produto.exibirInformacoes();

        // Exercício 3
        produto.alterarPreco(6.49);
        produto.alterarQuantidade(80);

        // Exercício 4
        System.out.println("\nApós as alterações:");
        produto.exibirInformacoes();

        // Exercício 5
        produto.setNome("Arroz Integral");
        produto.setPreco(7.99);
        produto.setQuantidadeEmEstoque(50);

        // Exercício 5
        System.out.println("\nApós o uso dos setters:");
        produto.exibirInformacoes();

        // Exercício 5
        System.out.println("\nAtravés dos getters:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
    }
}

