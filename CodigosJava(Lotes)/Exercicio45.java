
package exercicio45;

/**
 *Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 * João V. Oliveira
 */
public class Exercicio45 {


    public static void main(String[] args) {
        float N = 1;
        float N1 = 1;
        float N2 = 1;
        float res1 = 0; 
        while (N<15)
        {
            N1 = N1+1;
            N2 = N1*N1;
            N = N+1;
            float res = N1/N2;
            System.out.println("Série: " +N1 +"/" +N2);
            N1 = N1+1;
            N2 = N1*N1;
            N = N+1;
            res1 = res+(N1/N2);
            System.out.println("Série: "+N1 +"/" +N2);
        }
        res1 = 1-res1;
        System.out.println("Resultado: " +res1);
    }
    
}
