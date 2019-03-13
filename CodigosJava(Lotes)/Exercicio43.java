
package exercicio43;

/**
 *Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 * João V. Oliveira
 */
public class Exercicio43 {


    public static void main(String[] args) {
        float ana = (float) 1.10;
        float maria = (float) 1.50;
        int vezes = 0;
        while (ana<=maria)
        {
            vezes = vezes+1;
            ana = (float) (ana+0.03);
            maria = (float) (maria+0.02);
        }
        System.out.println("Em " +vezes +" anos Ana ficou maior que maria");
    }
    
}
