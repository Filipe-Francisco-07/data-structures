package listas_lineares;

public class Fila {
	private Nodo inicio = null;
	private Nodo fim;
	private int limite = 0;
	private int tamanho = 0;
	
	public Fila(int limite) {
		this.limite=limite;
	}
	public boolean estaVazio() {
		return tamanho == 0;
	}
	public boolean temEspaco() {
		return limite > tamanho;
	}
	public int getInicio() {
		if(!estaVazio()) {
			return inicio.getDado();
		}else {
			System.out.println("Fila está vazia!");
			return -1;
		}
	}
	public void inserir(int dado) {
		if(temEspaco()) {
			Nodo novo = new Nodo(dado);
			if(estaVazio()) {
				inicio = novo;
				fim = novo;
			}else {
				fim.setProx(novo);
				fim = novo;
			}
			tamanho++;
		}else {
			System.out.println("Fila cheia!");
		}
	}
	public void remover() {
		if(!estaVazio()) {
			System.out.println("removido "+inicio.getDado());
			inicio = inicio.getProx();
			tamanho--;
		}else {
			System.out.println("A fila está vazia!");
		
		}
	}
}
