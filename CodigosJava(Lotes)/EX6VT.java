
package ex6vt;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class EX6VT {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int VT[] = new int [21];
        int I, J, Aux;
        for (I=1; I<=20; I++)
        {
            System.out.println("Digite o " +I +"º valor: ");
            VT[I] = teclado.nextInt();
        }
        for (I=1; I<=20; I++)
        {
            for (J=I+1; J<=20; J++)
            {
                if (VT[I]>VT[J])
                {
                    Aux = VT[I];
                    VT[I] = VT[J];
                    VT[J] = Aux;
                }
            }
        }
        System.out.println("Vetor em ordem é: ");
        for (I=1; I<=20; I++)
        {
            System.out.println("" +VT[I]);
        }
    }
    
}
