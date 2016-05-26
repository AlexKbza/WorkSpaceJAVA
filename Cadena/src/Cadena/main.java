package Cadena;

import javax.swing.JOptionPane;


public class main {

	public static void main(String[] args) {
		String  cad;
		do{
			cad =(JOptionPane.showInputDialog("Ingrese una palabra sin espacios:"));
		}while(cad.length() < 2);
		
		Cadena_Clase cadena = new Cadena_Clase(cad);
		JOptionPane.showMessageDialog(null, "Palabra Ingresada:\n        " + cadena.getCad()
		+ "\nResultado:  " + cadena.compChar());
		cad = null;
		System.gc();
	}

}
