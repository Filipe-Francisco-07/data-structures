package Tabelas_Hash;

public class ListaEncadeada {
	private Nodo inicio;
	
	public ListaEncadeada(String chave, String valor) {
		inicio = new Nodo(chave,valor);
	}
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public void inserirInicio(String chave,String valor) {
		Nodo novoNodo = new Nodo(chave,valor);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	public void mostraLista() {
		if(vazia()) {
			System.out.println("Null list. :(");
			return;
		}
		Nodo aux = inicio;
		while(aux != null) {
			System.out.print(aux.getChave()+" "+aux.getValor()+" ");
			aux = aux.getProx();
		}
		System.out.println();
		
	}
	
	public void inserirFinal(String chave, String valor) {	
		Nodo aux = inicio;
		Nodo novo = new Nodo(chave,valor);
		
		while(aux.getProx() != null) {
			aux = aux.getProx();
		}
			aux.setProx(novo);

	}
	

	
}
