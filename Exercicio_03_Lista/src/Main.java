import java.util.Scanner;

// Ler um valor e escrever se é positivo ou negativo (considere o valor zero
//como positivo).
public class Main {
    public static void main(String[] args) {
        double numero, negativo, positivo;

        Scanner classificacao = new Scanner(System.in);
        System.out.println("Digite um número qualquer: ");
        numero = classificacao.nextDouble();
        if(numero >= 0)
        {
            System.out.println("Numero "+numero+" é positivo!");
        }
        else
        {
           System.out.println("Numero "+numero+" é negativo!");
        }
    }
}