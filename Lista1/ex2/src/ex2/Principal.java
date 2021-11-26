package ex2;
import java.util.Scanner;

public class Principal {
	
	public Principal() {
		// TODO Auto-generated constructor stub
	}// Constructor

	public static void main(String[] args) {
		//Scanneando o números e criando objetos
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número real: ");
		float n1 = scanner.nextFloat();
		Operacoes num1 = new Operacoes(n1);
		System.out.print("Digite o segundo número real: ");
		float n2 = scanner.nextFloat();
		Operacoes num2 = new Operacoes(n2);
		
		Operacoes comp = new Operacoes(n1, n2);
		
		OperacoesBasicas opbas = new OperacoesBasicas(n1, n2);

		//Recebendo potencia
		System.out.println("Os numeros devem ser elevados a qual potencia?");
		float pot = scanner.nextFloat();
		
		//Exibindoo as operacoes
		//Numero 1
		System.out.println("\nOperacoes do primeiro numero:");
		System.out.println("Modulo: " + num1.abs());
		System.out.println("Ceil: " + num1.ceil());
		System.out.println("Cosseno: " + num1.cos());
		System.out.println("Exponencial: " + num1.exp());
		System.out.println("Floor: " + num1.floor());
		System.out.println("Log: " + num1.log());
		System.out.println("Potencia: " + num1.pow(pot));
		System.out.println("Raiz:: " + num1.sqrt() + "\n");
		
		//Numero 2
		System.out.println("Operacoes do segundo numero:");
		System.out.println("Modulo: " + num2.abs());
		System.out.println("Ceil: " + num2.ceil());
		System.out.println("Cosseno: " + num2.cos());
		System.out.println("Exponencial: " + num2.exp());
		System.out.println("Floor: " + num2.floor());
		System.out.println("Log: " + num2.log());
		System.out.println("Potencia: " + num2.pow(pot));
		System.out.println("Raiz:: " + num2.sqrt() + "\n");
		
		//Comparacoes
		System.out.println("Operacoes comparativas:");
		System.out.println("Maior: " + comp.max());
		System.out.println("Menor: " + comp.min() + "\n");
		
		//Operações básicas		
		System.out.println("Operacoes basicas entre o primeiro e o segundo numero:");
		System.out.println("Adicao (Num1 + Num2): " + opbas.adicao());
		System.out.println("Subtracao (Num1 - Num2): " + opbas.subtracao());
		System.out.println("Multiplicacao (Num1 * Num2): " + opbas.produto());
		System.out.println("Divisao (Num1 / Num2): " + opbas.razao());

	}// main

}// class
