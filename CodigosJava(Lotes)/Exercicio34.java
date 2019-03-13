package exercicio34;

import java.util.Scanner;

/**
 *Receba um número. Calcule e mostre os resultados da tabuada desse número.
 * João V. Oliveira
 */
public class Exercicio34 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        float N = teclado.nextFloat();
        int V = 1;
        float N1 = N;
        while (V<=10)
        {
            N1 = N*V;
            V = V+1;
            System.out.println("" +N1);
        }
    }
    
}
