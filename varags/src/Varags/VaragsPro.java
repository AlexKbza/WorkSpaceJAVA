package Varags;

import javax.swing.JOptionPane;

public class VaragsPro {
	
	public VaragsPro(){
	}
	
	public void varargs(String ... data){
		String [] array = new String [data.length];
		
		for(int i=0; i<data.length; i++){
			array[i] = data[i];
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog("1.- Ordenar Ascendente\n2.- Ordenar Descendente"));
		
		switch(op){
			case 1:
				ordenarAsc(array);
				System.out.println("\nORDENADO ASCENDENTE");
					view(array);
			break;
			case 2:
				ordenarDes(array);
				System.out.println("\nORDENADO DESSCENDENTE");
					view(array);
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida");
		}
			
	}
	
	private void ordenarAsc( String [] array){
		String aux;
		for(int x=0; x<array.length; x++){
			for(int y=0; y<array.length; y++){
				if(array[x].compareTo(array[y]) <= 0){
					aux = array[x];
					array[x] = array[y];
					array[y] = aux;
				}
			}
		}
	}
	
	private void ordenarDes( String [] array){
		String aux;
		for(int x=0; x<array.length; x++){
			for(int y=0; y<array.length; y++){
				if(array[x].compareTo(array[y]) >= 0){
					aux = array[x];
					array[x] = array[y];
					array[y] = aux;
				}
			}
		}
	}
	private void view( String [] array){
		for(int x=0; x<array.length; x++){
			System.out.println(array[x]);
		}
	}
}
