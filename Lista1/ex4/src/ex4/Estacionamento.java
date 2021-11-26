package ex4;

public class Estacionamento {

	public Estacionamento() {
		// TODO Auto-generated constructor stub
	}//Constructor

	public static void main(String[] args) {

		Veiculo uno = new Veiculo();
		
		uno.cadastrar("Carro", "ABC1234", 23, 50, 01, 40);
		
		System.out.println("Valor a ser pago no estacionamento: R$ " + uno.valor());
		
		LavaJato carro = new LavaJato();
		carro.cadastrar(800);
		System.out.println(carro.valor());
		
		LavaJato carro2 = new LavaJato();
		carro2.cadastrar(1100, uno);
		System.out.println(carro2.valor());
		

	}//main

}//class
