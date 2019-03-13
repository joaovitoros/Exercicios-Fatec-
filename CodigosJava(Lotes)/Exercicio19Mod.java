
package exercicio19mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio19Mod {
    static float N1, N2;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite qualquer numero real: ");
        N1 = teclado.nextFloat();
        System.out.println("Digite outro numero real: ");
        N2 = teclado.nextFloat();
        Vali ();
    }
    static void Vali ()
    {
        if (N1>N2)
        {
            System.out.println("O maior é: " +N1);
        }
        else
        {
            System.out.println("O maior é: " +N2);
        }
    }
}
