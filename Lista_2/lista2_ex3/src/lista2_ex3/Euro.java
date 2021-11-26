package lista2_ex3;

public class Euro implements IConversorMoeda{
	
	private String nomeConta; 
	private float saldo;

	public Euro(float saldo) {
		this.saldo = saldo;
		this.nomeConta = "Conta em Euro";
	}//constructor

	public void depositarEuro(float deposito) {
		this.saldo += deposito;
	}//depositarEuro
	
	public float getConversaoDolar() {
		return saldo * 1.13f;
	}//getConversaoDolar
		
	public String getNomeConta() {
		return this.nomeConta;
	}//getNomeConta
	
	public float getSaldo() {
		return this.saldo;
	}//getSaldo
	
}//class
