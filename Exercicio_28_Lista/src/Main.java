import java.util.Scanner;

// Faça um programa em Java que leia vários números e informe quantos
//desses números entre 100 e 200 foram digitados. Quando o valor 0 (zero)
//for lido o algoritmo deverá cessar sua execução.
public class Main {
    public static void main(String[] args) {

        double num;
        int cont=0;

        do {
            Scanner numero = new Scanner(System.in);

            System.out.println("Digite um número diferente de 0");
            num = numero.nextDouble();

            if(num >= 100 && num <= 200){
                cont++;
            }

        }while (num != 0);

        System.out.println("Numeros entre 100 e 200: "+cont);
    }
}