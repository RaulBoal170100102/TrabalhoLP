package TrabalhoFinal;

public class NoEdificiosTree {
	
	//atributos
		
		private String Edificio;
		private NoEdificiosTree filhoEsquerda;
		private NoEdificiosTree filhoDireita;
		private ArvorePortas portas;
		
		
	//acessores

		public String getEdificio() {
			return Edificio;
		}


		public void setEdificio(String edificio) {
			Edificio = edificio;
		}


		public NoEdificiosTree getFilhoEsquerda() {
			return filhoEsquerda;
		}


		public void setFilhoEsquerda(NoEdificiosTree filhoEsquerda) {
			this.filhoEsquerda = filhoEsquerda;
		}


		public NoEdificiosTree getFilhoDireita() {
			return filhoDireita;
		}


		public void setFilhoDireita(NoEdificiosTree filhoDireita) {
			this.filhoDireita = filhoDireita;
		}
		
		
	//contrutores
		public NoEdificiosTree(String edificio) {
			this.Edificio=edificio;
			this.filhoEsquerda=null;
			this.filhoDireita=null;
			this.portas=null;
		}


	}
