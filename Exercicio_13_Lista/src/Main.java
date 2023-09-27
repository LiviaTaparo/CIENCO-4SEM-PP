import java.util.Scanner;

// Faça um programa em Java que leia 3 números inteiros distintos e
//escreva o menor deles.
public class Main {
    public static void main(String[] args) {

        int num1, num2, num3, menor;



            Scanner numeros = new Scanner(System.in);
            System.out.println("Digite um numero:");
            num1 = numeros.nextInt();
            System.out.println("Digite um numero:");
            num2 = numeros.nextInt();
            System.out.println("Digite um numero:");
            num3 = numeros.nextInt();

        menor = num1;
        if (num2 < menor)
        {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("O menor é: "+menor);
    }
}