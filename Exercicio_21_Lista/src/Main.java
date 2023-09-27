// Escreva um programa em Java que mostre o quadrado dos números
//inteiros no intervalo de 1 a 20.
public class Main {
    public static void main(String[] args) {

        int num;

        for(int i = 1; i <= 20; i++)
        {
            num = i * i;

            System.out.println("quadrados de: "+i+ " é "+num);
        }


    }
}