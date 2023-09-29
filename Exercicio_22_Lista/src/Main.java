//Escreva um programa em Java que escreva todos os números múltiplos
//de 5, no intervalo de 1 a 500.
public class Main {
    public static void main(String[] args) {

        int num, i;

        for(i = 1; i <= 500; i++)
        {
            if(i % 5 == 0){
                System.out.println("Multiplos de 5: "+ i);
            }

        }

    }
}