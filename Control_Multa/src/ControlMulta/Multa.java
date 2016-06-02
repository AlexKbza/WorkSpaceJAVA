package ControlMulta;

import javax.swing.JOptionPane;

public class Multa {
	int velocidad, cumpleanio;
	
	public Multa(int velo, int cumple){
		this.velocidad = velo;
		this.cumpleanio = cumple;
	}
	
	public void proceso(){
		int veloCumple = this.velocidad*2;
		int velo = this.velocidad, result= 0;
		
		String multa [] = new String [3];
		multa[0]="No hay Multa";
		multa[1]="Multa Pequeña";
		multa[2]="Multa Grande";
		
		if(this.cumpleanio == 0){
			if(velo <= 60){
				result = 0;
			}else if(velo >60 && velo <81){
				result = 1;
			}else{
				if(velo > 80){
					result = 2;}
			}
			
			JOptionPane.showMessageDialog(null, "Tu Tienes:\n" + multa[result]);
		}else{
			if(veloCumple <= 60){
				result = 0;
			}else if(veloCumple >60 && veloCumple <81){
				result = 1;
			}else{
				if(velo > 80){
					result = 2;}
			}
			JOptionPane.showMessageDialog(null, "POR SER TU CUMPLEAÑOS\nTu Tienes:\n" + multa[result]);
		}
		
		
	}
}
