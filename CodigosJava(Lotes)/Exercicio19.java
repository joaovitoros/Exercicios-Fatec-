package exercicio19;
import java.util.Scanner;

/**
 *Receba 2 valores reais. Calcule e mostre o maior deles.
 * João V. Oliveira
 */
public class Exercicio19 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero real: ");
        float a = teclado.nextFloat();
        System.out.println("Digite outro numero: ");
        float b = teclado.nextFloat();
        if (a>b)
        {
            System.out.println("O maior numero é: " +a);
        }
        else
        {
            System.out.println("O maior numero é: " +b);
        }
        }
    }
    

