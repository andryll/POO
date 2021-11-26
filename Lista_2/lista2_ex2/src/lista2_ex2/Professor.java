package lista2_ex2;

public class Professor extends MembroUniversidade{
	
	private String materia;
	
	public Professor() {
	}//constructor1
	
	public Professor(String nome) {
		super(nome);
	}//constructor2
	
	public Professor(float pagamento) {
		super(pagamento);
	}//constructor3
	
	public Professor(String nome, float pagamento) {
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
	}//getNome
	
	public void setMateria(String materia) {
		this.materia = materia;
	}//setHorarioEntrada

	public String getMateria() {
		return this.materia;
	}//getMateria
	
	public String getHorarioEntrada() {
		return "Não informado";
	}//getHorarioEntrada
	
	public String getProjeto() {
		return "Sem projeto";
	}//getProjeto
	
}//class

