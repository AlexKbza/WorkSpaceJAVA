package Mayusculas;

import javax.swing.JOptionPane;

public class Proc_Mayusculas {
	public Proc_Mayusculas(){}
	private String Cadena;
	
	public String getCadena() {
		return Cadena;
	}
	public void setCadena(String cadena) {
		Cadena = cadena;
	}
	
	public String Convertir(){
		String NewCad;
		if(this.Cadena.length() < 3){
			NewCad = this.Cadena.toUpperCase();
		}else{
			NewCad = this.Cadena.substring(0,this.Cadena.length()-3);
			NewCad += this.Cadena.toUpperCase().substring(this.Cadena.length()-3);
		}
		return NewCad;
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
	}
	
	
}
