package Questao04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        double nota1 = lerNota(scanner, "primeiro trimestre", 0, 30);
        double nota2 = lerNota(scanner, "segundo trimestre", 0, 35);
        double nota3 = lerNota(scanner, "terceiro trimestre", 0, 35);

        NotaAluno aluno = new NotaAluno(nota1, nota2, nota3);

        double notaFinal = aluno.calcularNotaFinal();

        System.out.printf("Nota final de %s: %.2f%n", nome, notaFinal);

        if (aluno.estaAprovado()) {
            System.out.println("Aluno aprovado!");
        } else {
            double pontosFaltando = aluno.calcularPontosFaltando();
            System.out.printf("Aluno reprovado! Faltam %.2f pontos para aprovação.%n", pontosFaltando);
        }

        scanner.close();
    }

    private static double lerNota(Scanner scanner, String trimestre, double min, double max) {
        double nota;
        while (true) {
            System.out.printf("Digite a nota do %s (%.0f a %.0f): ", trimestre, min, max);
            nota = scanner.nextDouble();
            if (nota >= min && nota <= max) {
                break; // Nota válida
            } else {
                System.out.println("Nota inválida. Tente novamente.");
            }
        }
        return nota;
    }
}



