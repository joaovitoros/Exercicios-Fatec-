
package ex2vt;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class EX2VT {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int V[] = new int[101];
        int I,J, Aux, M =0;
        for (I=1; I<=100; I++)
        {
            System.out.println("Digite o " +I +"º valor:");
            V[I] = teclado.nextInt();
            M = M + V[I];
        }
        M = M/100;
        System.out.println("A média dos valores é: " +M);
        for (I=1; I<=100; I++)
        {
            for (J=I+1; J<=100; J++)
            {
                if (V[I]>V[J])
                {
                    Aux = V[I];
                    V[I] = V[J];
                    V[J] = Aux;
                }
            }
        }
        System.out.println("O menor é: " +V[1] +" e o maior é: " +V[100]);
    }
    
}
