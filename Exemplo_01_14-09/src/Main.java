import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //codigo aqui
        String nome, resultado, cond = "";
        int idade;
        double nota1, nota2, media;

        try {
            do {
                Scanner sc = new Scanner(System.in);
                //entrada de dados
                System.out.println("Digite o nome do aluno: ");
                nome = sc.nextLine();

                System.out.println("Digite a idade: ");
                idade = sc.nextInt();

                System.out.println("Digite a nota 1: ");
                nota1 = sc.nextDouble();

                System.out.println("Digite a nota 2: ");
                nota2 = sc.nextDouble();

                media = (nota1 + nota2) / 2;

                if (media >= 7) {
                    resultado = "Aprovado";
                } else if (media >= 4) {
                    resultado = "Exame";
                } else {
                    resultado = "Reprovado";
                }

                System.out.println("Nome do aluno: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Media: " + media);
                System.out.println("Situação: " + resultado);

                System.out.println("Deseja continuar? S-Sim");
                cond = sc.next();
            } while (cond.equals("S") || cond.equals("s"));
        }

        catch (Exception e)
        {
            System.out.println("Erro. Verifique");
        }
    }

}