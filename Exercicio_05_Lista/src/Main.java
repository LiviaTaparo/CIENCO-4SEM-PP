import java.util.Scanner;

// Criar um programa em Java para classificar candidatos a um vestibular.
//Os candidatos deverão passar pôr prova teórica e prática. O candidato
//que obtiver nota superior a 9 na prova teórica e nota superior a 9 na prática
//será aprovado. Caso o candidato consiga tirar nota superior a 8 na nota
//teórica e superior a 9 na prova pratica, deverá ser analisado suas
//informações escolares, ou seja, se o candidato estudou em escola
//pública, a nota teórica será acrescida de 1,5 ponto. Mostrar as notas
//teóricas e prática e o resultado do candidato (aprovado ou reprovado).
//Sabe-se que ao todos eram 35.
public class Main {
    public static void main(String[] args) {

        String candidato, escola;
        double nota1, nota2;


        for(int i = 0; i < 3; i++)
        {
            Scanner prova = new Scanner(System.in);
            System.out.println("Digite seu nome:");
            candidato = prova.nextLine();
            System.out.println("Digite a nota da prova teorica:");
            nota1 = prova.nextDouble();
            System.out.println("Digite a nota da prova pratica:");
            nota2 = prova.nextDouble();

            if(nota1 > 9 && nota2 > 9)
            {
                System.out.println("Nota Teorica: " +nota1+ "Nota Pratica: "+nota2);
                System.out.println("Aprovado!");
            }
            else if(nota1 > 8 && nota2 > 9)
            {
                System.out.println("Analise! Estudou em escola pública? S p/ sim");
                escola = prova.next();
                if(escola.equals("S") || escola.equals("s"))
                {
                    nota1 = nota1 + 1.5;
                    System.out.println("Nota Teorica: " +nota1+ "Nota Pratica: "+nota2);
                    System.out.println("Aprovado!");

                }
            }
            else
            {
                System.out.println("Nota Teorica: " +nota1+ "Nota Pratica: "+nota2);
                System.out.println("Reprovado!");
            }
        }
    }
}