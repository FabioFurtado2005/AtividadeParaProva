package Questao04;

public class NotaAluno {
    double nota1;
    double nota2;
    double nota3;

    public NotaAluno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double calcularNotaFinal() {
        return nota1 + nota2 + nota3;
    }

    boolean estaAprovado() {
        return calcularNotaFinal() >= 70;
    }

    double calcularPontosFaltando() {
        return 70 - calcularNotaFinal();
    }

   double getNota1() {
        return nota1;
    }

   void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    double getNota2() {
        return nota2;
    }

    void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    double getNota3() {
        return nota3;
    }

    void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}