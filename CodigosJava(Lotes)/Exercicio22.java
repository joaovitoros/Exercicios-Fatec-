package exercicio22;

import java.util.Scanner;

/**
 *Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * João V. Oliveira
 */
public class Exercicio22 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int a = teclado.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int b = teclado.nextInt();
        if (a>b)
        {
            System.out.println("O maior é: " +a);
            System.out.println("O menor é: " +b);
        }
        else
        {
            System.out.println("O maior é: " +b);
            System.out.println("O menor é: " +a);
        }
        }
    }
    

