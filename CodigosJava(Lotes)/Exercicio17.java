
package exercicio17;

import java.util.Scanner;

/**
 *Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 * João V. Oliveira
 */
public class Exercicio17 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tempo de viagem em horas: ");
        float tempo = teclado.nextFloat();
        System.out.println("Digite a velocidade média em K/H: ");
        float vm = teclado.nextFloat();
        float res = tempo*vm;
        res = res/12;
        System.out.println("A quantidade de litros gastos na viagem é de: " +res);
    }
    
}
