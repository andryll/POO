package lista2_Ex1;

public class Leao extends Terrestre{
	
	private String presaPreferida;

	public Leao(String nome) {
		super(nome);
	}//constructor

	public void setPresa(String presa) {
		this.presaPreferida = presa;
	}//setPresa
	
	public String getPresa() {
		return this.presaPreferida;
	}//getPorte
	
}//class
 