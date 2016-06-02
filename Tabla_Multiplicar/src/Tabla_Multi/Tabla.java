package Tabla_Multi;

import javax.swing.*;
public class Tabla {
	public Tabla(){}
	
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	private void line(int n){
		for(int x=0; x<n; x++)
			System.out.print("-");
	}
	
	public void tablaMulti(){
		int limit = this.num, x, y, ini = -1;
			for(y=ini; y<=limit; y++){
				for(x=0; x<=limit; x++){
					switch(y){
						case -1:
							if(x==0)
								System.out.print(" * |");
							else
								System.out.print("  " + x + "  ");
						break;
						case -0:
							System.out.print("-----");
						break;
					}
					if(y > 0){
						if(x == 0){
							System.out.print(" " + y + " |");
						}else{
							if((y*x)<10)
								System.out.print("  " + y*x + "  ");
							else
								System.out.print("  " + y*x + " ");
						}
					}
				}
				System.out.print("\n");
			}
	}
	

	protected void finalize(){
		JOptionPane.showMessageDialog(null, "El programa se va a cerrar");
	}
}
