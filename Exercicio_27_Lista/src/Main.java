import java.util.Scanner;

// Foi feita uma pesquisa entre os habitantes de uma região e coletados os
//dados de altura e sexo (0=masc, 1=fem) das pessoas. Faça um programa
//em Java que leia 50 dados diferentes e informe:
//
//    a) a maior e a menor altura encontradas;
//    b) a média de altura das mulheres;
//    c) a média de altura da população;
//    d) o percentual de homens na população.
public class Main {
    public static void main(String[] args) {

        int sexo=0, fem=0, masc=0, populacaoT = 50;
        double altura, alturaP=0, percentualH=0, somaAltura=0, somaAlturaM=0, mediaM=0;
        double maiorAltura = Double.MIN_VALUE; double menorAltura = Double.MAX_VALUE;

        for(int i = 0; i < populacaoT; i++){
            Scanner populacao = new Scanner(System.in);
            System.out.println("Entre com o sexo, (0=masc, 1=fem)");
            sexo = populacao.nextInt();
            System.out.println("Informe a sua altura: ");
            altura = populacao.nextDouble();

            somaAltura = somaAltura + altura;

            if(sexo == 0){
                masc++;
            }
            else if(sexo == 1){
                fem++;
                somaAlturaM = somaAlturaM + altura;

            }
            if(altura > maiorAltura){
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;

            }




        }

        alturaP = somaAltura / populacaoT;
        mediaM = somaAlturaM / fem;
        percentualH = (masc * 100) / populacaoT;

        System.out.println("Media de altura da população: "+alturaP);
        System.out.println("Media de altura das mulheres: "+mediaM);
        System.out.println("Percentual de Homens: "+percentualH);
        System.out.println("Maior altura: "+maiorAltura+ " Menor altura: "+menorAltura);
    }
}