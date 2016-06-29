package Ejemplo;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		Circulo objebtCir = new Circulo(2, 3, 5);
			JOptionPane.showMessageDialog(null, "El área del circulo es ->  " + objebtCir.area());
		Cuadrado objebtCur = new Cuadrado(3, 2, 4);
			JOptionPane.showMessageDialog(null, "El área del cuadrado es ->  " + objebtCur.area());
	}

}
