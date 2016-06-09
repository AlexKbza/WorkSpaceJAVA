package numVocales;
import javax.swing.*;
public class main {

	public static void main(String[] args) {
		Procesos cadena = new Procesos();
		
		cadena.setCadena(JOptionPane.showInputDialog("Ingrese una palabra:"));
		cadena.show();

	}

}
