package lista2_ex2;

public class Tecnico extends MembroUniversidade{

	public Tecnico() {
	}//constructor1
	
	public Tecnico(String nome) {
		super(nome);
	}//constructor2
	
	public Tecnico(float pagamento) {
		super(pagamento);
	}//constructor3
	
	public Tecnico(String nome, float pagamento) {
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
	
	public String getMateria() {
		return "Sem materia";
	}//getMateria
	
	public String getHorarioEntrada() {
		return "Não informado";
	}//getHorarioEntrada
	
	public String getProjeto() {
		return "Sem projeto";
	}//getProjeto
}//class
