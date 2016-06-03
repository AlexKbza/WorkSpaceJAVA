package Matriz;

import javax.swing.JOptionPane;

public class Proceso {
	private int Arr[][], x, y;
	
	public Proceso(int vector[][], int x, int y){
		this.Arr = vector;
		this.x = x;
		this.y = y;
		System.out.println("\nMATRIZ NORMAL\n");
		Mostrar();
		JOptionPane.showMessageDialog(null, "\tBIENVENIDOS\n"
				+ "Dale en ACEPTAR para continuar");
	}

	public int[][] getArr() {
		return Arr;
	}

	public void setArr(int[][] arr) {
		Arr = arr;
	}
	
	public void getMax(){
		int max = this.Arr[0][0] , x, y;
		
		for(x=0; x<this.x; x++){
			for(y=0; y<this.y; y++){
				if(max < this.Arr[x][y]){
					max = this.Arr[x][y];
				}
			}
		}
		JOptionPane.showMessageDialog(null, "El numero MAYOR dentro de la matriz es:\n" + max);
		System.out.println("\nEl numero MAYOR dentro de la matriz es:\n" + max);
	}
	
	public void getMin(){
		int min = this.Arr[0][0] , x, y;
		
		for(x=0; x<this.x; x++){
			for(y=0; y<this.y; y++){
				if(min > this.Arr[x][y]){
					min = this.Arr[x][y];
				}
			}
		}
		JOptionPane.showMessageDialog(null, "El numero MENOR dentro de la matriz es:\n" + min);
		System.out.println("\nEl numero MENOR dentro de la matriz es:\n" + min);
	}
	
	public void getPromedio(){
		int result = 0 , x, y, cont=0;
		
		for(x=0; x<this.x; x++){
			for(y=0; y<this.y; y++){
				cont++;
				result += this.Arr[x][y];
			}
		}
		JOptionPane.showMessageDialog(null, "El Promedio de la matriz es:\n" + (float)(result/cont)*1.1);
		System.out.println("\nEl Promedio de la matriz es:\n" + (float)(result/cont)*1.1+"\n");
	}
	
	public void getOrAsc(){
		int x, y, xcom, ycom, aux;
		
		for(x=0; x<this.x; x++){
			for(y=0; y<this.y; y++){
				for(xcom=0; xcom<this.x; xcom++){
					for(ycom=0; ycom<this.y; ycom++){
						if(this.Arr[xcom][ycom] > this.Arr[x][y]){
							aux = this.Arr[x][y];
							this.Arr[x][y] = this.Arr[xcom][ycom];
							this.Arr[xcom][ycom] = aux;
						}
					}
				}
			}
		}
		System.out.println("\nMATRIZ ASCENDENTE\n");
		Mostrar();
	}
	
	public void getOrDes(){
		int x, y, xcom, ycom, aux;
		
		for(x=0; x<this.x; x++){
			for(y=0; y<this.y; y++){
				for(xcom=0; xcom<this.x; xcom++){
					for(ycom=0; ycom<this.y; ycom++){
						if(this.Arr[xcom][ycom] < this.Arr[x][y]){
							aux = this.Arr[x][y];
							this.Arr[x][y] = this.Arr[xcom][ycom];
							this.Arr[xcom][ycom] = aux;
						}
					}
				}
			}
		}
		System.out.println("\nMATRIZ DESCENDENTE\n");
		Mostrar();
	}
	
	
	private void Mostrar(){
		int x, y;
		
		for(x=0; x<this.x; x++){
			for(y=0; y<this.y; y++){
				if(this.Arr[x][y] < 10)
					System.out.print(this.Arr[x][y] + "  ");
				else
					System.out.print(this.Arr[x][y] + " ");
			}
			System.out.print("\n");
		}

	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
	}
}
