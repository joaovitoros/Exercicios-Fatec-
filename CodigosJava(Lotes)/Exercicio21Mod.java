
package exercicio21mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio21Mod {
static float nota1, nota2, nota3, nota4, media;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = teclado.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3 = teclado.nextInt();
        System.out.println("Digite a quarta nota: ");
        nota4 = teclado.nextFloat();
        media();
    }
    static void media()
    {
        media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("A média das notas é: " +media);
        if (media>=6)
        {
            System.out.println("Aprovado");
        }
        else if ((media>=3 && media<6))
                {
                    System.out.println("Exame");
                }
        else
        {
            System.out.println("Retido");
        }
    }
}
