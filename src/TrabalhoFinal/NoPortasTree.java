package TrabalhoFinal;

import java.util.ArrayList;

public class NoPortasTree {
//atributos
	private String Porta;
	private ArrayList<NoPortasTree> ProxPortas;
	private ArrayList<String> Entregas;

	
//acessores
	public String getPorta() {
		return Porta;
	}
	public void setPorta(String porta) {
		Porta = porta;
	}
	public ArrayList<NoPortasTree> getProxPortas() {
		return ProxPortas;
	}
	public void setProxPortas(ArrayList<NoPortasTree> proxPortas) {
		this.ProxPortas = proxPortas;
	}
	public ArrayList<String> getEntregas() {
		return Entregas;
	}
	public void setCartas(ArrayList<String> entregas) {
		Entregas = entregas;
	}
	
	
//contrutores
	
	
	public NoPortasTree(String porta) {
		this.Porta=porta;
		ProxPortas=new ArrayList<NoPortasTree>();
	}
	
	public NoPortasTree(String porta,) {
		this.Porta=porta;
		ProxPortas=new ArrayList<NoPortasTree>();
	}
}