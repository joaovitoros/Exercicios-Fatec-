package exercicio37;

import java.util.Scanner;

/**
 *Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 * João V. Oliveira
 */
public class Exercicio37 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int val = teclado.nextInt();
        int zero = 0; 
        int F = 0;
        int um = 1;
        int vezes = val-2;
        System.out.print("0" +um);
        while (vezes>0)
        {
            F = zero+um;
            zero = um;
            um = F;
            vezes = vezes-1;
            System.out.print(+F);
        }
    }
    
}

