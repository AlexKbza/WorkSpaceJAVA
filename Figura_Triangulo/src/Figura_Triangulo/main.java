package Figura_Triangulo;

import javax.swing.*;

public class main {
	public static void main(String[] args){
		Triangulo triangulo = new Triangulo();
		triangulo.set_triangulo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:")));
		System.out.println("El numero ingresado es: " + triangulo.get_triangulo());
		triangulo.figura_triangulo(triangulo.get_triangulo());
		
	}
}
