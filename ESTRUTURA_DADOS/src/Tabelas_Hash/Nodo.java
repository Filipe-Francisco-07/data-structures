package Tabelas_Hash;

public class Nodo {
	private String chave;
	private String valor;
	private Nodo Prox;
	
	public Nodo(String chave, String valor) {
		this.chave = chave;
		this.valor=valor;
		this.Prox = null;
	}
	
	
	public String getChave() {
		return chave;
	}


	public void setChave(String chave) {
		this.chave = chave;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}
	public Nodo getProx() {
		return Prox;
	}
	public void setProx(Nodo prox) {
		Prox = prox;
	}
	
}
