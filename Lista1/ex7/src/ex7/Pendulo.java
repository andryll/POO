package ex7;

public class Pendulo {
	
	private int a;
	private int b;
	private int c;
	
	public Pendulo() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}//constructor

	public void setPendulo(int a, int b, int c) {
		
		this.c = ((c >= 0 && c <= 29) ? c : 0);
		b = (c >= 30) ? b+1 : b;
		this.b = ((b >= 0 && b <= 29) ? b : 0);
		this.a = (b >= 30) ? a + 1 : a;
		
	}//setPendulo

	public String toString() {
		return "A:" + this.a + "; B:" + this.b + "; C:" + this.c;
	}//toString
	
}//class
