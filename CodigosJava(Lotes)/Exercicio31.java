package exercicio31;

/**
 *Calcule e mostre o quadrado dos números entre 10 e 150.
 * João V. Oliveira
 */
public class Exercicio31 {


    public static void main(String[] args) {
        int N, N2 ;
        N=9;
        while ((N>=9 && N<=149))
        {
            N = N+1;
            N2 = N*N;
            System.out.println("" +N2);
        }
    }
}    
