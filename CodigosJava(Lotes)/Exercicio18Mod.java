
package exercicio18mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio18Mod {
    static int N1, N2, res;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        N1 = teclado.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        N2 = teclado.nextInt();
        Dif ();
    }
    static void Dif()
    {
        if (N1>N2)
        {
            res = N1-N2;
            System.out.println("A diferença é: " +res);
        }
        else
        {
            res = N2-N1;
            System.out.println("A diferença é : " +res);
        }
    }
}
