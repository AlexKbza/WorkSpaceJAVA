package ejercicio_figura;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		Figura rectangulo = new Figura();
		
		rectangulo.set_altura(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura de la figura:")));
		rectangulo.set_ancho(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho de la figura:")));
		
		System.out.println("Alto: " + rectangulo.get_altura());
		System.out.println("Ancho: " + rectangulo.get_ancho());
		rectangulo.show_shap(rectangulo.get_altura(), rectangulo.get_ancho());
	}
}
