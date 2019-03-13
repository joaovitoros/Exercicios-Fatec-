package exercicio42;

/**
 *Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 * João V. Oliveira
 */
public class Exercicio42 {


    public static void main(String[] args) {
        float N = 1;
        float N1 = 1;
        float N2 = 1;
        float res = 0;
        while (N<50)
        {
            N1 = N1+1;
            N2 = N2+2;
            N = N+1;
            res = 1+(N1/N2);
            System.out.println("Série: " +N1 +"/" +N2);
        }
        System.out.println("Resultado: " +res);
    }
    
}
