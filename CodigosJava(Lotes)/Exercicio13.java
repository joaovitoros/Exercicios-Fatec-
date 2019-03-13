
package exercicio13;

import java.util.Scanner;

/**
 *Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 * João V. Oliveira
 */
public class Exercicio13 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de quilos que a pessao receberá: ");
        float aliq = teclado.nextFloat();
        float dias = (float) (aliq/0.05);
        System.out.println("O numero de dias que o alimento durará será de: " +dias);
    }
    
}
