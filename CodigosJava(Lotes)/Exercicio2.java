
package exercicio2;

import java.util.Scanner;

/**
 *Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 * João V. Oliveira
 */
public class Exercicio2 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salario Inicial: ");
        float salarioi = teclado.nextFloat();
        float salariof = (float) (salarioi*1.15);
        System.out.println("Salario com reajuste é de: " +salariof);
    }
    
}
