package exercicio21;

import java.util.Scanner;

/**
 *Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
 *a. Se a média for >= 6,0 exibir “APROVADO”;
 *b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
 *c. Se a média for < 3,0 exibir “RETIDO”.
 * João V. Oliveira
 */
public class Exercicio21 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = teclado.nextFloat();
        System.out.println("Digite a terceita nota: ");
        float nota3 = teclado.nextFloat();
        System.out.println("Digite a quarta nota: ");
        float nota4 = teclado.nextFloat();
        float media = nota1+nota2+nota3+nota4;
        media = media/4;
        System.out.println("A média das notas é: " +media);
        if (media>=6.0)
        {
            System.out.println("Aprovado");
        }
        else if ((media>=3.0 && media<6.0))
        {
            System.out.println("Exame");
        }
        else
        {
            System.out.println("Retido");
        }
        }
    }
    

