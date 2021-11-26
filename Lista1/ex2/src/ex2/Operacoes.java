package ex2;
import java.lang.Math;

public class Operacoes {
	
	private float numero;
	private float comp1;
	private float comp2;
	
	public Operacoes(float numero) {
		this.numero = numero;
	}// Constructor
	
	public Operacoes(float num1, float num2) {
		this.comp1 = num1;
		this.comp2 = num2;
	}// Constructor

	public float abs() {
		return java.lang.Math.abs(this.numero);
	}// abs
	
	public double ceil() {
		return java.lang.Math.ceil(this.numero);
	}//ceil
	
	public double cos() {
		return java.lang.Math.cos(this.numero);
	}//cos
	
	public double exp() {
		return java.lang.Math.exp(this.numero);
	}//exp
	
	public double floor() {
		return java.lang.Math.floor(this.numero);
	}//floor
	
	public double log() {
		return java.lang.Math.log(this.numero);
	}//log
	
	public float max() {
		return java.lang.Math.max(this.comp1, this.comp2);
	}//max
	
	public float min() {
		return java.lang.Math.min(this.comp1, this.comp2);
	}//min
	
	public double pow(float pow) {
		return java.lang.Math.pow(this.numero, pow);
	}//pow
	
	public double sqrt() {
		return java.lang.Math.sqrt(this.numero);
	}//square root
}// class
