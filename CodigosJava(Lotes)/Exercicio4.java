
package exercico4;

import java.util.Scanner;

/**
 *Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 * João V. Oliveira
 */
public class Exercico4 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celcius: ");
        float tempc = teclado.nextFloat();
        float tempf = 9*tempc+160;
        tempf = tempf/5;
        System.out.println("Temperatura em Fahrenheit: " +tempf);
    }
    
}
