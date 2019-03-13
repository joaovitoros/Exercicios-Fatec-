
package exercicio22mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio22Mod {
static int Vint1, Vint2;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        Vint1 = teclado.nextInt();
        System.out.println("Digite outro valor inteiro: ");
        Vint2 = teclado.nextInt();
        ordem();
    }
    static void ordem()
    {
        if (Vint1>Vint2)
        {
            System.out.println("A ordem crescente é: " +Vint2 +" e " +Vint1);
        }
        else
        {
            System.out.println("A ordem crescente é: " +Vint1 +" e " + Vint2);
        }
    }
    
}
