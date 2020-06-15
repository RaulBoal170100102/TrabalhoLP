package Trabalho;

public interface Rua {
	
	public void inserir(String Rua);
	public void remover(String Rua);
	public NoRua removerNo(NoRua raiz);
	public int altura();
	public NoRua rotacaoDireita();
	public NoRua rotacaoEsquerda();
	public NoRua rotacaoDuplaEsquerdaDireita();
	public NoRua rotacaoDuplaDireitaEsquerda();
	public void inserEncomenda(String Rua, String Encomenda);
	public void removEncomenda(String Rua, String Encomenda);
	public NoRua procurar(String Rua);
	public NoRua Balanceado();
	public boolean isEmpty();
	public NoRua encontraCurta(NoRua raiz);
}