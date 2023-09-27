import java.util.Scanner;

// Faça um programa em Java que leia um número N e imprima “F1”, “F2”
//ou “F3”, conforme a condição:
//• “F1”, se N <= 10
//• “F2”, se N > 10 e N <= 100
//• “F3”, se n > 100
public class Main {
    public static void main(String[] args) {

        double num;

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite o N: ");
        num = numero.nextDouble();

        if(num <= 10)
        {
            System.out.println("N "+num+" é F1!");
        }
        if(num > 10 && num <= 100)
        {
            System.out.println("N "+num+" é F2!");
        }
        if(num > 100)
        {
            System.out.println("N "+num+" é F3!");
        }

    }
}