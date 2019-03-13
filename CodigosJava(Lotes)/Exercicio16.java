
package exercicio16;

import java.util.Scanner;

/**
 *Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 * João V. Oliveira
 */
public class Exercicio16 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("A quantidade de horas trabalahdas é de: ");
        float horas = teclado.nextFloat();
        System.out.println("O valor por hora será de : ");
        float valorh = teclado.nextFloat();
        System.out.println("A porcentagem de desconto é de: ");
        float valorp = teclado.nextFloat();
        System.out.println("A quantidade de depentendes é de: ");
        int depem = teclado.nextInt();
        float salariob = horas*valorh;
        float perc = valorp/100;
        float salariol = salariob*perc;
        salariol = salariob-salariol;
        float salariof = salariol+depem*100;
        System.out.println("Salario a receber é de: " +salariof);
    }
    
}
