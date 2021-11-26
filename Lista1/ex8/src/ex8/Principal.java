package ex8;

public class Principal {

	public Principal() {
	}//constructor

	public static void main(String[] args) {

		Pendulo pend = new Pendulo();
		Angulo ang = new Angulo();
		
		pend.setPendulo(10, 12, 55);
		System.out.println(pend.toString());
		
		ang.setAngulo(1091, 59, 62);
		System.out.println(ang.toString());
		
		
		
	}//main

}//class
