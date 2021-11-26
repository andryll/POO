package lista2_ex4;

public class Comissionado extends Empregado{
	
	private float taxaComissao;

	public Comissionado(String nome, String sobrenome, float base, float comissao) {
		super(nome, sobrenome, base);
		this.taxaComissao = comissao;
	}//constructor

	public void ganhos() {
		System.out.println("Ganhos: " + (this.taxaComissao + getSalarioBase()));
	}//ganhos
	
	public void imprimir() {
		System.out.println("Nome: " + getNome() + " " + getSobrenome());
	}//imprimir
	
}//class
