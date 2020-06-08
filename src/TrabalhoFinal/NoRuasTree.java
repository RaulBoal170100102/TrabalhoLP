package TrabalhoFinal;

public class NoRuasTree {
	//atributos
		private String Rua;
		private NoRuasTree filhoEsquerda;
		private NoRuasTree filhoDireita;
		private ArvoreEdificios edificios;
		
	//acessores

		public String getRua() {
			return Rua;
		}

		public void setRua(String rua) {
			this.Rua = rua;
		}
		
		public NoRuasTree getFilhoEsquerda() {
			return filhoEsquerda;
		}

		public void setFilhoEsquerda(NoRuasTree filhoEsquerda) {
			this.filhoEsquerda = filhoEsquerda;
		}

		public NoRuasTree getFilhoDireita() {
			return filhoDireita;
		}

		public void setFilhoDireita(NoRuasTree filhoDireita) {
			this.filhoDireita = filhoDireita;
		}

	//construtores
		public NoRuasTree(String rua) {
			this.Rua=rua;
			this.filhoEsquerda=null;
			this.filhoDireita=null;
			this.edificios=null;
		}
		
}
