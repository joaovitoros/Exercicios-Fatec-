
package exercicio26;

import java.util.Scanner;

/**
 *Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * João V. Oliveira
 */
public class Exercicio26 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro numero: ");
        int val1 = teclado.nextInt();
        System.out.println("DIgite o valor do segundo numero: ");
        int val2 = teclado.nextInt();
        int res;
        if (val1>val2)
        {
           res = val1 % val2;
        }
        else
        {
            res = val2 % val1;
        }
        if (res==0)
        {
            System.out.println("O maior numero é multiplo do menor");
        }
        else
        {
            System.out.println("Não é multiplo");
        }
    }
    
}
