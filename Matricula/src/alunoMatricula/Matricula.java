package alunoMatricula;

public class Matricula implements IVetorMatriculas 
{
	private Aluno[] matriculas = new Aluno[4];

	@Override
	public Aluno get(int posicao) 
	{ // TODO Auto-generated method stub
		return null;
	}

	@Override
	public void matricula(int posicao, Aluno umAluno) 
	{ // TODO Auto-generated
														// method stub

	}

	@Override
	public void matricula(Aluno umAluno) 
	
	{   
		for (int i = 0; i < matriculas.length; i++)
			{  
				if (this.matriculas[i] == null)
				{
					 this.matriculas[i] = umAluno; break;    
				}  
			}  
		} 
	@Override 
	public void imprime()
		{   
			System.out.println("===================================");
			for (int i = 0; i < matriculas.length; i++) 
			{ 
				if (matriculas[i] != null)    
					System.out.println("Nome: " + matriculas[i].getNome()+ " RA :"+ matriculas[i].getRa());  
					
			}
			System.out.println("===================================");
	}

	@Override
	public void cancelamento(Aluno aluno) 
	{
		// TODO Auto-generated method stub
	}

	@Override 
	public int estaMatriculado(Aluno aluno) 
	{  
	// TODO Auto-generated method stub  			
	return 0;  
	}
	
}