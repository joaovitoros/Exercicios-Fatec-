
package exercicio27;

import java.util.Scanner;

/**
 *Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
 * João V. Oliveira
 */
public class Exercicio27 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero de voltas: ");
        float nunv = teclado.nextFloat();
        System.out.println("Digite quantos metros tem cada volta: ");
        float circm = teclado.nextFloat();
        System.out.println("Digite o tempo em minutos: ");
        float min = teclado.nextFloat();
        float vm = (nunv*circm)/min*60;
        System.out.println(" A velocidade média foi de: " +vm +" KM/H");
    }
    
}
