package Calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
	float num1, num2;
	
	public Calculadora(float num1, float num2){
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public float get_num1(){
		return this.num1;
	}
	public float get_num2(){
		return this.num2;
	}
	
	public void set_num1(float num1){
		this.num1 = num1;
	}
	public void set_num1(){
		this.num2= num2;
	}
	
	public void reta(){
		float result = this.num1 - this.num2;
		JOptionPane.showMessageDialog(null, "La resta de:\n" + Float.toString(this.num1) 
		+ " - " +Float.toString(this.num2)+" = " + Float.toString(result));
	}
	
	public void multiplicacion(){
		float result = this.num1 * this.num2;
		JOptionPane.showMessageDialog(null, "La multiplicacion de:\n" + Float.toString(this.num1) 
		+ " * " +Float.toString(this.num2)+" = " + Float.toString(result));
	}
	
	public void suma(){
		float result = this.num1 + this.num2;
		JOptionPane.showMessageDialog(null, "La suma de:\n" + Float.toString(this.num1) 
		+ " + " +Float.toString(this.num2)+" = " +Float.toString(result));
	}
	
	public void raiz_2x2(float num){
		float raiz = (float) Math.sqrt(num);
		JOptionPane.showMessageDialog(null, "La raiz cuadrada de " + Float.toString(num) + " es = " + Float.toString(raiz));
		
	}
	
	public void seno(float num){
		float seno = (float) Math.sin(num);
		JOptionPane.showMessageDialog(null, "El seno de " + Float.toString(num) + " es = " + Float.toString(seno));
	}
	
	public void coseno(float num){
		float coseno = (float) Math.cos(num);
		JOptionPane.showMessageDialog(null, "El coseno de " + Float.toString(num) + " es = " + Float.toString(coseno));
	}
	
	public void tangente(float num){
		float tangente = (float) Math.tan(num);
		JOptionPane.showMessageDialog(null, "La tangente de " + Float.toString(num) + " es = " + Float.toString(tangente));
	}
}

