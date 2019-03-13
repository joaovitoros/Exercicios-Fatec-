
package exercicio1;

import java.util.Scanner;

/**
 * Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
 * João V. Oliveira
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do lado do quadrado: ");
        float valor = teclado.nextFloat();
        float area = valor*valor;
        System.out.println("A area do quadrado é: " +area);
    }
    
}
