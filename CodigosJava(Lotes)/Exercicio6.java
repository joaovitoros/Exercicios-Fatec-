
package exercicio6;

import java.util.Scanner;

/**
 *Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 * João V. Oliveira
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        float x = teclado.nextFloat();
        System.out.println("Digite o valor de Y: ");
        float y = teclado.nextFloat();
        float aux = x;
        x = y;
        y = aux;
        System.out.println("Valor de X é: " +x);
        System.out.println("Valor de Y é: " +y);
            }
    
}
