package lista2_Ex1;

public class Terrestre extends Animal{
	
	protected String quantidadePelos;

	public Terrestre(String nome) {
		super(nome);
	}//Constructor

	public void setQtdePelos(String pelos) {
		this.quantidadePelos = pelos;
	}//setQtdePelos
	
	public String getQtdePelos() {
		return this.quantidadePelos;
	}//getQtdePelos
	
}//Class
