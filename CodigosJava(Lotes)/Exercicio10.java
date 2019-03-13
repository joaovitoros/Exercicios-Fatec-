
package exercicio10;

import java.util.Scanner;

/**
 *Receba 2 números reais. Calcule e mostre a diferença desses valores.
 * João V. Oliveira
 */
public class Exercicio10 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        float nun1 = teclado.nextFloat();
        System.out.println("Digite o segundo numero: ");
        float nun2 = teclado.nextFloat();
        float dif1 = nun1-nun2;
        float dif2 = nun2-nun1;
        System.out.println("A diferença entre o primeiro e o segundo é de: " +dif1);
        System.out.println("E a diferença entre o segundo e o primeiro é de: " +dif2);
    }
    
}
