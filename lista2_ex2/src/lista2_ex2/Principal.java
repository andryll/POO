package lista2_ex2;

import java.util.ArrayList;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}//constructor

	public static void main(String[] args) {
		
		Administrativo adm = new Administrativo("Joao", 5000.0f);
		Professor prof = new Professor("Gerson");
		Tecnico tec = new Tecnico(2500.0f);
		Bolsista bolsista = new Bolsista();
		
		prof.setPagamento(10000.0f);
		tec.setNome("Alberto");
		bolsista.setNome("Julia");
		bolsista.setPagamento(500.0f);
		
		adm.setHorarioEntrada("08:00");
		prof.setMateria("Fisica");
		bolsista.setProjeto("IA");
		
		ArrayList <MembroUniversidade> lista = new ArrayList<>();
		lista.add(adm);
		lista.add(prof);
		lista.add(tec);
		lista.add(bolsista);
		
		for(MembroUniversidade pessoa : lista) {
			
			System.out.println("Nomme: " + pessoa.getNome() + " | Pagamento: " + pessoa.getPagamento() + " | Horario Entrada: "
					+ pessoa.getHorarioEntrada() + " | Materia: " + pessoa.getMateria() + " | Projeto: " + pessoa.getProjeto());	
		}//for
		
	}//main

}//class