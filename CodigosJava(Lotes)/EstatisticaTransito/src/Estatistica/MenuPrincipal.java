//Sistema de estatíticas de acidentes de 2017;
//Autor: André Luís Mendes;
//Data 26/10/2017;
package Estatistica;

import java.io.IOException;//Importação do Imput/Output Exception
import javax.swing.JOptionPane;

//Classe principal
public class MenuPrincipal {

    public static void main(String[] args) throws IOException {

        //Declaração de variáveis
        Acidentes[] acidentes = new Acidentes[1];
        ClasseMetodos m = new ClasseMetodos();
        int opc = 0;

        while (opc != 9) {

            //Menu
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU DE ESTATÍSTICA\n\n"
                    + "Estatística de acidentes em 2017\n\n"
                    + "Selecione uma opção abaixo:\n"
                    + "1 - Cadastro de estatísticas\n"
                    + "2 - Consulta por tipo de veículo\n"
                    + "3 - Consulta por quantidade de acidentes\n"
                    + "4 - Consulta todas as cidades\n"
                    + "5 - Consulta (Maior, Menor e Média de acidentes)\n"
                    + "9 - Finalizar programa"));

            //Seleção do menu
            switch (opc) {

                case 1:
                    m.GravaAcidentes(acidentes);
                    break;
                case 2: 
                    m.Cveiculo(acidentes);
                    break;
                case 3: //Instanciar consulta por quantidade
                    break;
                case 4:
                    m.LerAcidentes(acidentes);
                    break;
                case 5: //Instanciar consulta maior, menor e média
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Finalizando programa! ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!\nSelecione outra opção.");
            }

        }

    }

}