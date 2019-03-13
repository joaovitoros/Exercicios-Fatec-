package dicionario;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;



public class Principal {
	public static void main(String[] args) {
		Queue<Palavra> fila = new LinkedList<Palavra>();
		Palavra palavra = new Palavra();
		palavra.setNome(JOptionPane.showInputDialog("Digite a palavra"));
		
		if(fila.contains(palavra.nome) == false){
			palavra.setDefinicao(JOptionPane.showInputDialog("Digite a definicao da palavra"));
			fila.add(palavra);
		}
		else{
			JOptionPane.showMessageDialog(null, "Palavra já cadastrada, sua definicao é: " + palavra.getDefinicao());
		}
	}
}
