
package exercicio16mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio16Mod {
static int Qtdh, ValorH, desconto, Ndependente;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        Qtdh = teclado.nextInt();
        System.out.println("Digite o valor por hora: ");
        ValorH = teclado.nextInt();
        System.out.println("Digite o percentual de desconto: ");
        desconto = teclado.nextInt();
        System.out.println("Digite o numero de dependentes: ");
        Ndependente = teclado.nextInt();
        Calc ();
        desconto = desconto/100;
        Ndependente = Ndependente*100;
    }
    static void Calc()
    {
        float SalarioI = Qtdh*ValorH;
        float SalarioF = SalarioI-desconto;
        SalarioF = SalarioF+Ndependente;
        System.out.println("Salario final será de: " +SalarioF);
    }
}
