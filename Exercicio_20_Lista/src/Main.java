import java.util.Scanner;

// Um banco concederá um crédito especial aos seus clientes, variável com
//o saldo médio no último ano. Faça um programa em Java que leia o saldo
//médio de um cliente e calcule o valor do crédito de acordo com a tabela abaixo.
// Mostre uma mensagem informando o saldo médio e o valor do crédito.
//Saldo médio     Percentual
//• de 0 a 200    nenhum crédito
//• de 201 a 400  20% do valor do saldo médio
//• de 401 a 600  30% do valor do saldo médio
//• acima de 601  40% do valor do saldo médio
public class Main {
    public static void main(String[] args) {

        double saldoMedio=0, credito=0;

        Scanner banco = new Scanner(System.in);

        System.out.println("Informe seu saldo médio do ultimo ano: ");
        saldoMedio = banco.nextDouble();

        if(saldoMedio == 0 && saldoMedio <= 200)
        {
            System.out.println("Sem credito!");
        } else if (saldoMedio >= 201 && saldoMedio <= 400) {
            credito = saldoMedio * 0.2;
        } else if (saldoMedio >= 401 && saldoMedio <= 600) {
            credito = saldoMedio * 0.3;
        }
        else {
            credito = saldoMedio * 0.4;
        }

        System.out.println("Saldo médio: "+saldoMedio);
        System.out.println("Crédito: " +credito);

    }
}