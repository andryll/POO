package lista2_ex2;

public abstract class MembroUniversidade {
	
	protected String nome;
	protected float pagamento;
	
	public MembroUniversidade() {	
	}//constructor	
	
	public MembroUniversidade(String nome) {	
		this.nome = nome;
	}//constructor2
	
	public MembroUniversidade(float pagamento) {
		this.pagamento = pagamento;
	}//constructor3
	
	public MembroUniversidade(String nome, float pagamento) {
		this.nome = nome;
		this.pagamento = pagamento;
	}//constructor4
	
	public abstract void setPagamento(float pagamento);
	public abstract float getPagamento();
	
	public abstract void setNome(String nome);
	public abstract String getNome();
	
	public abstract String getHorarioEntrada(); 
	
	public abstract String getMateria();
	
	public abstract String getProjeto();
}//class
