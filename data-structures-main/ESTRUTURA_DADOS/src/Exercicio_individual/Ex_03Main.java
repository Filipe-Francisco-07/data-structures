package Exercicio_individual;

public class Ex_03Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex_03 L1 = new Ex_03();
		
		L1.inserirInicio(4);
		L1.inserirInicio(99);
		L1.inserirInicio(44);
		L1.inserirFinal(7);
		L1.inserirFinal(0);
		
		System.out.println(L1.mostrarLista());
		L1.mediaLista();
		
	}

}
