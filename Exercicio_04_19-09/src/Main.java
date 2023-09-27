import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2, num3, num4;

        Scanner divisao = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = divisao.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = divisao.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = divisao.nextInt();
        System.out.println("Digite o quarto número: ");
        num4 = divisao.nextInt();

        if(num1 % 2 == 0 && num1 % 3 ==0){
            System.out.println(+num1+" é divisivel por 2 e 3!");
        }
        if(num2 % 2 == 0 && num2 % 3 ==0){
            System.out.println(+num2+" é divisivel por 2 e 3!");
        }
        if(num3 % 2 == 0 && num3 % 3 ==0){
            System.out.println(+num3+" é divisivel por 2 e 3!");
        }
        if(num4 % 2 == 0 && num4 % 3 ==0){
            System.out.println(+num1+" é divisivel por 2 e 3!");
        }
    }
}