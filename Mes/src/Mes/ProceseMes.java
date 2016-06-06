package Mes;

import javax.swing.JOptionPane;

public class ProceseMes {
	private int mes;
	private String Meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
			"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	
	public ProceseMes(){
		
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	
	
	public void proceso(){
		JOptionPane.showMessageDialog(null, "Numero Ingresado:\n"
				+ this.mes + "\nMes del Anio:\n" + this.Meses[this.mes-1]);
	}
	
	public boolean confirmar(){
		if(this.mes >= 1 && this.mes<= 12)
			return true;
		return false;
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
	}
}
