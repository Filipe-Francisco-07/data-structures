package Exercicio_individual;

public class Nodo_04 {
	private int dado;
	private Nodo_04 Prox;
	
	public Nodo_04(int dado) {
		this.dado = dado;
		this.Prox = null;
	}
	
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public Nodo_04 getProx() {
		return Prox;
	}
	public void setProx(Nodo_04 prox) {
		Prox = prox;
	}
	
}
