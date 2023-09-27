import java.util.Scanner;

// Um hotel cobra R$ 60.00 a diária e mais uma taxa de serviços. A taxa de
//serviços é de:
//• R$ 5.50 por diária, se o número de diárias for maior que 15;
//• R$ 6.00 por diária, se o número de diárias for igual a 15;
//• R$ 8.00 por diária, se o número de diárias for menor que 15.
//Construa um programa em Java que mostre o nome e o total da conta de um
//cliente.
public class Main {
    public static void main(String[] args) {

        String nome;
        int diarias=0;
        double valorDiarias=0;

        Scanner hotel = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        nome = hotel.next();
        System.out.println("O numero de diarias: ");
        diarias = hotel.nextInt();

        if(diarias > 15)
        {
            valorDiarias = diarias * 5.5;
        }
        else if (diarias == 15)
        {
            valorDiarias = diarias * 6;
        }
        else if (diarias < 15)
        {
            valorDiarias = diarias * 8;
        }

        System.out.println("Nome: "+nome+"\nNumero das diarias: " +diarias+ "\nValor a pagar: "+ valorDiarias);
    }
}