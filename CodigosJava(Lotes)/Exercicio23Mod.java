
package exercicio23mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio23Mod {
static int a,b,c,d;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        a = teclado.nextInt();
        System.out.println("Digite um numero maior que o anterior: ");
        b = teclado.nextInt();
        System.out.println("Digite um numero maior que o anterior: ");
        c = teclado.nextInt();
        System.out.println("Digite qualquer numero: ");
        d = teclado.nextInt();
        verificação();
        }
    static void verificação()
    {
                if (d<a)
        {
            System.out.println("A ordem dos numeros é: " +d + a + b + c);
        }
        else if ((d>a && d<b))
        {
            System.out.println("A ordem dos numeros é: " +a +d +b +c);
        }
        else if ((d>b && d<c))
        {
            System.out.println("A ordem dos numeros é: " +a +b +d +c);
        }
        else if (d>c)
        {
            System.out.println("A ordem dos numeros é: " +a +b +c +d);
        }
    }
    }
