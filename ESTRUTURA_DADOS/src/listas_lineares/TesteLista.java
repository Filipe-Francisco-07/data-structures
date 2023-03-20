package listas_lineares;

public class TesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaEncadeada LE1 = new ListaEncadeada();
		
		LE1.inserirInicio(4);
		LE1.inserirInicio(12);
		LE1.inserirInicio(15);
		LE1.inserirInicio(1);
		LE1.inserirInicio(89);
		
		
		LE1.removeLista(89);
	
		LE1.inserirInicio(43);
		LE1.inserirInicio(823);
	
		 
		ListaCircular LC1 = new ListaCircular();
		LC1.inserirInicio(0);
		LC1.inserirInicio(4);
		LC1.inserirInicio(7);
		
		LC1.inserirFinal(6);
		
		System.out.println(LC1.mostrarLista());
		
		LC1.contaDados();
		
		

	}
}
