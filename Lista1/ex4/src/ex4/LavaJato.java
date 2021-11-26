package ex4;

// O estacionamento agora possui um lava-jato, cujo preço da lavagem é baseado no peso do veículo.
// Até 200Kg -> R$ 20,00
// De 200Kg a 600Kg -> R$ 30,00
// De 600Kg a 1000Kg -> R$ 40,00
// De 1000Kg a 1500Kg -> R$ 50,00
// Acima de 1500Kg -> R$ 75,00
//
// Caso o veículo tenha ficado no estacionamento, é dado um desconto de 50% do valor pago pelo estacionamento.



public class LavaJato {

	private Veiculo veiculo;
	private boolean estacionado;
	private float peso;
	private float valor;
	
	public LavaJato() {
		// TODO Auto-generated constructor stub
	}//constructor

	public void cadastrar(float peso) {
		this.peso = peso;
		this.estacionado = false;
		System.out.println("Veiculo cadastrado no lava-jato com sucesso!");
	}//cadastrar (sem estar estacionado)
	
	public void cadastrar(float peso, Veiculo veiculo) {
		this.veiculo = veiculo;
		this.peso = peso;
		this.estacionado = true;
		System.out.println("Veiculo cadastrado no lava-jato com sucesso!");
	}// cadastrar estando estacionado)
	
	public String valor() {
		if(peso <= 200) {
			this.valor = 20;
		}else if(peso <= 600) {
			this.valor = 30;
		}else if(peso <= 1000) {
			this.valor = 40;
		}else if(peso <= 1500) {
			this.valor = 50;
		}else {
			this.valor = 75;
		}//else
		
		if(estacionado) {
			return "Valor a ser pago pela lavagem e pelo estacionamento é R$ " + (this.valor + (veiculo.valor()/2));
		}else {
			return "Valor a ser pago pela lavagem é R$ " + this.valor;
		}//else
		
	}//valor a ser pago

}//class
