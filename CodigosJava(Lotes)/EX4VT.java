
package ex4vt;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class EX4VT {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float VT[] = new float[31];
        float Med = 0;
        int I, Vez =0;
        for (I=1; I<=30; I++)
        {
            System.out.println("Digite o " +I +"º valor:");
            VT[I] = teclado.nextFloat();
            Med = Med+VT[I];
        }
        Med = Med/30;
        System.out.println("Média igual á: " +Med);
        for (I=1; I<=30; I++)
        {
            if (VT[I]>=Med)
            {
                Vez = Vez+1;
            }
            else
            {
                System.out.println("A posição de uma nota abaixo da média é a: " +I +"º posição");
            }
        }
        System.out.println("A quantidade de notas acima da média é: " +Vez);
    }
    
}
