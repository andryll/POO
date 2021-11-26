package lista2_Ex1;

public class Anfibio extends Animal{
	
	protected String quantidadeEscamas;

	public Anfibio(String nome) {
		super(nome);
	}//constructor

	public void setQtdeEscamas(String escamas) {
		this.quantidadeEscamas = escamas;
	}//setQtdeEscamas
	
	public String getQtdeEscamas() {
		return this.quantidadeEscamas;
	}//getQtdeEscamas
	
}//class
