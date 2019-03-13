
package exercicio20mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio20Mod {
    static float a, b,c, delta;

public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        a = teclado.nextFloat();
        System.out.println("Digite o valor de B: ");
        b = teclado.nextFloat();
        System.out.println("Digite o valor de C: ");
        c = teclado.nextFloat();
        delta = b*b-4*a*c;
        delta ();
    }
    static void delta ()
    {
    if (delta<1) 
        {
            System.out.println("O valor de delta deu: " +delta);
            System.out.println("Não existe raizes");
        }
        
    else
        {
            System.out.println("O valor de delta é: " +delta);
            float raiz1 = (float) (-b+Math.sqrt(delta)/2*a);
            float raiz2 = (float) (-b-Math.sqrt(delta)/2*a);
            System.out.println("O valor da raiz x1 é: " +raiz1);
            System.out.println("O valor da raiz x2 é: " +raiz2);
        }
    }
}
