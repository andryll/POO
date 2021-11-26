package lista2_ex3;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}//constructor

	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		

		Euro contaEuro = new Euro(500.0f);
		BitCoin contaBC = new BitCoin(3.56f);
		Real contaReal = new Real(1000.0f);
		
		contaReal.comprarBala();
		contaEuro.depositarEuro(112.6f);
		contaBC.investirBitcoin();
		
		ArrayList<IConversorMoeda> lista = new ArrayList<>();
		
		lista.add(contaReal);
		lista.add(contaEuro);
		lista.add(contaBC);
		
		for(IConversorMoeda conta : lista) {
			System.out.println(conta.getNomeConta() + " | Saldo: " + df.format(conta.getSaldo()) +
									" | Valor em Dolar: " + df.format(conta.getConversaoDolar()));
		}//for

	}//main

}//class
