package Trabajo_en_clases2;

import javax.swing.*;
public class Procesos {
	int vacaciones, semanaL;
	
	public Procesos(int vaca, int sema){
		this.vacaciones = vaca;
		this.semanaL = sema;
	}
	
	public void operaciones(){
		boolean result;			

		if((vacaciones == 1 && semanaL == 0)){
			result = false;
		}else{
			result = true;
		}
		
		if (result == true){
			JOptionPane.showMessageDialog(null, "SI Puedes Descansar");
		}else{
			JOptionPane.showMessageDialog(null, "NO Puedes Descansar");
		}
	
	}
	
}
