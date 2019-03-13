
package exercicio39;


/**
 *Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: Casa: 1 2 3 4 ... 64 Qdte: 1 2 4 8 ... N
 * João V. Oliveira
 */
public class Exercicio39 {


    public static void main(String[] args) {
        int casa = 1;
        float Qdte = 1;
        while (casa<=64)
        {
            System.out.println("Na casa: " +casa +" tem " +Qdte +"graos");
            casa = casa+1;
            Qdte = Qdte*2;            
        }
    }
    
}