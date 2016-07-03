package Fichero;

import javax.swing.JOptionPane;

public class Items {
	private String Ip, fecha;
	private int repetir;
	
	public Items(){
		
	}
	public Items(String Ip, int repetir, String fecha){
		this.Ip = Ip;
		this.repetir = repetir;
		this.fecha = fecha;
	}
	public String getIp() {
		return Ip;
	}
	public void setIp(String ip) {
		Ip = ip;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getRepetir() {
		return repetir;
	}
	public void setRepetir(int repetir) {
		this.repetir = repetir;
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "Finalizando Programa");
	}
}
