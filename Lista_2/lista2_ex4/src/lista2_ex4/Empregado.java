package lista2_ex4;

public abstract class Empregado {
	
	private String nome;
	private String sobrenome;
	private float salarioBase;

	public Empregado(String nome, String sobrenome, float base) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioBase = base;
	}//constructor

	public abstract void ganhos();
	public abstract void imprimir();
	
	public String getNome() {
		return this.nome;
	}//getNome
	
	public String getSobrenome() {
		return this.sobrenome;
	}///getSobrenome
	
	public float getSalarioBase() {
		return this.salarioBase;
	}//getSalarioBase
	
}//class
