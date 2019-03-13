package calendario;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int dia, mes, ano;
		double julian;
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes: "));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
		julian = (1461*(ano+4800+(mes-14)/12))/4 + 
		(367*(mes-2-12*((mes-14)/12)))/12 
		-(3*((ano+4900+(mes-14)/12)/100))/4+dia-32075;
		JOptionPane.showMessageDialog(null,"Resultado: " +julian);
	}
}
