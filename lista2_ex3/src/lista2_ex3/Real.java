package lista2_ex3;

public class Real implements IConversorMoeda{

	private String nomeConta;
	private float saldo;
	
	public Real(float saldo) {
		this.saldo = saldo;
		this.nomeConta = "Conta em Real";
	}//constructor

	public void comprarBala() {
		this.saldo -= 0.15;
	}//comprarBala
	
	public float getConversaoDolar() {
		return (this.saldo * 0.18f);
	}///getConversaoDolar
	
	public String getNomeConta() {
		return this.nomeConta;
	}//getNomeConta

	public float getSaldo() {
		return this.saldo;
	}//getSaldo
	
}//class
