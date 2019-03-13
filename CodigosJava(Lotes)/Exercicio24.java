package exercicio24;

import java.util.Scanner;

/**
 *Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 * João V. Oliveira
 */
public class Exercicio24 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite qualquer numero inteiro: ");
        int a = teclado.nextInt();
        int div2 = a % 2;
        int div3 = a % 3;
        if ((div2==0) && (div3==0))
        {
            System.out.println("O valor é divisivel por 2 e 3 simultaneamente");
        }
        else
        {
            System.out.println("O valor não é divisivel por 2 e/ou 3");
        }
        }
}

    
