import java.util.Scanner;

//Criar um programa em Java que solicite o salário de um funcionário e
//calcule o INSS (11%) e o valor de contribuição sindical, considerando a
//tabela abaixo. Mostrar no final do algoritmo o salário bruto, salário líquido,
//valor pago de inss e valor pago de contribuição sindical.
// salário < 800 = 2% de contribuição sindical
//• salário >= 800 e <= 1500 3% de contribuição sindical
//• salário > 1500 5% de contribuição sindical
public class Main {
    public static void main(String[] args) {

        String nome;
        double salarioBruto, salarioLiquido, contribuicao=0, inss;

        Scanner salario = new Scanner(System.in);

        System.out.println("Entre com o nome: ");
        nome = salario.nextLine();
        System.out.println("Entre com o salário bruto: ");
        salarioBruto = salario.nextDouble();

            if(salarioBruto < 800)
            {
                contribuicao = salarioBruto * 0.02;
            }
            else if (salarioBruto >= 800 && salarioBruto<= 1500)
            {
                contribuicao = salarioBruto * 0.03;
            }
            else if (salarioBruto > 1500)
            {
                contribuicao = salarioBruto * 0.05;
            }

             inss = salarioBruto * 0.11;
            salarioLiquido = salarioBruto - contribuicao - inss;

        System.out.println("Salario Bruto " + salarioBruto + " Desconto inss " + inss+ " Desconto sindicato " + contribuicao +" Salario liquido: "+salarioLiquido);





    }
}