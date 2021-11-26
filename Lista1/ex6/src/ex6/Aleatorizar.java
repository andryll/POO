package ex6;

// A classe aleatorizar � respons�vel por contar a quantidade de tentativas de acerto do usu�rio. 
// Caso o usu�rio erre o n�mero aleat�rio 3 vezes, um novo numero aleatorio ser� gerado, substituindo umm anterior.
// Dessa forma, o usu�rio s� ter� 3 tentativas de acerto para cada n�mero.

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
