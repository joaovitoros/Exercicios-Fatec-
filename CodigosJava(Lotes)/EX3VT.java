
package ex3vt;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class EX3VT {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int V1[] = new int[4];
        int V2[] = new int[4];
        int V3[] = new int[7];
        int I, J =1;
        for (I=1; I<=3; I++)
        {
            System.out.println("Digite o " +I +"º valor: ");
            V1[I] = teclado.nextInt();
        }
        for (I=1; I<=3; I++)
        {
            System.out.println("Digite o " +I +"º valor: ");
            V2[I] = teclado.nextInt();
        }
        for (I=1; I<=3; I++)
        {
            V3[I] = V1[I];
        }
        for (I=4; I<=6; I++)
        {
            V3[I] = V2[J];
            J=J+1;
        }
        System.out.println("Vetor tres igual a: ");
        for (I=1; I<=6; I++)
        {
            System.out.print("" +V3[I]);
        }
    }
    
}
