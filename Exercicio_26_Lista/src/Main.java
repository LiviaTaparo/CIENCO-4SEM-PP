import java.util.Scanner;

//Crie um programa em Java que o usuário entre com vários números
//inteiros e positivos e imprima o produto dos números ímpares e a soma
//dos números pares.
public class Main {
    public static void main(String[] args) {

        String resposta;
        int num, somarPares=0, produtoImpares=1;



        do {
            Scanner numeros = new Scanner(System.in);
            System.out.println("Entre com seu número: ");
            num = numeros.nextInt();

            if(num % 2 == 0)
            {
                somarPares = num + num;
            }
            else{
                produtoImpares = num * num;
            }

            System.out.println("Mais um número? S p/ Sim");
            resposta = numeros.next();

        }while(resposta.equals("S") || resposta.equals("s"));



        System.out.println("Pares: "+somarPares);
        System.out.println("Impares: "+produtoImpares);
    }

}