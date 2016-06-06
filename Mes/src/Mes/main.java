package Mes;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		ProceseMes mes = new ProceseMes();
		
		
		do{
			mes.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UN NUMERO\n")));	
		}while(mes.confirmar() == false);
		
		mes.proceso();
		
		mes = null;
		System.gc();
	}

}
