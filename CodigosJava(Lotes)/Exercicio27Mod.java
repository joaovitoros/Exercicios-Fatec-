
package exercicio27mod;

import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Exercicio27Mod {
    static float Nvoltas, Mcirc, Min;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero de voltas: ");
        Nvoltas = teclado.nextFloat();
        System.out.println("Digite a extenção do circuito em metros: ");
        Mcirc = teclado.nextFloat();
        System.out.println("Digite o tempo de duração(Minutos): ");
        Min = teclado.nextFloat();
        Veloc();
    }
    static void Veloc()
    {
        float Veloc = (Nvoltas*Mcirc)/Min*60;
        System.out.println("A velocidade média é de: " + Veloc +"KM/H");
    }   
}
