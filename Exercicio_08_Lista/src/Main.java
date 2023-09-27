import java.util.Scanner;

//Uma empresa de vendas tem três corretores. A empresa paga ao corretor
//uma comissão calculada de acordo com o valor de suas vendas. Se o
//valor da venda de um corretor for maior que R$ 50.000.00 a comissão
//será de 12% do valor vendido. Se o valor da venda do corretor estiver
//entre R$ 30.000.00 e R$ 50.000.00 (incluindo extremos) a comissão será
//de 9.5%. Em qualquer outro caso, a comissão será de 7%. Escreva um
//programa em Java que gere um relatório contendo nome, valor da venda
//e comissão de cada um dos corretores. O relatório deve mostrar também
//o total de vendas da empresa.
public class Main {
    public static void main(String[] args) {

        String nome;
        double valorVenda, comissao;
        int venda, totalVenda=0;

        for(int i = 0; i < 3; i++)
        {
            Scanner corretores = new Scanner(System.in);
            System.out.println("Nome do corretor:");
            nome = corretores.nextLine();
            System.out.println("Valor da venda:");
            valorVenda = corretores.nextDouble();

            if(valorVenda > 50000)
            {
                comissao = valorVenda * 0.12;
            }
            else if(valorVenda <= 30000 && valorVenda > 50000)
            {
                comissao = valorVenda * 0.95;
            }
            else
            {
                comissao = valorVenda * 0.7;
            }
            totalVenda++;

            System.out.println("Nome do corretor: "+nome+ "\nValor da venda: "+valorVenda+ "\nComissão: "+comissao);

        }

        System.out.println("Total de vendas: "+totalVenda);



    }
}