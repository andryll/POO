package ex2;

//Essa nova classe tem como objetivo realizar opera��es matem�ticas b�sicas entre os dois n�meros recolhidos no Principal,
//tais como Adi��o, Subtra��o, Multiplica��o e Divis�o.
//O n�mero um ser� a primeira vari�vel nas opera��es.

public class OperacoesBasicas {
	
	private float num1;
	private float num2;
	
	public OperacoesBasicas(float num1, float num2) {
		this.num1 = num1;
		this.num2 = num2;
	}// Constructor

	public float adicao() {
		return (this.num1 + this.num2);
	}// adi��o
	
	public float subtracao() {
		return (this.num1 - this.num2);
	}// subtracao
	
	public float produto() {
		return (this.num1 * this.num2);
	}// produto
	
	public float razao() {
		return (this.num1 / this.num2);
	}// razao
}// class
