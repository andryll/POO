package ex9;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public Data() {
	}//constructor

	public void setData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}//setData
	
	public int getDia() {
		return this.dia;
	}//getDia
	
	public int getMes() {
		return this.mes;
	}//getMes
	
	public int getAno() {
		return this.ano;
	}//getAno
	
	public String toString() {
		return "Data: " + this.dia + "/" + this.mes + "/" + this.ano; 
	}//toString
	
}//class
