package Questao01;

public class Produto {
    String nome;
    double preco;
    int quantidadeNoEstoque;

    public Produto(String nome, double preco, int quantidadeNoEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeNoEstoque = quantidadeNoEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeNoEstoque() {
        return quantidadeNoEstoque;
    }

    public void setQuantidadeNoEstoque(int quantidadeNoEstoque) {
        this.quantidadeNoEstoque = quantidadeNoEstoque;
    }

    public void mostrarDados() {
        double valorTotalNoEstoque = preco * quantidadeNoEstoque;
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Preço: %.2f%n", preco);
        System.out.printf("Quantidade no estoque: %d%n", quantidadeNoEstoque);
        System.out.printf("Valor total no estoque: %.2f%n", valorTotalNoEstoque);
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeNoEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > quantidadeNoEstoque) {
            System.out.println("Quantidade solicitada excede a quantidade disponível no estoque.");
        } else {
            this.quantidadeNoEstoque -= quantidade;
        }
    }
}