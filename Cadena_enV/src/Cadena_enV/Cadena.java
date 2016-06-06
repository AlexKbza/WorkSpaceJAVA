package Cadena_enV;

import javax.swing.JOptionPane;

public class Cadena {
String cad;
	
	public Cadena(){}
	
	public String getCad() {
		return cad;
	}

	public void setCad(String cad) {
		this.cad = cad;
	}
	
	private void espa(int num){
		for(int x=0; x<num; x++)
			System.out.print(" ");
	}
	
	public void drawCadena(){
		int espacios = (this.cad.length()*2)-3;
		int line,col;
		
		for(line = 0; line < cad.length(); line ++){
			for(col = 0; col <= line; col++){
				if(col < line){
					System.out.print(" ");
				}else{
					if(line < (cad.length()-1)){
						System.out.print(cad.charAt(line));
						espa(espacios);
						System.out.print(cad.charAt(line));
					}else{
						System.out.print(cad.charAt(line));
					}
				}
				
			}
			System.out.print("\n");
			espacios -= 2;
		}
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "El programa se va a cerrar");
	}
}
