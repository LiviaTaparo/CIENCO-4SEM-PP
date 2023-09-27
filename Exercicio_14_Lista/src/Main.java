import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// Suponha que o conceito de um aluno seja determinado em função da sua
//nota. Suponha, também, que esta nota seja um valor inteiro na faixa de 0
//a 100, conforme a seguinte faixa:
//•
//• Nota Conceito
//• 0 a 49 Insuficiente
//• 50 a 64 Regular
//• 65 a 84 Bom
//• 85 a 100 Ótimo
//Crie um programa em Java que apresente o conceito e a nota do aluno.
public class Main {
    public static void main(String[] args) {
        String nome, cond = "", notaconceito;
        int nota;
        do {
        Scanner conceito = new Scanner(System.in);
        //entrada de dados
        System.out.println("Digite o nome do aluno: ");
        nome = conceito.nextLine();
        System.out.println("Digite a nota conceito: ");
        nota = conceito.nextInt();

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Nota: " + nota);
        if (nota <= 49)
        {
            notaconceito = "Situação: Insuficiente";
            System.out.println(notaconceito);
        } if (nota >= 50 && nota <= 64)
        {
            notaconceito = "Situação: Regular";
            System.out.println(notaconceito);
        } if (nota >= 65 && nota <=84)
        {
            notaconceito = "Situação: Bom";
            System.out.println(notaconceito);
        } if (nota >= 85 && nota <=100)
        {
            notaconceito = "Situação: Ótimo";
            System.out.println(notaconceito);
        }
        System.out.println("Deseja continuar? S-Sim");
        cond = conceito.next();
    } while (cond.equals("S") || cond.equals("s"));
    }

    }

