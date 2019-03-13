import java.util.Scanner;

/**
 *Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 * João V. Oliveira
 */
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero real: ");
        int a = (int) teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = teclado.nextInt();
        if (a>b)
        {
            int c = a-b;
            System.out.println("A diferença é: " +c);
        }
        else
        {
           int c = b-a;
            System.out.println("A diferença é: " +c);
        
            
        }
    }
}

