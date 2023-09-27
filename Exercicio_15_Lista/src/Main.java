import java.util.Scanner;

// Faça um programa em Java que leia quatro números (Opção, Num1,
//Num2 e Num3) e mostre o valor de Num1 se Opção for igual a 2; o valor
//de Num2 se Opção for igual a 3; e o valor de Num3 se Opção for igual a
//4. Os únicos valores possíveis para a variável Opção são 2, 3 e 4.
public class Main {
    public static void main(String[] args) {

        int opcao;
        int num1, num2, num3;

        Scanner escolha = new Scanner(System.in);

        System.out.println("Digite um número");
        num1 = escolha.nextInt();
        System.out.println("Digite um número");
        num2 = escolha.nextInt();
        System.out.println("Digite um número");
        num3 = escolha.nextInt();
        System.out.println("Agora escolha entre as opções 2  ,  3  ou  4");
        opcao = escolha.nextInt();

        if(opcao == 2){
            System.out.println("Opção 2: "+num1);
        } else if (opcao == 3) {
            System.out.println("Opção 3: "+num2);

        } else if (opcao == 4) {
            System.out.println("Opção 4: "+num3);

        }
        else{
            System.out.println("Invalido!");
        }

    }
}