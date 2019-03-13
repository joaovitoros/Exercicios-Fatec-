
package exercicio9;

import java.util.Scanner;

/**
 *Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 * João V. Oliveira
 */
public class Exercicio9 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int nun1 = teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        int nun2 = teclado.nextInt();
        int res = (int) (Math.pow(nun1, 2)+ Math.pow(nun2, 2));
        System.out.println("A soma dos quadrados é: " +res);
    }
    
}
