
package exercicio25;

import java.util.Scanner;

/**
 *Receba a hora de início e de final de um jogo (HH,MM) sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
 * João V. Oliveira
 */
public class Exercicio25 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a hora de inicio do jogo: ");
        int hi = teclado.nextInt();
        System.out.println("Digite os minutos iniciais do jogo: ");
        int mi = teclado.nextInt();
        System.out.println("Digite a hora do termino do jogo: ");
        int hf = teclado.nextInt();
        System.out.println("Digite os minutos do termino do jogo: ");
        int mf = teclado.nextInt();
        int hr,mr;
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
