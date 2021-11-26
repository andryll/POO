package ex3;

public class Estacionamento {

	public Estacionamento() {
		// TODO Auto-generated constructor stub
	}//Constructor

	public static void main(String[] args) {

		Veiculo uno = new Veiculo();
		
		uno.cadastrar("Carro", "ABC1234", 23, 50, 01, 40);
		
		System.out.println("Valor a ser pago: " + uno.valor());

	}//main

}//class
