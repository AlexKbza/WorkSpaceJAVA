package Suma;

import javax.swing.JOptionPane;

public class Clase_Suma {
	int numero[] = new int[4], num;
	
	public Clase_Suma(){}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num, int indice) {
		this.num = num;
		this.numero[indice] = num;
	}

	public int compara(){
		int total = 0, x, y, aux=0;
		for(x=0; x<numero.length; x++){aux=0;
			for(y=0; y<numero.length; y++){
				if(x != y){
					if(numero[x] == numero[y]){
						aux=1;
						numero[y] = 0;
					}
				}
			}
			if(aux == 1)
				numero[x]=0;
		}
		
		for( x=0; x<numero.length; x++)
			total += numero[x];
		
		return total;
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "El programa se va a cerrar");
	}
}
