package ex9;

public class Computador {
	
	private String nome;
	private String marca;
	private Data data = new Data();
	
	public Computador() {
	}//constructor

	public Computador setNome(String nome) {
		this.nome = nome;
		return this;
	}//setNome
	
	public Computador setMarca(String marca) {
		this.marca = marca;
		return this;
	}//setMarca
	
	public void setData(int dia, int mes, int ano) {
		data.setData(dia, mes, ano);
	}//setData
	
	public String getNome() {
		return this.nome;
	}//getNome
	
	public String getMarca() {
		return this.marca;
	}//getMarca
	
	public String toString() {
		return "Nome: " + this.nome + "\nMarca: " + this.marca + "\n" + data.toString();
	}//toString
	
}//class
