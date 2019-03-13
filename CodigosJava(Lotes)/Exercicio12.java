
package exercicio12;

import java.util.Scanner;

/**
 *Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 * João V. Oliveira
 */
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano em que nasceu: ");
        int anon = teclado.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoa = teclado.nextInt();
        int idade = anoa-anon;
        int anof = idade+17;
        System.out.print("Sua idade é: " +idade);
        System.out.println(" e sua idade daqui 17 anos será: " +anof);
    }
    
}
