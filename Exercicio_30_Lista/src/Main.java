import java.util.Scanner;

// Escreva um programa em Java que leia 20 números e imprima a soma
//dos positivos e o total de números negativos.
public class Main {
    public static void main(String[] args) {

        double num=0, somaPositivo=0, negativo=0;

        for(int i =0; i <= 3; i++) {
            Scanner PositivoEnegativo = new Scanner(System.in);
            System.out.println("Digite um numero");
            num = PositivoEnegativo.nextDouble();

            if(num > 0) {
                somaPositivo = somaPositivo + num;
            }
            else if(num < 0)
            {
                negativo++;

            }
        }
        System.out.println("Soma dos Positivos: "+somaPositivo);
        System.out.println("Total de numeros negativos: "+negativo);
        }
    }
