import java.util.Scanner;

//  Faça um programa em Java que leia dois números A e B e imprima o
//maior deles.
public class Main {
    public static void main(String[] args) {

        double numA, numB;

        Scanner maiormenor = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        numA = maiormenor.nextDouble();
        System.out.println("Digite o segundo número: ");
        numB = maiormenor.nextDouble();

        if(numA > numB)
        {
            System.out.println("Maior: "+numA+ ", menor: "+numB);
        }
        else
        {
            System.out.println("Maior: "+numB+ ", menor: "+numA);
        }
    }
}