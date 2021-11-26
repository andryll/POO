package lista2_ex4;

public abstract class Assalariado extends Empregado{

	private float salarioSemanal;
	
	public Assalariado(String nome, String sobrenome, float base, float semanal) {
		super(nome, sobrenome, base);
		this.salarioSemanal = semanal;
	}//constructor

	public float getSalarioSemanal() {
		return this.salarioSemanal;
	}//getSalarioSemanal
	
}//class
