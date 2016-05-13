package holamundo;
import javax.swing.*;
public class main {

	public static void main(String[] args) {
		Robot eli = new Robot();
		eli.set_nombre(JOptionPane.showInputDialog("Ingrese un nombre"));
		eli.set_edad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad")));
		
		System.out.println("Tu nombre es: " + eli.get_nombre());
		System.out.println("Tienes " + eli.get_edad() + " anios");
		
	}

}
