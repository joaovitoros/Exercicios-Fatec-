
package exercicio17mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio17Mod {
    static int Temp, VelociM;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tempo de viagem: ");
        Temp = teclado.nextInt();
        System.out.println("Digite a velocidade média em K/H: ");
        VelociM = teclado.nextInt();
        QtdeL();
    }
    static void QtdeL()
    {
        float Qted = (Temp*VelociM)/12;
        System.out.println("A quantidade de litros gasto será de: " +Qted);
    }
}
