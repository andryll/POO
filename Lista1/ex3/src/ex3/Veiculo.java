package ex3;

public class Veiculo {

	private String tipo;
	private String placa;
	private int horachegada;
	private int minutoschegada;
	private int horasaida;
	private int minutossaida;
	
	private int minutostotalchegada;
	private int minutostotalsaida;
	
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}//constructor

	public void cadastrar(String tipo, String placa, int hc, int mc, int hs, int ms) {
		this.tipo = tipo;
		this.placa = placa;
		this.horachegada = hc;
		this.minutoschegada = mc;
		this.horasaida = hs;
		this.minutossaida = ms;
		System.out.println("Veiculo cadastrado com sucesso!");
	}//cadastrar
	
	public String valor() {
		this.minutostotalchegada = (this.horachegada * 60) + this.minutoschegada;
		this.minutostotalsaida = (this.horasaida * 60) + this.minutossaida;
		
		if(minutostotalchegada > minutostotalsaida) {
			minutostotalsaida += 1440;
		}//if
		
		if((minutostotalsaida - minutostotalchegada) <= 30) {
			return "Gratuito";
		}else if(((minutostotalsaida - minutostotalchegada) <= 60)) {
			return "R$ 10.00";
		}else {
			return "R$ 20,00";
		}//if
	}//valor a ser pago

}//class
