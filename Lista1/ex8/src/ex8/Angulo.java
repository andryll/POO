package ex8;

// A classe angulo recebe uma quantidade de graus, minutos e segundos e retorna a quantidade equivalente de voltas completas,
// graus, minutos e segundos restantes.

public class Angulo {
	
	private int segundos;
	private int minutos;
	private int graus;
	private int voltas;
	
	public Angulo() {
		this.segundos = 0;
		this.minutos = 0;
		this.graus = 0;
		this.voltas = 0;
	}//constructor

	public void setAngulo(int g, int m, int s) {
		
		this.segundos = ((s >= 0 && s <= 59) ? s : s - 60);
		m = (s >= 60) ? m + 1 : m;
		this.minutos = ((m >= 0 && m <= 59) ? m : m - 60);
		g = (m >= 60) ? g + 1 : g;
		this.graus = (g >= 0 && g <= 359) ? g : g % 360;
		this.voltas = g / 360;
	}//setPendulo

	public String toString() {
		return "Voltas Completas: " + this.voltas + "\nGraus: " + this.graus +
				"; Minutos: " + this.minutos + "; Segundos: " + this.segundos;
	}//toString
	
}//class
