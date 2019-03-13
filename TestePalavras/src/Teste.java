import java.io.IOException;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) throws IOException {
		String compara = JOptionPane.showInputDialog(null, "Primeira palavra: ");
		String palavra = JOptionPane.showInputDialog(null, "Segunda palavra: ");
		int acerto = 0;
		double porcentagem = 0;
		for (int i = 0; i < palavra.length(); i++) {
			try {
				if (palavra.charAt(i)==compara.charAt(i)) {
					acerto++;
				}	
			} catch (Exception e) {
		}
		porcentagem = acerto*100/(palavra.length());
		}
		JOptionPane.showMessageDialog(null, "Porcentagem de semelhança " +porcentagem);
	}	
}