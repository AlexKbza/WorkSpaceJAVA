package Cadena;

import javax.swing.JOptionPane;

public class Cadena_Clase {
	private int num;
	private String cadena;
	private String comp = "ca";// cadena para realizar comparación
	
	public Cadena_Clase(String cad){
		this.cadena = cad;
	}
	
	public int getNum(){
		return this.num;
	}
	
	public String getCad(){
		return this.cadena;
	}
	
	public void setNum(int num){
		this.num = num;
	}
	
	public void setCad(String cadena){
		this.cadena = cadena;
	}
	
	public boolean compChar(){
		if(cadena.substring(0,2).equals(comp))
			return true;
		return false;
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "EL programa se va a cerrar");
	}
}
