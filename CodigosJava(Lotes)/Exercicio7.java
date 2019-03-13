
package exercico7;

import java.util.Scanner;

/**
 *Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 * João V. Oliveira
 */
public class Exercico7 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do comprimento: ");
        float comp = teclado.nextFloat();
        System.out.println("Digite o valor da largura: ");
        float largura = teclado.nextFloat();
        System.out.println("Digite o valor da altura: ");
        float altura = teclado.nextFloat();
        float volume = comp*largura*altura;
        System.out.println("O volume do paralelepipedo é: " +volume);
    }
    
}
