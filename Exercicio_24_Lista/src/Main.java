// Em um cinema, certo dia, cada espectador respondeu a um questionário,
//que perguntava a sua idade (ID) e a opinião em relação ao filme (OP),
//seguindo os seguintes critérios:
// 1 Ótimo, 2 Bom, 3 Regular, 4 Ruim.
//Ao final da pesquisa será indicado quando a idade do usuário for informada
//como negativa (idade inexistente). Construa um programa em Java que,
//lendo esses dados, calcule e apresente:
//a) Quantidade de pessoas que respondeu a pesquisa;
//b) Média de idade das pessoas que responderam à pesquisa;
//c) Porcentagem de cada uma das respostas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String resposta;
        int id, op, pessoas, o=0, b=0, re=0, ru=0, cont=0;
        double percentual1, percentual2, percentual3, percentual4, total, mediaIdade, somaIdade=0;

        do {
            Scanner cinema = new Scanner(System.in);

            System.out.println("Bem Vindo!\nInforme sua idade: ");
            id = cinema.nextInt();
            System.out.println("Sua Opnião para o filme:\n- 1 Ótimo\n- 2 Bom\n- 3 Regular\n- 4 Ruim");
            op = cinema.nextInt();


            if (id > 0) {
                cont++;
                somaIdade = somaIdade + id;
            } else {
                System.out.println("Inválido!");
            }

            if(op == 1)
            {
                o++;
            } else if (op == 2) {
                b++;
            } else if (op == 3) {
                re++;
            } else if (op == 4) {
                ru++;
            }
            System.out.println("Deseja continuar? S-Sim");
            resposta = cinema.next();
        }while(resposta.equals("S") || resposta.equals("s"));

        mediaIdade = somaIdade / cont;
        total = o + b + re + ru;
        percentual1 = (o / total) * 100;
        percentual2 = (b / total) * 100;
        percentual3 = (re / total) * 100;
        percentual4 = (ru / total) * 100;

        System.out.println("Quantidade de pessoas: "+cont);
        System.out.println("Media de idade: "+mediaIdade);
        System.out.println("Percentual de Ótimo: "+percentual1+ "%");
        System.out.println("Percentual de Bom: "+percentual2+ "%");
        System.out.println("Percentual de Regular: "+percentual3+ "%");
        System.out.println("Percentual de Ruim: "+percentual4+ "%");

    }
}