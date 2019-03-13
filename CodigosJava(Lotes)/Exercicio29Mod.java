
package exercicio29mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio29Mod {
    static float tipoIn, valorIn;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do investimento: ");
        valorIn = teclado.nextFloat();
        System.out.println("Digite 1 para poupança ou 2 para renda fixa");
        tipoIn = teclado.nextFloat();
        Valorcorrigido();
    }
    static void Valorcorrigido()
    {
        float Poup, RendaF;
        if (tipoIn == 1)
        {
            Poup = (float) (valorIn*1.03);
            System.out.println("O valor da poupança é de: " +Poup);
        }
        else
        {
            RendaF = (float) (valorIn*1.05);
            System.out.println("O valor da renda fixa é de: " +RendaF);
        }
    }
}
