package lista2_ex4;

import java.util.ArrayList;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}//constructor

	public static void main(String[] args) {

		Bonificado b1 = new Bonificado("Joao","Silva",1000.0f,100.0f,180.0f);
		Comissionado c1 = new Comissionado("Maria","Soraes",1200.0f,250.0f);
		Horista h1 = new Horista("Jomar","Silva Soares",1100.0f, 20);
		
		ArrayList<Empregado> lista = new ArrayList<>();
		lista.add(b1);
		lista.add(c1);
		lista.add(h1);
		
		for(Empregado empregado : lista) {
	
			empregado.imprimir();
			empregado.ganhos();
			
		}//for
		
	}//main

}//class
