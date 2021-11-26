package ex7;

public class Principal {

	public Principal() {
	}//constructor

	public static void main(String[] args) {

		Pendulo pend = new Pendulo();
		
		pend.setPendulo(10, 12, 55);
		
		System.out.println(pend.toString());
		
	}//main

}//class
