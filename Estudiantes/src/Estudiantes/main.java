package Estudiantes;

import javax.swing.JOptionPane;
import java.util.Random;
public class main {

	public static void main(String[] args) {
		float min = 0.0f, maxF = 30.0f, maxP = 50.0f;
		Random rand = new Random();
		
		int op, nEs = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes:"));
		Estudiante student[] = new Estudiante[nEs];
		
		for(int x=0; x<nEs; x++){
			student[x] = new Estudiante("Estudiante "+(x+1), "POO", "000"+(x+1), (rand.nextFloat() * (maxP - min) + min), (rand.nextFloat() * (maxF - min) + min));
		}
		do{
			op = student[0].showMenu();
			switch(op){
				case 1:
					student[0].showStudent(student);
				break;
				case 2:
					student[0].searchStudent(student);
				break;
				case 3:
					student[0].showStudentAprove(student);
				break;
				case 4:
					student = null;
				break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion no Valida");
			} 
		}while(op != 4);
		System.gc();
	}

}
