package ex6;

// A classe aleatorizar é responsável por contar a quantidade de tentativas de acerto do usuário. 
// Caso o usuário erre o número aleatório 3 vezes, um novo numero aleatorio será gerado, substituindo umm anterior.
// Dessa forma, o usuário só terá 3 tentativas de acerto para cada número.

public class Aleatorizar {

	private int contador;
	
	public Aleatorizar() {
		this.contador = 0;
	}// constructor

	public void shuffle(Descobrir aleatorio) {
		if(this.contador < 3) {
			this.contador++;
		}else {
			aleatorio.modifica();
			System.out.println("\nVoce errou 3 vezes. O numero aleatorio foi modificado\n");
			this.contador = 1;
		}//else
	}//verifica

}//class
