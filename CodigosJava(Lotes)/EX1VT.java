
package ex1vt;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class EX1VT {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int V[] = new int[50];
        int I, Vezes = 0, M = 0, Div, Imp = 0;
        for (I=1; I<=10; I++)
        {
            System.out.println("Digite o " +I +"º valor:");
            V[I] = teclado.nextInt();
        }
        for (I=1; I<=50; I++)
        {
            if (V[I]>=10 && V[I]<=200)
            {
                M = M+V[I];
                Vezes = Vezes+1;
            }
            else
            {
                I = I+1;
            }
        }
        M = M/Vezes;
        System.out.println("Média dos numeros entre 10 e 200 é: " +M);
        for (I=1; I<=50; I++)
        {
            Div = V[I]%2;
            if (Div==0)
            {
                I = I;
            }
            else
            {
                Imp = Imp+ V[I];
            }
        }
        System.out.println("A soma dos numeros impares dá: " +Imp);
    }
        
            
}
