package lista2_ex4;

public class Horista extends Empregado{
	
	private int horas;

	public Horista(String nome, String sobrenome, float base, int horas) {
		super(nome, sobrenome, base);
		this.horas = horas;
	}//constructor
	
	//R$ 10,00 a hora
	
	public void ganhos() {
		System.out.println("Ganhos: " + ((this.horas * 10.0f) + getSalarioBase()));
	}//ganhos
	
	public void imprimir() {
		System.out.println("Nome: " + getNome() + " " + getSobrenome());
	}//imprimir
	
	
}//class
