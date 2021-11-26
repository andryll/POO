package lista2_Ex1;

public class Macaco extends Terrestre{
	
	private String porte;

	public Macaco(String nome) {
		super(nome);
	}//constructor

	public void setPorte(String porte) {
		this.porte = porte;
	}//setPorte
	
	public String getPorte() {
		return this.porte;
	}//getPorte
	
}//class
