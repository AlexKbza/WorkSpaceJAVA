package Matriz;
import java.util.Random;
import javax.swing.JOptionPane;

public class Proceso {
	Random rand = new Random();
	
	private int Arr[][], x, y;
	
	public Proceso(int vector[][], int x, int y){
		this.Arr = vector;
		this.x = x;
		this.y = y;	
		JOptionPane.showMessageDialog(null, "\tBIENVENIDOS\n"
				+ "Dale en ACEPTAR para continuar");
		Llenar();
		System.out.println("\nMATRIZ NORMAL\n");
		Mostrar();
	}

	public int[][] getArr() {
		return Arr;
	}

	public void setArr(int[][] arr) {
		Arr = arr;
	}
	
	public void Llenar(){
		for(int x=0; x<this.x; x++){
			for(int y=0; y<this.y; y++){
				this.Arr[x][y] = (rand.nextInt(100));
			}	
		}
	}
		
	public void numero(){
		int x, y, num, con =0;
			do{
				num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 0 al 9:"));
			}while(num<=0 && num >=9);
			
		System.out.println("\nNUMEROS CON ULTIMO DIGITO = "+ num);
		for(x=0; x<this.x; x++){
			for(y=0; y<this.y; y++){
				if( this.Arr[x][y]%10 == num){
						System.out.print(this.Arr[x][y] + " ");
						con++;
						
						if(con == this.x){
							con = 0;
							System.out.print("\n");
						}
				}
			}
		}
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
