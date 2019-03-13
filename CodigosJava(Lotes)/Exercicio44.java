
package exercicio44;

import java.util.Scanner;

/**
 *Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 * João V. Oliveira
 */
public class Exercicio44 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero da base: ");
        float base = teclado.nextFloat();
        System.out.println("Digite o valor do expoente: ");
        float expoente = teclado.nextFloat();
        float potencia = 1;
        int vezes = 1;
        while (vezes<=expoente)
        {
            potencia = potencia*base;
            vezes = vezes+1;
        }
        System.out.println("A potencia é: " +potencia);
    }
    
}
