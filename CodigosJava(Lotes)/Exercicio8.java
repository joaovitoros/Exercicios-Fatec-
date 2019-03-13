
package exercicio8;

import java.util.Scanner;

/**
 *Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 * João V. Oliveira
 */
public class Exercicio8 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor inicial do deposito: ");
        float valori = teclado.nextFloat();
        float valorf = (float) (valori*1.013);
        System.out.println("Valor após um mes será de: " +valorf);
    }
    
}
