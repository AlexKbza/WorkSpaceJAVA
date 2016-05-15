package Figura_Rombo;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args){
		Rombo figurita = new Rombo();
		figurita.set_tamanio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la figura:")));
		System.out.println("El numero ingresado es: " + figurita.get_tamanio());
	
		figurita.figura(figurita.get_tamanio());
	}
}
