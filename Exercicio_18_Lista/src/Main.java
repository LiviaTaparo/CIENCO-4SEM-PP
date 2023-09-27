import java.util.Scanner;

// Escreva um programa em Java que leia o código de um aluno e suas três
//notas. Calcule a média ponderada do aluno, considerando que o peso
//para a maior nota seja 4 e para as duas restantes, 3. Mostre o código do
//aluno, suas três notas, a média calculada e uma mensagem:
//"APROVADO" se a média for maior ou igual a 5 e "REPROVADO" se a
//média for menor que 5.
public class Main {
    public static void main(String[] args) {

        double nota1, nota2, nota3, media, maiorNota;

        Scanner ponderada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = ponderada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = ponderada.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = ponderada.nextDouble();

        if(nota1 > nota2 && nota1 > nota3)
        {
           media = (nota1*4 + nota2*3 + nota3*3)/10;
        }
        else if (nota2 > nota1 && nota2 > nota3)
        {
            media = (nota2*4 + nota1*3 + nota3*3)/10;
        }
        else
        {
            media = (nota3*4 + nota2*3 + nota1*3)/10;
        }

        System.out.println("Media: "+media);
        if(media >= 5)
        {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }



    }
}