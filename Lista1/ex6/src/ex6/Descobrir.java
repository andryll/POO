package ex6;
import java.util.Random;


public class Descobrir {

	private int numero;
	private Random rand = new Random();
	
	public Descobrir() {
		this.numero = (this.rand.nextInt(10) + 1);
	}// constructor

	public boolean verifica(int numero) {
		if(this.numero == numero) {
			System.out.println("Voce descobriu o numero gerado!");
			return true;
		}else if (this.numero > numero) {
			System.out.println("O numero digitado é menor que o numero gerado. Tente novamente.");
			return false;
		}else {
			System.out.println("O numero digitado é maior que o numero gerado. Tente novamente.");
			return false;
		}//else
	}//verifica

	public void modifica() {
		this.numero = (this.rand.nextInt(10) + 1);
	}//modifica o numero aleatorio
}//class
