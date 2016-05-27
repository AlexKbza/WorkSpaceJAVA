package Suma;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		Clase_Suma numero = new Clase_Suma();
		for(int x=0; x<numero.numero.length; x++){
			do{
				numero.setNum(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero en la pocision  "+ (x+1) +":")), x);
			}while(numero.getNum()<0);
		}
		JOptionPane.showMessageDialog(null, "El resultado es:\n" + numero.compara());
		numero = null;
		System.gc();
	}

}
