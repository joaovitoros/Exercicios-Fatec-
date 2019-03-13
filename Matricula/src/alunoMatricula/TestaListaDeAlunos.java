package alunoMatricula;

import javax.swing.JOptionPane;

public class TestaListaDeAlunos 
{
	public static void main(String[] args)
	{
		IVetorMatriculas listaDeAlunos1 = new Matricula();
		Aluno aluno [] = new Aluno [4];
		int i;
		
		for (i=0; i<3; i++) 
		{
			aluno[i] = new Aluno ();
			aluno[i].setNome(JOptionPane.showInputDialog("Nome do aluno: "));
			aluno[i].setRa(JOptionPane.showInputDialog("RA do aluno: "));
		}
		
		for (i=0; i<3; i++) 
		{
			listaDeAlunos1.matricula(aluno[i]);
		}
		
		
		listaDeAlunos1.imprime();
		//listaDeAlunos1.cancelamento(aluno2);
		
	}
}
