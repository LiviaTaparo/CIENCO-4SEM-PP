import java.util.Scanner;

//A revendedora de carros Pica-Pau Ltda. paga aos seus funcionários
//vendedores dois salários-mínimos fixos, mais uma comissão fixa de R$
//50,00 por carro vendido e mais 5% do valor das vendas. Faça um
//programa em Java que determine o salário total de um vendedor.
public class Main {
    public static void main(String[] args) {
        String resposta;
        double venda, salarioTotal, salarioMinimo=2640, comissao=0, comissaoVenda;
        do {
            Scanner vrumvrum = new Scanner(System.in);
            System.out.println("Informe o valor da venda: ");
            venda = vrumvrum.nextDouble();

            System.out.println("Mais uma venda a ser informada? S p/ sim");
            resposta = vrumvrum.next();

            comissaoVenda = venda * 0.05;

            comissao++;
        }while(resposta.equals("S") || resposta.equals("s"));

        salarioTotal = salarioMinimo + (50.00 * comissao) + (comissaoVenda * comissao);

        System.out.println("Salario minimo: "+salarioMinimo+ "\nComissão: "+comissao+
                "\nComissao vendas:"+(comissaoVenda * comissao)+"\nSalario total: "+salarioTotal);
    }
}