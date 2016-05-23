package Trabajo_en_clases2;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		int semana = JOptionPane.showConfirmDialog(null, "¿Hoy es un dia de la semana que se labora?");
		int vacaciones = JOptionPane.showConfirmDialog(null, "¿Estas en vacaciones?");
		Procesos datos = new Procesos(vacaciones, semana);
		datos.operaciones();
	}

}
