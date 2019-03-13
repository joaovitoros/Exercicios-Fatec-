package exercicio41;

/**
 *Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 * João V. Oliveira
 */
public class Exercicio41 {


    public static void main(String[] args) {
        System.out.println("As possibilidades são: ");
        int D1 = 7;
        int D2 = 0;
        int vezes = 0;
        while (vezes<=5)
        {
            D1 = D1-1;
            D2 = D2+1;
            vezes = vezes+1;
            System.out.println("O numero no primeiro dado ser: " +D1 +" e no segundo: " +D2);
        }
    }
    
}
