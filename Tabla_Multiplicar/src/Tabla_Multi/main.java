package Tabla_Multi;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		Tabla numTabla =new Tabla();
		
		numTabla.setNum(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero")));
		numTabla.tablaMulti();
		
		numTabla = null;
		System.gc();

	}

}
