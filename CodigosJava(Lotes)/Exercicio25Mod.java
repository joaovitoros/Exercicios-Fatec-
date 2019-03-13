
package exercicio25mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio25Mod {
static int hi, mi, hf, mf, hr, mr;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a hora de inicio do jogo: ");
        hi = teclado.nextInt();
        System.out.println("Digite os minutos iniciais do jogo: ");
        mi = teclado.nextInt();
        System.out.println("Digite a hora do termino do jogo: ");
        hf = teclado.nextInt();
        System.out.println("Digite os minutos do termino do jogo: ");
        mf = teclado.nextInt();
        calc();
    }
    static void calc()
    {
            if (hf>hi)
        {
            hr = hf-hi;
        }
        else
        {
            hr = hf+24-hi;
        }
        if (mf>mi)
        {
           mr = mf-mi; 
        }
        else
        {
            mr = mf+59-mi;
        }
        if ((hr>=24 || mr>=60))
        {
            System.out.println("Valor invalido"); 
        }
        else
        {
            System.out.println("O jogo durou :" +hr +"horas e " +mr +"minutos");
        }
    }
}
