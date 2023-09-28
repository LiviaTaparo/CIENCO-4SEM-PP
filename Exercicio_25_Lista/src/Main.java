import java.util.Scanner;

// Faça um programa em Java que receba o salário de um funcionário
//chamado Carlos. Sabe-se que o funcionário João tem um salário
//equivalente a um terço do salário de Carlos. Carlos aplicara seu salário
// integralmente em uma caderneta de poupança, que está rendendo 2% ao
//mês e João aplicara integralmente seu salário em fundo de renda fixa que
//está rendendo 5% ao mês. Calcule e mostre a quantidade de meses
//necessários para que o valor pertencente a João ultrapasse ou iguale ao
//valor pertencente a Carlos.
public class Main {
    public static void main(String[] args) {
        int mes=0;
        double salarioC, salarioJ, cadernetaPC, cadernetaPJ;

        Scanner salarios = new Scanner(System.in);

        System.out.println("Informe o salário de Carlos: ");
        salarioC = salarios.nextDouble();

        salarioJ = salarioC / 3;

        cadernetaPC = 1 + 0.02;
        cadernetaPJ = 1 + 0.05;

        while(salarioJ <= salarioC){
            salarioC = salarioC * cadernetaPC;
            salarioJ = salarioJ * cadernetaPJ;
            mes++;
        }


        System.out.println("Quantidade de meses: " + mes);

    }
}