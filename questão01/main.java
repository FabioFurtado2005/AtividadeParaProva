package Questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade no estoque: ");
        int quantidadeNoEstoque = scanner.nextInt();
        
        Produto produto = new Produto(nome, preco, quantidadeNoEstoque);

        System.out.println("\nDados iniciais do produto:");
        produto.mostrarDados();

        System.out.print("\nDigite a quantidade a ser adicionada ao estoque: ");
        int quantidadeEntrada = scanner.nextInt();
        produto.adicionarEstoque(quantidadeEntrada);

        System.out.println("\nDados do produto após entrada no estoque:");
        produto.mostrarDados();

        System.out.print("\nDigite a quantidade a ser removida do estoque: ");
        int quantidadeSaida = scanner.nextInt();
        produto.removerEstoque(quantidadeSaida);

        System.out.println("\nDados do produto após saída do estoque:");
        produto.mostrarDados();

        scanner.close();
    }
}

