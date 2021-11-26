package ex9;

public class Principal {

	public Principal() {
	}//Constructor

	public static void main(String[] args) {

		Computador comp = new Computador();
		comp.setNome("Computador 1").setMarca("Intel").setData(19,10,2021);
		
		System.out.println(comp.toString());
	}//main

}//class
