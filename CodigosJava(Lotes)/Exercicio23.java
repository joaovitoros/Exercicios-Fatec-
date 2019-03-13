package exercicio23;

import java.util.Scanner;

/**
 *Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
 * João V. Oliveira
 */
public class Exercicio23 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int a = teclado.nextInt();
        System.out.println("Digite um numero maior que o anterior: ");
        int b = teclado.nextInt();
        System.out.println("Digite um numero maior que o anterior: ");
        int c = teclado.nextInt();
        System.out.println("Digite qualquer numero: ");
        int d = teclado.nextInt();
        if (d<a)
        {
            System.out.println("A ordem dos numeros é: " +d + a + b + c);
        }
        else if ((d>a && d<b))
        {
            System.out.println("A ordem dos numeros é: " +a +d +b +c);
        }
        else if ((d>b && d<c))
        {
            System.out.println("A ordem dos numeros é: " +a +b +d +c);
        }
        else if (d>c)
        {
            System.out.println("A ordem dos numeros é: " +a +b +c +d);
        }
        }
    }
    
