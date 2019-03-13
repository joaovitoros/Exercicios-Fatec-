package exercicio33;

import java.util.Scanner;

/**
 *Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 * João V. Oliveira
 */
public class Exercicio33 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        float N = teclado.nextFloat();
        float N1 = 0;
        float N2 = 0;
        float um = 1;
        while (N1<N)
        {
            N1 = N1+1;
            float N12 = N1;
            System.out.println("Série: " +um +"/" +N12);
            N2 = (1/N1)+N2;
        }
        N2 = 1+N2;
        System.out.println("" +N2);
        
    }
    
}
