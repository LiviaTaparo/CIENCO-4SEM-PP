import java.util.Scanner;

//Elaborar um programa em Java que lê dois valores a e b e os escreve
//com a mensagem: “São múltiplos” ou “Não são múltiplos”.
public class Main {
    public static void main(String[] args) {

        double a, b, mult;

        Scanner multiplos = new Scanner(System.in);

        System.out.println("Digite o número a: ");
        a = multiplos.nextInt();
        System.out.println("Digite o número b: ");
        b = multiplos.nextInt();

        if(a % b == 0 || b % a == 0){
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não dão múltiplos");
        }


    }
}