package CadenaV;
import javax.swing.*;

public class main {

	public static void main(String[] args) {
			Cadena cadIn = new Cadena();
			cadIn.setCad(JOptionPane.showInputDialog("Ingrese una palabra"));
			cadIn.drawCadena();
			cadIn = null;
			System.gc();
	}

}
