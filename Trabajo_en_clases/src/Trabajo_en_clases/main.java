package Trabajo_en_clases;
import javax.swing.*;

public class main {

	public static void main(String[] args) {
		Proceso dato = new Proceso();
		
		dato.setNum(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:")));
		dato.operacion();
	}

}
