
package exercicio29;

import java.util.Scanner;

/**
 *Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 * João V. Oliveira
 */
public class Exercicio29 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do investimento: ");
        float vali = teclado.nextFloat();
        System.out.println("Digite 1 para poupança, ou 2 para renda fixa: ");
        int botao = teclado.nextInt();
        float poup, res, rendf;
        if (botao==1)
        {
           poup = (float) (vali*0.03);
           res = vali+poup;
            System.out.println("O valor corrigido é de: " +res);
        }
        else if (botao==2)
        {
            rendf = (float) (vali*0.05);
            res = vali+rendf;
            System.out.println("O valor corrigido é de: " +res);
        }
    }
    
}
