package Mayusculas;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		Proc_Mayusculas cadena = new Proc_Mayusculas();
		
		cadena.setCadena(JOptionPane.showInputDialog("Ingrese una Palabra"));
		JOptionPane.showMessageDialog(null, "Palabra Ingresada:\n        " + cadena.getCadena()
		+ "\nPalabra Nueva:\n        " + cadena.Convertir());
		
		cadena = null;
		System.gc();
	}

}
