package lista2_Ex1;

public class Animal {
	
	public String nome;

	public Animal(String nome) {
		setNome(nome);
	}//constructor

	public void setNome(String nome) {
		this.nome = nome;
	}//setNome
	
	public String getNome() {
		return nome;
	}//getNome
	
	public String getQtdeEscamas(){
		return "Não há";
	}//getEscamas	
	
	public String getQtdePelos(){
		return "Não há";
	}//getEscamas
	
	public boolean getPossuiVeneno() {
		return false;
	}//getPossuiVeneno
	
	public float getPrecoCarne() {
		return 0;
	}//getPrecoCarne
	
	public String getPorte() {
		return "Nao informado";
	}//getPorte
	
	public String getPresa() {
		return "Nao informado";
	}//getPresa
	
}//class
