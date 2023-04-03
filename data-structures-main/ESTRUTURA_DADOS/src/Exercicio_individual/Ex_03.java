package Exercicio_individual;

import lista_duplamente_encadeada.Nodo;

public class Ex_03 {
	private Nodo inicio;
	private Nodo fim;
	
	public void mediaLista() {
		Nodo aux = inicio;
		int maior = aux.getDado();
		int menor = aux.getDado();
		float soma = 0;
		int i= 0;
		
		while(aux != null) {
			i++;
			soma+= aux.getDado();
			if(aux.getDado() > maior) {
				maior = aux.getDado();
			}else if(aux.getDado() < menor) {
				menor = aux.getDado();
			}
			aux = aux.getProx();
		}
		System.out.println("Menor numero da lista: "+menor);
		System.out.println("Maior numero da lista: "+maior);
		System.out.println("Media: "+(soma/i));
			
	}
	
	// dup encadeada normal abaixo
	public void inserirInicio(int dado) {
		Nodo novo = new Nodo(dado);
		if(inicio != null) {
			inicio.setAnt(novo);
			novo.setProx(inicio);
		}
		inicio = novo;
		if(fim == null) {
			fim = novo;
		}
	}
	public void inserirFinal(int dado) {
		Nodo novo = new Nodo(dado);
		if(fim != null) {
			fim.setProx(novo);
			novo.setAnt(fim);
		}
		fim = novo;
		if(inicio == null) {
			inicio = novo;
		}
	}
	
	public void removerInicio() {
		Nodo nodoRemovido = inicio;
		if(inicio == null) return;
				
		inicio = inicio.getProx();
		if(inicio != null) {
			inicio.setAnt(null);
		}
		if(nodoRemovido == fim) {
			removerFinal();
		}
	}
	
	public void removerFinal() {
		Nodo nodoRemovido = fim;
		if(fim == null) return;
				
		fim = fim.getAnt();
		if(fim != null) {
			fim.setProx(null);
		}
		if(nodoRemovido == inicio) {
			removerInicio();
		}
	}
	public void removerComValor(int valor) {
		Nodo nodoRemovido = null;
		Nodo aux = inicio;
		while(aux != null) {
			if(aux.getDado()== valor) {
				nodoRemovido = aux;
				break;
			}
			aux = aux.getProx();
		}
		if(nodoRemovido == null) return;
		
		if(nodoRemovido == inicio) {
			removerInicio();
		}else if(nodoRemovido == fim) {
			removerFinal();
		}else {
			nodoRemovido.getAnt().setProx(nodoRemovido.getProx());
			nodoRemovido.getProx().setAnt(nodoRemovido.getAnt());
		}
	}
	
	public String mostrarLista() {
		String lista ="";
		if(inicio == null)return lista;
		Nodo aux = inicio;
		while(aux != null) {
			lista+=(aux.getDado()+"\n");
			aux = aux.getProx();
		}
		return lista;
	}
}
