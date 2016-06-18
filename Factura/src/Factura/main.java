package Factura;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Items> Productos = new ArrayList<Items>();
		Factura Nueva = new Factura(Productos);
			Nueva.showMenu();
			
			Productos = null;
			System.gc();
	}

}
