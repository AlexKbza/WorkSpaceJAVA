package Matriz;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int xLim,yLim;
		
			do{
				xLim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension en -x- para la matriz"));
				yLim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension en -y- para la matriz"));
				if(xLim<= 0 || yLim<=0)
					JOptionPane.showMessageDialog(null, "Error en la dimensión\n"
							+ "x o y no puede ser 0");
			}while(xLim<= 0 || yLim<=0);
		
		int vector[][] = new int [xLim][yLim];
		Proceso vec = new Proceso(vector, xLim, yLim);
		
		vec.numero();

		vec = null;
		System.gc();
		
	}

}
