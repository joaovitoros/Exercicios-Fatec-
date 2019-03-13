
package exercicio14;

import java.util.Scanner;

/**
 *Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 * João V. Oliveira
 */
public class Exercicio14 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro angulo: ");
        float ang = teclado.nextFloat();
        System.out.println("Digite o valor do segundo angulo: ");
        float ang2 = teclado.nextFloat();
        float ang3 = ang+ang2;
        ang3 = 180-ang3;
        System.out.println("O valor do terceiro angulo é de: " + ang3);
    }
    
}
