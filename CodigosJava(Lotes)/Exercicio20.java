package exercicio20;

import java.util.Scanner;

/**
 *Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 * João V. Oliveira
 */
public class Exercicio20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        float a = teclado.nextFloat();
        System.out.println("Digite o valor de B: ");
        float b = teclado.nextFloat();
        System.out.println("Digite o valor de C: ");
        float c = teclado.nextFloat();
        float delta = b*b-4*a*c;
        if (delta<1) 
        {
            System.out.println("O valor de delta deu: " +delta);
            System.out.println("Não existe raizes");
        }
        
    else
        {
            System.out.println("O valor de delta é: " +delta);
            float raiz1 = (float) (-b+Math.sqrt(delta)/2*a);
            float raiz2 = (float) (-b-Math.sqrt(delta)/2*a);
            System.out.println("O valor da raiz x1 é: " +raiz1);
            System.out.println("O valor da raiz x2 é: " +raiz2);
        }
    }
    
}

