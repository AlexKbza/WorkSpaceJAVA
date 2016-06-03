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
		
			for(int x=0; x<xLim; x++){
				for(int y=0; y<yLim; y++){
					vector[x][y] = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO\nPOSICION -" +(x+1)+"- -"+(y+1)+"-:\n"));
				}	
			}
		
		
		Proceso vec = new Proceso(vector, xLim, yLim);
		
		vec.getMax();
		vec.getMin();
		vec.getPromedio();
		vec.getOrAsc();
		vec.getOrDes();
		vec = null;
		System.gc();
		
	}

}
