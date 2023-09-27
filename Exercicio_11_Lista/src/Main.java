import java.util.Scanner;

// Escreva um programa em Java que, para uma conta bancária, leia o seu
//número, o saldo, o tipo de operação a ser realizada (depósito ou retirada)
//e o valor da operação. Após, determine e mostre o novo saldo. Se o novo
//saldo ficar negativo, deve ser mostrada, também, a mensagem “conta
//estourada”.
public class Main {
    public static void main(String[] args) {

        String cond;
        int numeroConta, operacao;
        double saldo=0, valorOperacao;
        Scanner banco = new Scanner(System.in);

        do{
            System.out.print("Digite o número da conta:");
            numeroConta = banco.nextInt();
            System.out.print("Digite o tipo de operação (1 - para Depósito, 2 - para Saque):");
            operacao = banco.nextInt();
            System.out.print("Digite o valor da operação:");
            valorOperacao = banco.nextDouble();

            if (operacao == 1) {
                saldo = saldo + valorOperacao;
            }
            else if (operacao == 2) {
                saldo = saldo - valorOperacao;
            }
            else {
                System.out.println("Inválido.");
                return;
            }
            System.out.println("Novo saldo:" + saldo);
            if (saldo < 0) {
                System.out.println("Conta Estourada." + saldo);
            }
            System.out.println("Deseja continuar? S-Sim");
            cond = banco.next();

        }while (cond.equals("S") || cond.equals("s"));

    }
}