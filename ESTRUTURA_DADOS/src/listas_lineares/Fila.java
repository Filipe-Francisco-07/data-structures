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
	public Integer remover() {
		if(estaVazio()) {
			return null;
		}
		int valor = inicio.getDado();
		inicio = inicio.getProx();
		tamanho--;
		if(estaVazio()) {
			fim = null;
		}
		return valor;
	}
	
	public void separaFila(Fila F,Fila F_Par,Fila F_Impar) {
		
		while(!F.estaVazio()) {
			int num = F.remover();
			if(num % 2 == 0) {
				F_Par.inserir(num);
			}else {
				F_Impar.inserir(num);
			}
	
		}
		
	}
	
}
