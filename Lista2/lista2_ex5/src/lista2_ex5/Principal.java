package lista2_ex5;

import java.util.ArrayList;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}//constructor

	public static void main(String[] args) {

		Soma sum = new Soma();
		Subtracao sub = new Subtracao();
		Divisao div = new Divisao();
		Multiplicacao mult = new Multiplicacao();
		
		ArrayList<IOperacoes> lista = new ArrayList<>();
		lista.add(sum);
		lista.add(sub);
		lista.add(mult);
		lista.add(div);
		
		for(IOperacoes op : lista) {
			
			op.setOperando1(10);
			op.setOperando2(5);
			
			System.out.println(op.getNome() + ": " + op.getResultado() + " | Numero de Instancias: " + op.getQuantidade());
			
		}//for
		
		
	}//main

}//class
