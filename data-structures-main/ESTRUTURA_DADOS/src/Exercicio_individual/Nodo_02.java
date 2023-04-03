package Exercicio_individual;

public class Nodo_02 {
	
	private int cod;
	private double price;
	private int quant;
	
	private Nodo_02 Prox;
	
	
	public Nodo_02(int cod, double price, int quant) {
		this.cod = cod;
		this.price = price;
		this.quant = quant;
		this.Prox = null;
	}
	
	
	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuant() {
		return quant;
	}


	public void setQuant(int quant) {
		this.quant = quant;
	}


	public Nodo_02 getProx() {
		return Prox;
	}
	public void setProx(Nodo_02 prox) {
		Prox = prox;
	}
	
}
