// Construa um programa em Java que imprima a tabela de equivalência de
//graus Fahrenheit para centígrados. Os limites são de 50 a 70 graus
//Fahrenheit com intervalo de 1 grau. Fórmula: C = (F - 32) * 5/9.
public class Main {
    public static void main(String[] args) {

        double c;
        for(double f = 50; f<= 70; f++){

            c = (f - 32) * 5/9;
            System.out.println("Fahrenheit "+ f +" Celsius "+c);
        }

    }
}