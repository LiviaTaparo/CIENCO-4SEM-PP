import java.util.Scanner;

// Faça um programa em Java que leia o nome do produto, quantidade e
//quantidade mínima em estoque. Caso a quantidade em estoque seja
//menor que a quantidade mínima emitir uma mensagem dizendo que o
//produto deve ser comprado. Caso contrário emitir uma mensagem
//dizendo a quantidade em estoque. O algoritmo deve ser repetido
//enquanto o usuário informar que há mais produtos.
public class Main {
    public static void main(String[] args) {

        String produto, cond = "";
        int quantidade, quantidadeMinima;




        do{
            Scanner estoque = new Scanner(System.in);

            System.out.println("Digite o nome do produto: ");
            produto = estoque.nextLine();
            System.out.println("Digite a quantidade minima dele: ");
            quantidadeMinima = estoque.nextInt();
            System.out.println("Digite a quantidade no estoque: ");
            quantidade = estoque.nextInt();
            if(quantidade < quantidadeMinima)
            {
                System.out.println("A quantidade do produto " + produto+" é insuficiente!");
            } else if (quantidade == quantidadeMinima)
            {
                System.out.println("A quantidade do produto "+ produto + " é " +quantidade);
            }

            System.out.println("Deseja continuar? S-Sim");
            cond = estoque.next();

        } while (cond.equals("S") || cond.equals("s"));

    }
}