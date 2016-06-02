package ControlMulta;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		int velocidad = Integer.parseInt(JOptionPane.showInputDialog("¿A que velocidad iba?"));
		int cumpleanio = JOptionPane.showConfirmDialog(null, "¿Hoy es tu cumpleaño?");
		Multa datos = new Multa(velocidad, cumpleanio);
		datos.proceso();
	}

}
