import java.util.Scanner;

// Calcule a média aritmética das três notas de um aluno e mostre, além do
//valor da média, uma mensagem de "Aprovado", caso a média seja igual
//ou superior a 7; a mensagem “em prova final” caso a média seja menor
//que 7 e maior ou igual a 4; e "reprovado", caso contrário.
public class Main {
    public static void main(String[] args) {

        String resultado="", cond;
        double nota1, nota2, media;

            do {
                Scanner sc = new Scanner(System.in);

                System.out.println("Digite a nota 1: ");
                nota1 = sc.nextDouble();

                System.out.println("Digite a nota 2: ");
                nota2 = sc.nextDouble();

                media = (nota1 + nota2) / 2;


                if (media > 7) {

                    resultado = "Aprovado";
                } else if (media >= 7) {

                    resultado = "Prova Final";
                } else if(media < 7 && media >=4 ) {

                    resultado = "Reprovado";
                }

                System.out.println("Situação: " + resultado);
                System.out.println("Media: " + media);

                System.out.println("Deseja continuar? S-Sim");
                cond = sc.next();
            } while (cond.equals("S") || cond.equals("s"));
        }



    }
