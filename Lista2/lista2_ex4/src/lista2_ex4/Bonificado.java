package lista2_ex4;

public class Bonificado extends Assalariado{
	
	private float bonificacao;

	public Bonificado(String nome, String sobrenome, float base, float semanal, float bonificacao) {
		super(nome, sobrenome, base, semanal);
		this.bonificacao = bonificacao;
	}//constructor
	
	public void ganhos() {
		System.out.println("Ganhos: " + (this.bonificacao + getSalarioBase() + getSalarioSemanal()));
	}//ganhos
	
	public void imprimir() {
		System.out.println("Nome: " + getNome() + " " + getSobrenome());
	}//imprimir
	
}//class
