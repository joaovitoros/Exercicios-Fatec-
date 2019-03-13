
package exercicio28mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio28Mod {
    static float precoA, vendaM;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o preço atual do produto: ");
        precoA = teclado.nextFloat();
        System.out.println("Digite a venda mensal do produto: ");
        vendaM = teclado.nextFloat();
        Novop();
    }
    static void Novop()
    {
        float PrecoN;
        if ((vendaM<500 && precoA<30))
        {
            PrecoN = (float) (precoA*1.10);
            System.out.println("Novo preço será de: " +PrecoN);
        }
        else if ((vendaM>=500 && vendaM<1000) && (precoA>=30 && precoA<80))
        {
            PrecoN = (float) (precoA*1.15);
            System.out.println("Novo preço será de: " +PrecoN);
        }
        else if ((vendaM>=1000) && (precoA>=80))
        {
            PrecoN = (float) (precoA*0.95);
            System.out.println("Novo preço será de: " +PrecoN);
        }
        else
        {
            PrecoN = precoA;
            System.out.println("Novo preço igual ao preço atual: " +PrecoN);
        }
    }
    
}
