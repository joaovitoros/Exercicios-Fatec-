
package ex5vt;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class EX5VT {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int VT[] = new int [21];
        int I, I2, S = 0;
        for (I=1; I<=20; I++)
        {
            System.out.println("Digite o " +I +"º numero: ");
            VT[I] = teclado.nextInt();
        }
        for (I=1; I<=10; I++)
        {
            I2 = 21-I;
            S = S+ (VT[I]-VT[I2]);
        }
        System.out.println("Soma igual á: " +S);
    }
    
}
