package lista_duplamente_encadeada;

public class TesteLista {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada l1 = new ListaDuplamenteEncadeada();
		l1.inserirFinal(3);
		l1.inserirFinal(5);
		l1.inserirFinal(2);
		l1.inserirInicio(7);

		System.out.println(l1.mostrarLista());
		
		l1.removerComValor(2);
		System.out.println(l1.mostrarLista());
		
		l1.removerFinal();		
		l1.removerInicio();
		
		System.out.println(l1.mostrarLista());
	}

	
}
