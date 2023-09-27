import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //faça um programa para ler 3 valores inteiros e apresentá-los em ordem
    //crescente.

    int num1, num2, num3;

        Scanner numeros = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = numeros.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = numeros.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = numeros.nextInt();

        if(((num1 > num2) && (num1 >num3))&& ((num2 < num1) && (num2 > num3)))
        {
            System.out.println("Ordem crescente:" +num1+"," +num2+ "," +num3);
        }
        if(((num2 > num1) && (num2 >num3))&& (num1 > num3))
        {
            System.out.println("Ordem crescente:" +num2+"," +num1+ "," +num3);
        }
        if(((num3 > num1) && (num3 >num2) && (num2 > num1)))
        {
            System.out.println("Ordem crescente:" +num3+"," +num2+ "," +num1);
        }
        if(((num1 > num2) && (num1 >num3) && (num2 < num3)))
        {
            System.out.println("Ordem crescente:" +num1+"," +num3+ "," +num2);
        }
        if(((num2 > num3) && (num2 >num1) && (num3 < num2)))
        {
            System.out.println("Ordem crescente:" +num2+"," +num3+ "," +num1);
        }
        if(((num3 > num1) && (num1 >num2) && (num1 > num2)))
        {
            System.out.println("Ordem crescente:" +num3+"," +num1+ "," +num2);
        }




    }
}