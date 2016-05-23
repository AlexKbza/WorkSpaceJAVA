package Trabajo_en_clases;

import javax.swing.*;
public class Proceso {

	private int num;
	static int numero = 21;
	public Proceso(){	
	}
	
	public int getNum(){
		return this.num;
	}
	
	public void setNum(int num){
		this.num = num;
	}
	
	public void operacion(){
		int result;
		if(this.num > numero){
			result = (this.num - numero)*2;
		}else{
			result = (this.num - numero)*-1;
		} 
		JOptionPane.showMessageDialog(null, "El resultado es: " + result);
	}
}
