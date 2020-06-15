package Trabalho;

import java.util.ArrayList;

public class NoRua {
	
//atributo
	private String Rua;
	private NoRua RuaEsq;
	private NoRua RuaDir;
	private int RuaTam;
	public int altura;
	private ArrayList<String> Encomendas;
	
//acessores
	public String getRua() {
		return Rua;
	}
	
	public void setRua(String rua) {
		Rua = rua;
	}
	public NoRua getRuaEsq() {
		return RuaEsq;
	}

	public void setRuaEsq(NoRua ruaEsq) {
		RuaEsq = ruaEsq;
	}

	public NoRua getRuaDir() {
		return RuaDir;
	}

	public void setRuaDir(NoRua ruaDir) {
		RuaDir = ruaDir;
	}
	public int getRuaTam() {
		return RuaTam;
	}
	public void setRuaTam(int ruaTam) {
		RuaTam = ruaTam;
	}

	public ArrayList<String> getEncomendas() {
		return Encomendas;
	}
	public void setEncomendas(ArrayList<String> encomendas) {
		Encomendas = encomendas;
	}
//Construtores
	
	public NoRua() {
		this.Rua=null;
		this.RuaTam=0;
		this.Encomendas=new ArrayList<String>();
		this.RuaEsq=null;
		this.RuaDir=null;
		this.altura=1;
	}
	
	public NoRua(String rua) {
		super();
		this.Rua=rua;
		this.RuaTam=0;
		this.Encomendas=new ArrayList<String>();
		this.RuaEsq=null;
		this.RuaDir=null;
		this.altura=1;
	}

	
	
}