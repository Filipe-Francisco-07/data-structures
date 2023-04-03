package Exercicio_individual;


public class Ex_04 {
private Nodo_04 inicio;
	
	public Ex_04() {
		inicio = null;
	}
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Nodo_04 getInicio() {
		return inicio;
	}
	
	public void uniao(Ex_04 L1, Ex_04 L2) {
		Nodo_04 aux1 = L1.inicio;
		Nodo_04 aux2 = L2.inicio;
		System.out.print("Uniao: \n");
		if(L1.vazia() && L1.vazia()) {
			System.out.print("As duas listas estão vazias.");
		}else if(L1.vazia()) {
			while(aux2 != null) {
				System.out.print(aux2.getDado()+" ");
				aux2 = aux2.getProx();
			}
		
		}else if(L2.vazia()) {
			while(aux1 != null) {
				System.out.print(aux1.getDado()+" ");
				aux1 = aux1.getProx();
			}

		}else{
			while(aux1 != null) {
				System.out.print(aux1.getDado()+" ");
				aux1 = aux1.getProx();
			
			}
			while(aux2 != null) {
				System.out.print(aux2.getDado()+" ");
				aux2 = aux2.getProx();
			}
		}
	
	}
	
	public void interseccao(Ex_04 L1, Ex_04 L2) {
		Nodo_04 aux1 = L1.inicio;
		Nodo_04 aux2 = L2.inicio;
		System.out.print("\nInterseccao: \n");
		if(L1.vazia() && L1.vazia()) {
			System.out.print("As duas listas estão vazias, sem interseccao.");
		}else if(L1.vazia()) {
			System.out.print("Lista 1 vazia, sem interseccao.");
		
		}else if(L2.vazia()) {
			System.out.print("Lista 2 vazia, sem interseccao.");

		}
		while(aux1 != null && aux2 != null) {
			while(aux2 != null) {
				if(aux1.getDado() == aux2.getDado())
					System.out.print(aux1.getDado());
					aux2 = aux2.getProx();
				}
			}
		aux1 = aux1.getProx();
		aux2 = L1.inicio;
		}
	
	public void diferenca(Ex_04 L1, Ex_04 L2) {
		
	}
	
	public void inserirInicio(int dado) {
		Nodo_04 novoNodo = new Nodo_04(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	public void mostraLista() {
		if(vazia()) {
			System.out.println("Null list. :(");
			return;
		}
		Nodo_04 aux = inicio;
		while(aux != null) {
			System.out.print(aux.getDado()+" ");
			aux = aux.getProx();
		}
		System.out.println();
		
	}
	
	public void inserirFinal(int valor) {
		if(vazia()) {
			return;
		}
		
		Nodo_04 aux = inicio;
		Nodo_04 aux2 = inicio;
		
		while(aux2.getProx().getDado() != valor) {
			aux2 = aux2.getProx();
		}
		
		while(aux.getProx() != null) {
			aux = aux.getProx();
		}
		
		if(aux.getProx() == null) {
			
		}
		
	}
	
	public void removeLista(int valor) {
		if(vazia()) {
			System.out.println("Null position, can't delete. :(");
			return;
		}
		if(inicio.getDado()== valor) {
			inicio = inicio.getProx();
			return;
		}
		Nodo_04 aux = inicio;
		while(aux != null) {
			if(aux.getProx().getDado()==valor) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		}		
	}
	
	public void deletarUltimo() {
		if(inicio == null) return;
		
		Nodo_04 aux = inicio;
		Nodo_04 ant = null;
		
		if(inicio.getProx()== null) {
			inicio = null;
			return;
		}
		
		while(inicio.getProx()== null) {
			ant = aux;
			aux = aux.getProx();
		}
		ant.setProx(null);
	}
	
	public int buscarValor(int valor) {
		if(vazia()){
			return -1;
		}
	
		Nodo_04 aux = inicio;
		int posicao = 0;
		while(aux != null) {
			posicao++;
			if(aux.getDado()==valor) {
				return posicao;
			}
			aux = aux.getProx();
		}
		return-1;
	}
	
	
}
