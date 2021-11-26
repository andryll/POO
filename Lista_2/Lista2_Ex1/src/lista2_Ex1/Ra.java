package lista2_Ex1;

public class Ra extends Anfibio{
	
	private float precoDaCarne ;

	public Ra(String nome) {
		super(nome);
	}//constructor

	public void setPrecoCarne(float preco) {
		this.precoDaCarne = preco;
	}//setPossuiVeneno
	
	public float getPrecoCarne() {
		return this.precoDaCarne;
	}//getPossuiVeneno
	
}//class
