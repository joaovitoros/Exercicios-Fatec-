package PilhasPack;

public class TestaPilha 
{
	public static void main(String[] args)
	{
		Pilha umaPilha = new Pilha(10);
		EnderecoVisitado  item = new EnderecoVisitado();
		item.setEndereço("https://fatec.sp.gov");
		umaPilha.push(item);
		item = new EnderecoVisitado();
		item.setEndereço("https://centropaulasousa.com");
		umaPilha.push(item);
		item = new EnderecoVisitado();
		item.setEndereço("https://www.google.com");
		umaPilha.push(item);
		
		while (!umaPilha.isEmpty()) 
		{
			EnderecoVisitado value = (EnderecoVisitado) umaPilha.pop();
			System.out.print(value.getEndereço());
			System.out.println(" ");
		}
		System.out.println("");
	}
}
