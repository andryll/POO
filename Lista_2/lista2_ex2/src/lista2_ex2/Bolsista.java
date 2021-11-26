package lista2_ex2;

public class Bolsista extends MembroUniversidade{

	private String nomeProjeto;
	
	public Bolsista() {
	}//constructor1
	
	public Bolsista(String nome) {
		super(nome);
	}//constructor2
	
	public Bolsista(float pagamento) {
		super(pagamento);
	}//constructor3
	
	public Bolsista(String nome, float pagamento) {
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
	
	public void setProjeto(String projeto) {
		this.nomeProjeto = projeto;
	}//setProjeto

	public String getProjeto() {
		return this.nomeProjeto;
	}//getProjeto
	
	public String getMateria() {
		return "Sem materia";
	}//getMateria
	
	public String getHorarioEntrada() {
		return "Não informado";
	}//getHorarioEntrada

}//class
