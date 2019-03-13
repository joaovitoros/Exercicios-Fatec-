package exercicio32;

import java.util.Scanner;

/**
 *Receba um número inteiro. Calcule e mostre o seu fatorial.
 * João V. Oliveira
 */
public class Exercicio32 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int N = teclado.nextInt();
        int N1 = N-1;
        while (N1>0)
        {
            N = N*N1;
            N1 = N1-1;
        }
        System.out.println("O fatorial do numero escolhido é: " +N);
    }
    
}
