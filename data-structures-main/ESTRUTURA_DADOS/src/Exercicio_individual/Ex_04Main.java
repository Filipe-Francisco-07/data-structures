package Exercicio_individual;

public class Ex_04Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex_04 L1 = new Ex_04();
		Ex_04 L2 = new Ex_04();
		
		L1.inserirInicio(3);
		L1.inserirInicio(0);
		L1.inserirInicio(1);
		L2.inserirInicio(1);
		L2.inserirInicio(5);
		L2.inserirInicio(7);
		
		L1.mostraLista();
		L2.mostraLista();
		
		Ex_04 test = new Ex_04();
		
		test.uniao(L1, L2);
		
		test.interseccao(L1, L2);

		
	}

}
