import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //faça um programa para ler dois valores numéricos inteiros e apresentar
        //o resultado da diferença do maior em relação ao manor valor.

        int num1, num2, resultado;

        Scanner calcular = new Scanner(System.in);
        //JOptionpane é para mostrar as coisas na tela e não no main
        //num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        //num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        System.out.println("Digite o primeiro numero: ");
        num1 = calcular.nextInt();
       System.out.println("Digite o segundo numero: ");
        num2 = calcular.nextInt();

        if(num1 > num2){
            resultado = num1 - num2;
            System.out.println("Resiltado de " +num1+ " - "+num2 + " é: "  + resultado);
        }
        else {
            resultado = num2 - num1;
            System.out.println("Resiltado de " +num2+ " - "+num1 + " é: "  + resultado);
        }




    }
}