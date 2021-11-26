package lista2_Ex1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Sapo sapo = new Sapo("Sapo1");
		Ra ra = new Ra("Ra1");
		Macaco macaco = new Macaco("Macaco2");
		Leao leao = new Leao("Leao1");
		
		sapo.setPossuiVeneno(true);
		sapo.setQtdeEscamas("Pouco");
		ra.setPrecoCarne(50.0f);
		ra.setQtdeEscamas("Pouco");
		macaco.setPorte("Pequeno");
		macaco.setQtdePelos("Pouco");
		leao.setPresa("Antilope");
		leao.setQtdePelos("Pouco");
		
		ArrayList <Animal> lista = new ArrayList<>();
		lista.add(sapo);
		lista.add(ra);
		lista.add(macaco);
		lista.add(leao);
		
		for(Animal animal:lista) {
			System.out.println("Nome: " + animal.getNome() + " | Pelos: " + animal.getQtdePelos() + " | Escamas: " + animal.getQtdeEscamas());
			System.out.println("Possui Veneno? " + animal.getPossuiVeneno() + " | Preco da Carne: " + animal.getPrecoCarne() + " | Porte: " + animal.getPorte() + " | Presa predileta: " + animal.getPresa());
			System.out.print("\n");
		}//for
		
	}//main

}//class
