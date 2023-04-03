package Exercicio_individual;

public class Nodo_03 {

	private int dado;
	private Nodo_03 prox;
	private Nodo_03 ant;
	
	public Nodo_03(int dado) {
		this.dado = dado;
		prox = null;
		ant = null;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public Nodo_03 getProx() {
		return prox;
	}

	public void setProx(Nodo_03 prox) {
		this.prox = prox;
	}

	public Nodo_03 getAnt() {
		return ant;
	}

	public void setAnt(Nodo_03 ant) {
		this.ant = ant;
	}
	
	
}
