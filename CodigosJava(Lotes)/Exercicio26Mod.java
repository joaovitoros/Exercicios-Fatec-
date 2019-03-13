
package exercicio26mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio26Mod {
    static int V1, V2;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        V1 = teclado.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        V2 = teclado.nextInt();
        mult();
    }
    static void mult()
    {
        int mult = 0;
        if (V1>V2)
        {
            mult = V1%V2;
        }
        else
        {
            mult = V2%V1;
        }
        if (mult == 0)
        {
            System.out.println("O maior é multiplo do menor");
        }
        else
        {
            System.out.println("O maior não é multiplo");
        }
    }
}
