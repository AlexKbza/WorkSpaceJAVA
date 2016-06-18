package Ejemplo;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		Estudiante E1 = new Estudiante("0524403419", "9801");
		E1.setNombre("Manuel"); E1.setApellido("Rosales"); E1.setCiudad("Esmeraldas");E1.setCarrera("Contabilidad");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		Estudiante E2 = new Estudiante("0801942962", "Margarita", "Valencia", "9910");
		E2.setCiudad("Quito"); E2.setCarrera("Enfermeria");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Estudiante E3 = new Estudiante("Jennifer", "Cabeza", "5260");
		E3.setCedula("21004578963"); E3.setCiudad("El Oro"); E3.setCarrera("Diseño Grafico");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Estudiante E4 = new Estudiante("0704403419", "Denis", "Cabeza", "Esmeraldas", "9801", "Sistemas");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("\n=========================================");
		System.out.println("\tVIVEN EN ESMERALDAS");
		System.out.println("=========================================");
		E1.veriCity();
		E2.veriCity();
		E3.veriCity();
		E4.veriCity();
		
		System.out.println("\n=========================================");
		System.out.println("\t\tTODOS");
		System.out.println("=========================================");
		E1.show_inf();
		E2.show_inf();
		E3.show_inf();
		E4.show_inf();
		
		int y = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero:"));
		if(y == 1){
			for(int x=0; x<50; x++)
				System.out.println();
		}
	}

}
