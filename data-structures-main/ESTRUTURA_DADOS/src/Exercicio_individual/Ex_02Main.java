package Exercicio_individual;

public class Ex_02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex_02 prod = new Ex_02();
		
		double desc = 10;
		
		prod.inserirInicio(3, 27.32, 102);
		prod.inserirInicio(5, 999.00, 140);
		prod.inserirInicio(7, 34, 99);
		prod.inserirInicio(8, 12, 234);
		
		System.out.println(prod.mostrarLista());
		System.out.println(prod.aplicDesc(desc));
		System.out.println(prod.relatorioFinal(desc));
		
		
	}

}
