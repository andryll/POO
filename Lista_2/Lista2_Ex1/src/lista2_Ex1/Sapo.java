package lista2_Ex1;

public class Sapo extends Anfibio{
	
	private boolean possuiVeneno;

	public Sapo(String nome) {
		super(nome);
	}//constructor

	public void setPossuiVeneno(boolean veneno) {
		this.possuiVeneno = veneno;
	}//setPossuiVeneno
	
	public boolean getPossuiVeneno() {
		return this.possuiVeneno;
	}//getPossuiVeneno
	
}//class
