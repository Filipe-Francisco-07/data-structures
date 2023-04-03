package Exercicio_individual;

public class Ex_02 {
	
	private Nodo_02 inicio;
	private Nodo_02 fim;
	
	public Ex_02() {
		inicio= null;
	}
	
	public Nodo_02 getInicio() {
		return inicio;
	}

	public void setInicio(Nodo_02 inicio) {
		this.inicio = inicio;
	}

	public Nodo_02 getFim() {
		return fim;
	}

	public void setFim(Nodo_02 fim) {
		this.fim = fim;
	}

	public void inserirInicio(int cod, double price, int quant) {
		Nodo_02 novoNodo = new Nodo_02(cod,price,quant);
		if(inicio == null) {
			inicio = novoNodo;
			inicio.setProx(inicio);
			fim = inicio;
		}else {
			novoNodo.setProx(inicio);
			inicio = novoNodo;
			fim.setProx(inicio);
		}
	}
	
	public String mostrarLista() {
		String lista = "";
		if(inicio == null) return lista;
		Nodo_02 aux = inicio;
		do {
			lista+= "Codigo: "+aux.getCod()+" ";
			lista+= "Preco: "+aux.getPrice()+" ";
			lista+= "Quantidade: "+aux.getQuant()+"\n";
			aux = aux.getProx();
		}while(aux!=inicio);
		return lista;
	
	}
	
	public String aplicDesc(double desc) {
		String lista = "";
		if(inicio == null) return lista;
		Nodo_02 aux = inicio;
		
		lista+= "Aplicando desconto ("+desc +"%) nos precos: \n";
		desc = ((100 - desc)/100);
		do {
		
			lista+= "Codigo: "+aux.getCod()+" ";
			lista+= "Preco: "+ (aux.getPrice()*desc)+" ";
			lista+= "Quantidade: "+aux.getQuant()+"\n";
			aux = aux.getProx();
		}while(aux!=inicio);
		return lista;
	
	}
	
	public String relatorioFinal(double desc) {
		String lista = "";
		if(inicio == null) return lista;
		Nodo_02 aux = inicio;
		
		lista+= "Relatorio Final \n";
		desc = ((100 - desc)/100);
		
		do {
			if(aux.getQuant() >= 100) {
				lista+= "Codigo: "+aux.getCod()+" ";
				lista+= "Preco: "+ (aux.getPrice()*desc)+" ";
				lista+= "Quantidade: "+aux.getQuant()+"\n";
			}
			aux = aux.getProx();
		}while(aux!=inicio);
		
		return lista;
	
	}
	
}
