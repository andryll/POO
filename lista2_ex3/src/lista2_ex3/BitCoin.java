package lista2_ex3;

public class BitCoin implements IConversorMoeda{

	private String nomeConta;
	private float saldo;
	
	public BitCoin(float saldo) {
		this.saldo = saldo;
		this.nomeConta = "Conta em BitCoin";
	}//constructor

	public void investirBitcoin() {
		saldo *= 1.2;
	}//investirBitcoin
	
	public float getConversaoDolar() {
		return saldo * 57499.95f;
	}//getConversaoDolar
	
	public String getNomeConta() {
		return this.nomeConta;
	}//getNomeConta
	
	public float getSaldo() {
		return this.saldo;
	}//getSaldo
	
}//class
