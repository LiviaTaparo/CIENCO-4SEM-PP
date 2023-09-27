import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2-Faça um programa para ler quatro valores reais referente a 4 notas
        //calcular a média do aluno e mostrar se o aluno foi aprovado ou
        // reprovado,considere escolar maior ou igual a 5.

        Scanner calculaMedia = new Scanner(System.in);
        String resultado;
        double nota1, nota2, media;

        System.out.println("Digite a nota 1: ");
        nota1 = calculaMedia.nextDouble();

        System.out.println("Digite a nota 2: ");
        nota2 = calculaMedia.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 5) {
            resultado = "Aprovado";

        } else {
            resultado = "Reprovado";
        }
        System.out.println("Media: " + media);
        System.out.println("Situação: " + resultado);
    }
}