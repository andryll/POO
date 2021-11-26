package lista2_ex2;

public class Administrativo extends MembroUniversidade{
	
	private String horarioEntrada;
	
	public Administrativo() {
	}//constructor1
	
	public Administrativo(String nome) {
		super(nome);
	}//constructor2
	
	public Administrativo(float pagamento) {
		super(pagamento);
	}//constructor3
	
	public Administrativo(String nome, float pagamento) {
		super(nome, pagamento);
	}//constructor4

	public void setPagamento (float pagamento) {
		this.pagamento = pagamento;
	}//pagamento
	
	public float getPagamento () {
		return this.pagamento;
	}//getPagamento
	
	public void setNome (String nome) {
		this.nome = nome;
	}//setNome
	
	public String getNome() {
		return this.nome;
	}//getNomme
	
	public void setHorarioEntrada(String entrada) {
		this.horarioEntrada = entrada;
	}//setHorarioEntrada
	
	public String getHorarioEntrada() {
		return this.horarioEntrada;
	}//getHorarioEntrada
	
	public String getMateria() {
		return "Sem matéria";
	}//getMateria
	
	public String getProjeto() {
		return "Sem projeto";
	}//getProjeto
	
}//class
