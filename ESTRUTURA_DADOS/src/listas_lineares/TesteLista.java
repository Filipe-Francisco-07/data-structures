package listas_lineares;

public class TesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fila F_Par = new Fila(8);
		
		Fila F_Impar = new Fila(8);
		
		Fila F = new Fila(8);
		
		F.inserir(3);
		F.inserir(4);
		F.inserir(5);
		F.inserir(10);
		F.inserir(45);
		F.inserir(32);
		F.inserir(1);
		F.inserir(50);
		
		F.separaFila(F,F_Par,F_Impar);
		System.out.println("Ìmpares:");
		while(!F_Impar.estaVazio()) {
			System.out.println(F_Impar.remover());
		}
		System.out.println("Pares:");
		while(!F_Par.estaVazio()) {
			System.out.println(F_Par.remover());
		}
		
	/*	
		Fila f1 = new Fila(3);
		f1.inserir(4);
		f1.inserir(7);
		f1.inserir(1);
		f1.inserir(3);
		
		f1.remover();
		f1.remover();
		f1.remover();
		f1.remover();
		
	/*	
		Pilha p1 = new Pilha(3);
		p1.push(4);
		p1.push(7);
		p1.push(1);
		p1.push(3);
		System.out.println("topo = "+p1.getTopo());
		p1.pop();
		
		System.out.println("topo = "+p1.getTopo());
		
		
		
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
		*/
		

	}
}
