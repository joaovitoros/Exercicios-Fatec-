
package exercicio11;

import java.util.Scanner;

/**
 *Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
 * João V. Oliveira
 */
public class Exercicio11 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio da circuferencia: ");
        float raio = teclado.nextFloat();
        float compri = (float) (2*3.14*raio);
        System.out.println("O comprimento é de: " +compri);
    }
    
}
