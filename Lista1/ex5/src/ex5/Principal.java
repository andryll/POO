package ex5;
import java.util.Scanner;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}//constructor

	public static void main(String[] args) {
		Descobrir aleatorio = new Descobrir();
		System.out.println("Foi gerado um número aleatório entre 1 e 10");
		
		boolean equivalente = false;
		int numero;
		
		Scanner scanner = new Scanner(System.in);
		
		while(!equivalente) {
			System.out.println("Digite um numero de 1 a 10: ");
			
			do {
				
			numero = scanner.nextInt();
			
			if(numero < 1 || numero > 10) {
				System.out.println("Somente são aceitos numeros entre 1 e 10. Por favor digite novamente: ");
			}//if
			}while(numero < 1 || numero > 10);
			
			equivalente = aleatorio.verifica(numero);
		}//while
	}//main
}//class
