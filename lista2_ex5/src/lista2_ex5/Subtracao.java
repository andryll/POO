package lista2_ex5;

public class Subtracao implements IOperacoes {

	private float operando1;
	private float operando2;
	private int instances = 0;

	public Subtracao() {
		this.instances++;
	}//constructor

	public void setOperando1(float operando1) {
		this.operando1 = operando1;
	}//setOpernado1
	
	public void setOperando2(float operando2) {
		this.operando2 = operando2;
	}//setOpernado1
	
	public float getResultado() {
		return (this.operando1 - this.operando2);
	}//getResultado
	
	public String getNome() {
		return "Subtracao";
	}//getNome
	
	public int getQuantidade() {
		return this.instances;
	}//getQuantidade
	
}//class
