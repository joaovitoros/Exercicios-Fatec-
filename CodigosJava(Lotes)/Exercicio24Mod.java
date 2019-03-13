
package exercicio24mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio24Mod {
static int valor;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        valor = teclado.nextInt();
        div();
    }
    static void div()
    {
        int div2 = valor%2;
        int div3 = valor%3;
        if ((div2==0 && div3==0))
        {
            System.out.println("Numero é divisivel por 2 e 3 simultaneamente");
        }
        else
        {
            System.out.println("Numero não é divisivel por 2 e/ou 3");
        }
    }
    
}
