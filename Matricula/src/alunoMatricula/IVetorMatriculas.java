package alunoMatricula;

public interface IVetorMatriculas 
{
	public Aluno get(int posicao);

	/* * matricula o aluno em uma posicao especifica da lista */ 
	public void matricula(int posicao, Aluno umAluno);

	/* * matricula um aluno na primeira posicao vazia da lista */
	public void matricula(Aluno umAluno);

	public void cancelamento(Aluno umAluno)    ;

	public void imprime();

	public int estaMatriculado(Aluno aluno);
}
