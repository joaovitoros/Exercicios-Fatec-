
package exercicio28;

import java.util.Scanner;

/**
 *Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que: Venda Mensal Preço Atual Preço Novo < 500 < 30 + 10% >= 500 e < 1000 >= 30 e < 80 +15% >= 1000 >= 80 - 5% Obs.: para outras condições, preço novo será igual ao preço atual.
 * João V. Oliveira
 */
public class Exercicio28 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o preço atual do produto: ");
        float precoa = teclado.nextFloat();
        System.out.println("Digite a venda mensal do produto: ");
        float vendam = teclado.nextFloat();
        float novop = 0;
        if ((vendam<500 && precoa<30))
        {
           novop = (float) ((precoa*0.10)+precoa);
        }
        else if ((vendam>=500 && vendam<1000 && precoa>=30 && precoa<80))
        {
            novop = (float) (precoa*0.15)+precoa;
        }
        else if ((vendam>=1000 && precoa>=80))
        {
            novop = (float) ((float) precoa-(precoa*0.05));
        }
        else if ((precoa>30 && vendam<500) || (precoa>80 && vendam<1000))
        {
            novop = precoa;
        }
        System.out.println("O novo preço será de: " +novop);
    }
    
}
