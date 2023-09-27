import java.util.Scanner;

// Uma sorveteria vende três tipos de picolés. Sabendo-se que o picolé do
//tipo 1 é vendido por R$ 0.50, o do tipo 2 por R$ 0.60 e o do tipo 3 por R$
//0.75. Faça um programa em Java que, para cada tipo de picolé, mostre a
//quantidade vendida e o total arrecadado.
public class Main {
    public static void main(String[] args) {

        double tipo1,valor1, tipo2, valor2, tipo3, valor3, totalVendido, totalValor;

        Scanner sorveteria = new Scanner(System.in);

        System.out.println("Informe a quantidade de picoles tipo 1: ");
        tipo1 = sorveteria.nextDouble();
        System.out.println("Informe a quantidade de picoles tipo 2: ");
        tipo2 = sorveteria.nextDouble();
        System.out.println("Informe a quantidade de picoles tipo 3: ");
        tipo3 = sorveteria.nextDouble();

        totalVendido = tipo1 + tipo2 + tipo3;
        valor1 = tipo1 * 0.50;
        valor2 = tipo2 * 0.60;
        valor3 = tipo3 * 0.75;
        totalValor = valor1 + valor2 + valor3;
        System.out.println("A quatidade de picoles foi:\n"+"Tipo 1: "+tipo1+"\nTipo 2: "+tipo2+
                "\nTipo 3: "+tipo3+ "\nTotal: "+totalVendido);
        System.out.println("\nO valor foi:\n"+"Tipo 1 R$"+valor1+"\nTipo 2 R$"+valor2+
                "\nTipo 3 R$"+valor3+ "\nTotal R$"+totalValor);
    }
}