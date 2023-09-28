import java.util.Scanner;

// )Em uma eleição presidencial existem dois candidatos. Os votos são
//informados através de códigos. Os dados utilizados para a contagem dos
//votos têm-se a seguinte codificação: 1,2= voto para os respectivos
//candidatos; 3= voto nulo; 4= voto em branco. Elabore um programa em
//Java que leia o código do candidato em um voto. Como finalizador do
//conjunto de votos, tem-se o valor 0. Calcule e escreva: (1) percentual de
//votos para cada candidato; (2) percentual de votos nulos; (3) percentual
//de votos em branco
public class Main {
    public static void main(String[] args) {

        int voto, candidato1=0, candidato2=0, nulo=0, branco=0, cond;
        double percentual1, percentual2, percentual3, percentual4, total;

        do {

            Scanner eleicao = new Scanner(System.in);


            System.out.println("Digite o número pro voto do seu candidato: 1, 2; Para nulo 3; Para branco 4; 0 para sair");
            voto = eleicao.nextInt();

            if(voto == 1)
            {
                candidato1++;
            } else if (voto == 2) {
                candidato2++;
            } else if (voto == 3) {
                nulo++;
            } else if (voto == 4) {
                branco++;
            }


        }while (voto!= 0);

        total = candidato1 + candidato2 + nulo + branco;
        percentual1 = (candidato1 / total) * 100;
        percentual2 = (candidato2 / total) * 100;
        percentual3 = (nulo / total) * 100;
        percentual4 = (branco / total) * 100;

        System.out.println("Percentual do candidato 1: "+percentual1+ "%");
        System.out.println("Percentual do candidato 2: "+percentual2+ "%");
        System.out.println("Percentual de votos nulos: "+percentual3+ "%");
        System.out.println("Percentual de votos brancos: "+percentual4+ "%");



    }
}