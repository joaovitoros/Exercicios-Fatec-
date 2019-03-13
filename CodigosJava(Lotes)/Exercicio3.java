
package exercicio3;

import java.util.Scanner;

/**
 *Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 * João V. Oliveira
 */
public class Exercicio3 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor para a base: ");
        float base = teclado.nextFloat();
        System.out.println("Digite um valor para a altura: ");
        float altura = teclado.nextFloat();
        float area = base*altura/2;
        System.out.println("O valor da area do triangulo é: " +area);        
    }
    
}
