package ex2;

//Essa nova classe tem como objetivo realizar operações matemáticas básicas entre os dois números recolhidos no Principal,
//tais como Adição, Subtração, Multiplicação e Divisão.
//O número um será a primeira variável nas operações.

public class OperacoesBasicas {
	
	private float num1;
	private float num2;
	
	public OperacoesBasicas(float num1, float num2) {
		this.num1 = num1;
		this.num2 = num2;
	}// Constructor

	public float adicao() {
		return (this.num1 + this.num2);
	}// adição
	
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
