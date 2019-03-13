//Sistema de estatíticas de acidentes de 2017;
//Autor: André Luís Mendes;
//Data 26/10/2017;
package Estatistica;

import java.io.*;//Importação do Imput/Output Exception
import javax.swing.*;

//Classe de métodos
public class ClasseMetodos {

    //Método de Gravação dos dados em um arquivo .txt
    public Acidentes[] GravaAcidentes(Acidentes[] acidentes) throws IOException {
        
        int i;
        String fileName = "ArquivoAcidentes.txt"; //"ArquivoAcidentes.txt" nome do arquivo criado na pasta raiz do projeto
        BufferedWriter gravacao = new BufferedWriter(new FileWriter(fileName)); //Buffer de escrita padrão
        for (i = 0; i < 1; i++) {
            acidentes[i] = new Acidentes();
        }
        for (i = 0; i < 1; i++) {
            
            acidentes[i].codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade: "));
            gravacao.write(Integer.toString(acidentes[i].codigo));
            gravacao.newLine();
            
            acidentes[i].NCidade = JOptionPane.showInputDialog("Digite o nome da cidade: ");
            gravacao.write(acidentes[i].NCidade);
            gravacao.newLine();
            
            acidentes[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes: "));
            gravacao.write(Integer.toString(acidentes[i].quantidade));
            gravacao.newLine();
            
            acidentes[i].tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do veículo: "));
            gravacao.write(Integer.toString(acidentes[i].tipo));
            gravacao.newLine();
            
        }
        JOptionPane.showMessageDialog(null, "Gravação efetuada com sucesso! ");//Mensagem de confirmação da gravação sem erros
        JOptionPane.showMessageDialog(null, "Voltando ao Menu de opções ");
        gravacao.close();//Fechamento da gravação
        return acidentes;
    }

    //Método de leitura dos dados do .txt 
    public void LerAcidentes(Acidentes[] acidentes) throws IOException {
        int i;
        String fileName = "ArquivoAcidentes.txt";//"ArquivoAcidentes.txt" será lido
        BufferedReader ler = new BufferedReader(new FileReader(fileName));//Buffer de leitura
        for (i = 0; i < 1; i++) {
            acidentes[i] = new Acidentes();
        }
        for (i = 0; i < 1; i++) {
            acidentes[i].codigo = Integer.parseInt(ler.readLine());
            acidentes[i].NCidade = ler.readLine();
            acidentes[i].quantidade = Integer.parseInt(ler.readLine());
            acidentes[i].tipo = Integer.parseInt(ler.readLine());
        }
        for (i = 0; i < 1; i++) {
            JOptionPane.showMessageDialog(null, acidentes[i].codigo + "\n"
                    + acidentes[i].NCidade + "\n"
                    + acidentes[i].quantidade + "\n"
                    + acidentes[i].tipo + "\n");
        }
        ler.close();//Fechamento da leitura
    }

//Método de consulta por tipo de veículo
    public void Cveiculo(Acidentes[] acidentes) throws IOException {
        
        int opc, i;
        
        opc = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do veículo: "));
        
        for (i = 0; i < 1; i++) {
            
            if (opc == (acidentes[i].tipo)) {
                JOptionPane.showMessageDialog(null, acidentes[i].codigo + "\n"
                        + acidentes[i].NCidade + "\n"
                        + acidentes[i].quantidade + "\n"
                        + acidentes[i].tipo + "\n");
            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }
        
    }
}
