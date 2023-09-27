import java.util.Scanner;

// Faça um programa em Java que leia um número inteiro e mostre uma
//mensagem indicando se este número é par ou ímpar e se é positivo ou
//negativo.
public class Main {
    public static void main(String[] args) {

        int num;

        Scanner verifica = new Scanner(System.in);

        System.out.println("Digite o número para verificação: ");
        num = verifica.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("É par!");
        }
        else
        {
            System.out.println("É impar!");
        }

        if(num >= 0)
        {
            System.out.println("É positivo!");
        }
        else{
            System.out.println("É negativo!");
        }
    }
}