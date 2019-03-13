package PilhasPack;

class Pilha 
{
	private int maxSize;
	private Object[] pilhaVetor;
	private int top;

	public Pilha(int s) 
	{
		maxSize = s;
		pilhaVetor = new Object[maxSize];
		top = -1;
		// nenhum item inserido
	}

	public void push(Object j)
	{
		// insere um item no top da pilha
		pilhaVetor[++top] = j;
		// incrementa o topo e insere o item
	}

	public Object pop()
	{
		// retira um item do topo da pilha
		return pilhaVetor[top--];
		// retorna o item, decrementa a variavel topo
	}

	public Object peek() 
	{
		// obtem o item no topo da pilha
		return pilhaVetor[top];
	}

	public boolean isEmpty() 
	{ // retorna true se a pilha estiver vazia
		return (top == -1);
	}

	public boolean isFull() 
	{

		// retorna true se a pilha estiver cheia
		return (top == maxSize - 1);
	}
}