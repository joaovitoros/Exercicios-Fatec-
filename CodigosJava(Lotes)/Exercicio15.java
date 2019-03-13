
package exercicio15;

import java.util.Scanner;

/**
 *Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 * João V. Oliveira
 */
public class Exercicio15 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro cateto: ");
        float cateto1 = teclado.nextFloat();
        System.out.println("Digite o valor do segundo cateto: ");
        float cateto2 = teclado.nextFloat();
        float hipo = (float) (Math.pow(cateto1, 2)+ Math.pow(cateto2, 2));
        System.out.println("A hipotenusa do triangulo é de: " +hipo);
    }
    
}
