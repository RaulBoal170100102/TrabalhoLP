package Trabalho;

import java.util.ArrayList;

public class RuaTree implements Rua {

	public NoRua raiz;

	@Override
	public void inserir(String Rua) {
		raiz=inserir(raiz,Rua);	
	}
	
	private NoRua inserir(NoRua raiz, String Rua) {
		if (raiz == null) {
			return new NoRua();
		}else {
			int ruaTam=raiz.getRua().length();
			raiz.setRuaTam(ruaTam); 
			if (raiz.getRuaTam() > Rua.length()) {
				raiz.setRuaEsq(inserir(raiz.getRuaEsq(), Rua));
			}
			else{
				if(raiz.getRuaTam() < Rua.length()){
					raiz.setRuaDir(inserir(raiz.getRuaDir(), Rua));
				}
			}
		}
		return Balanceado(raiz);
	}
	
	@Override
	public NoRua procurar(String Rua) {
		return procura(raiz,Rua);
	
	}
	
	private NoRua procura(NoRua raiz,String Rua){
		int ruaTam=raiz.getRua().length();
		raiz.setRuaTam(ruaTam);
	    if(raiz==null || raiz.getRua()==Rua){
		    return raiz;
		}else if(raiz.getRuaTam()>Rua.length()){
		    return procura(raiz.getRuaEsq(),Rua);
		}else if(raiz.getRuaTam()<Rua.length()){
		    return procura(raiz.getRuaDir(),Rua);
		}else {
		 	return null;   
		}
	}
	
	@Override
	public void inserEncomenda(String Rua, String Encomenda) {
		
		if(procurar(Rua)!=null) {
			ArrayList<String> encomendas=procurar(Rua).getEncomendas();
			encomendas.add(Encomenda);
			procurar(Rua).setEncomendas(encomendas);
		}else {
			throw new IllegalStateException();
		}
		
	}

	@Override
	public void removEncomenda(String Rua, String Encomenda) {
		if(procurar(Rua)!=null) {
			ArrayList<String> encomendas=procurar(Rua).getEncomendas();
			encomendas.remove(Encomenda);
			procurar(Rua).setEncomendas(encomendas);
		}else{
			throw new IllegalStateException();
		}
		
	}

	@Override
	public NoRua rotacaoDireita() {
		return rotacaoDireita(raiz);
	}
	
	private NoRua rotacaoDireita(NoRua Rua) {
		NoRua raiz2 = raiz.getRuaEsq();
		raiz.setRuaEsq(raiz2.getRuaDir());
		raiz2.setRuaDir(raiz);

		int esq = altura(raiz.getRuaEsq());
		int dir = altura(raiz.getRuaDir());
		raiz.altura = Math.max(esq, dir) + 1;
		esq = altura(raiz2.getRuaEsq());
		dir = altura(raiz);
		raiz2.altura = Math.max(esq, dir) + 1;
		return raiz;
	}

	@Override
	public NoRua rotacaoEsquerda() {
		return rotacaoEsquerda(raiz);
	}
	
	private NoRua rotacaoEsquerda(NoRua Rua) {
		NoRua raiz2 = raiz.getRuaDir();
		raiz.setRuaDir(raiz2.getRuaEsq());
		raiz2.setRuaEsq(raiz);

		int esq = altura(raiz.getRuaEsq()), dir = altura(raiz.getRuaDir());
		raiz2.altura = Math.max(esq, dir) + 1;
		esq = altura(raiz2.getRuaEsq());
		dir = altura(raiz);
		raiz.altura = Math.max(esq, dir) + 1;
		return raiz;
	}

	public NoRua rotacaoDuplaDireitaEsquerda() {
		return rotacaoDuplaDireitaEsquerda(raiz);
	}

	private NoRua rotacaoDuplaDireitaEsquerda(NoRua raiz) {
		raiz.setRuaDir(rotacaoDireita(raiz.getRuaDir()));
		return rotacaoEsquerda(raiz);
	}

	public NoRua rotacaoDuplaEsquerdaDireita() {
		return rotacaoDuplaEsquerdaDireita(raiz);
	}

	private NoRua rotacaoDuplaEsquerdaDireita(NoRua raiz) {
		raiz.setRuaEsq(rotacaoEsquerda(raiz.getRuaEsq()));
		return rotacaoDireita(raiz);
	}
	
	@Override
	public NoRua Balanceado() {
		return Balanceado(raiz);
	}
	
	private NoRua Balanceado(NoRua raiz) {
		if (raiz == null)
			return null;
		else {
			int esq = altura(raiz.getRuaEsq());
			int dir = altura(raiz.getRuaDir());
			if (esq - dir == 2) {
				esq = altura(raiz.getRuaEsq().getRuaEsq());
				dir = altura(raiz.getRuaEsq().getRuaDir());
				if (esq >= dir)
					return rotacaoDireita(raiz);
				else
					return rotacaoDuplaEsquerdaDireita(raiz);
			} else if (dir - esq == 2) {
				dir = altura(raiz.getRuaDir().getRuaDir());
				esq = altura(raiz.getRuaDir().getRuaEsq());
				if (dir >= esq)
					return rotacaoEsquerda(raiz);
				else
					return rotacaoDuplaDireitaEsquerda(raiz);
			} else {
				raiz.altura = Math.max(esq, dir) + 1;
			}
			return raiz;
		}
	}

	@Override
	public int altura() {
		return altura(raiz);
	}
	private int altura(NoRua raiz) {
		if (raiz == null) {
            return 0;
        } else {
            return 1 + Math.max(altura(raiz.getRuaEsq()), altura(raiz.getRuaDir()));
        }
	}

	@Override
	public void remover(String Rua) {
		raiz=remover(raiz,Rua);
	}
	private NoRua remover(NoRua raiz, String Rua) {
		if(raiz==null) {
			return null;
		}else{
			int ruaTam=raiz.getRua().length();
			raiz.setRuaTam(ruaTam);
			if(raiz.getRuaTam()>Rua.length()) {
				raiz.setRuaEsq(remover(raiz.getRuaEsq(), Rua));
			}else{
				if(raiz.getRuaTam() < Rua.length()) {
					raiz.setRuaDir(remover(raiz.getRuaDir(), Rua));
				}else {
					raiz=removerNo(raiz);
				}
			}
		}
		return Balanceado(raiz);
	}
	
	@Override
	public NoRua removerNo(NoRua raiz) {
		if(raiz.getRuaEsq()==null && raiz.getRuaDir() == null)
			return null;
		else{
			if(raiz.getRuaEsq()==null)
				return raiz.getRuaDir();
			else{
				if(raiz.getRuaDir()==null)
					return raiz.getRuaEsq();
				else{
					raiz.setRuaEsq(encontraCurta(raiz.getRuaDir()));
					raiz.setRuaDir(remover(raiz.getRuaDir(), raiz.getRua()));
					return raiz;
				}
			}
		}
	}

	

	@Override
	public boolean isEmpty() {
		return raiz == null;
	}

	@Override
	public NoRua encontraCurta(NoRua raiz) {
		NoRua raiz2=raiz;
		while(raiz2.getRuaEsq()!=null) {
			raiz2=raiz2.getRuaEsq();
		}
		return raiz2;
	}

}