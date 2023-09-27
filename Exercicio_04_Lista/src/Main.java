import java.util.Scanner;
// As maçãs custam R$ 1,30 cada se forem compradas menos de uma
//dúzia, e R$ 1,00 se forem compradas pelo menos 12. Escreva um
//programa em Java que leia o número de maçãs compradas, calcule e
//escreva o custo total da compra.
public class Main {
    public static void main(String[] args) {

        int maca;
        double preco=0, precoTotal;

        Scanner duzias  = new Scanner(System.in);

        System.out.println("Digite o numero de maçãs: ");
        maca = duzias.nextInt();

        if(maca < 12)
        {
            preco = 1.30;
        }
        if(maca>= 12)
        {
            preco = 1;
        }

        precoTotal = maca * preco;

        System.out.println("Preço total é de: R$"+precoTotal);





    }
}