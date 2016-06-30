import java.util.Random;

import javax.swing.JOptionPane;

public class Procesos extends Alumno implements Datos{
	private Alumno [] ClaseEs = new Alumno [LimA];
	Random rand = new Random();
	private boolean  salir = false;
	
	public Procesos(){
		llenar();
		showMenu();
	}
	
	private void llenar(){
			for( int iter = 0; iter < LimA; iter++){
				Alumno Data = new Alumno();
				Data.setNombre(Nombre + (iter+1));
				Data.setMatricula(Double.toString((((iter+1)*1000+2)/4)-10));
				Data.setGenero(Genero[iter%2]);
				Data.setNTP(rand.nextInt(NtpMax));
				Data.setNE(rand.nextInt(NeMax));
				
				this.ClaseEs[iter] = Data;
				Data = null;
			}
		
	}
	
	public void show(){
		for( int iter = 0; iter < LimA; iter++){
			System.out.println("Nombre:\t"+this.ClaseEs[iter].getNombre());
			System.out.println("\tN Matricula:\t"+this.ClaseEs[iter].getMatricula());
			System.out.println("\tGenero:\t"+this.ClaseEs[iter].getGenero());
			System.out.println("\tNotas Parciales:\t"+this.ClaseEs[iter].getNTP());
			System.out.println("\tNotas Examenes:\t"+this.ClaseEs[iter].getNE());
		}
	}
	
	private void show_info_es(int iter){
		System.out.println("Nombre:\t"+this.ClaseEs[iter].getNombre());
		System.out.println("\tN Matricula:\t"+this.ClaseEs[iter].getMatricula());
		System.out.println("\tGenero:\t"+this.ClaseEs[iter].getGenero());
		System.out.println("\tNotas Parciales:\t"+this.ClaseEs[iter].getNTP());
		System.out.println("\tNotas Examenes:\t"+this.ClaseEs[iter].getNE());
	}
	
	public void showStudentAprove(){
		System.out.println("\n\n---------------------------------------------------");
		System.out.println("\tESTUDIANTES QUE APRUEBAN\n");
		for( int iter = 0; iter < LimA; iter++){
			if(this.ClaseEs[iter].getNTP() > NtpMin && this.ClaseEs[iter].getNE() >= NeMin)
				show_info_es(iter);
		}
	}
	

	
	private void showMenu(){// Muestra el menu inicial
		int opAux, op;
		
			do{
				op = Integer.parseInt(JOptionPane.showInputDialog(null,"            SELECCIONE UNA OPCION\n\n1.-  Buscar Alumno"
						+ "\n2.-  Modificar Notas Parciales de un Alumno\n3.-  Modificar Nota Examen de un Alumno\n4.-  Mostrar Lista"
						+ "\n5.- Mostrar Promedio General\n6.- Mostrar Alumnos que Aprueban\n7.- Mostrar Alumno con Mejor Notas"
						+"\n8.- Mostrar Alumno con Peores Notas\n9.- Salir\n\n", "MENU PRINCIPAL", 1));
				
				switch(op){
					case 1:
							
					break;
					case 2:
							
					break;
					case 3:
							
					break;
					case 4:
						do{
							op = Integer.parseInt(JOptionPane.showInputDialog(null,"            SELECCIONE UNA OPCION\n\n1.-  Mostrar Lista Ascendente"
									+ "\n2.-  Mostrar Lista Descendente\n3.-  Mostrar Lista Normal\n4.-  Regresar\n\n", "MENU", 1));
							switch(op){
								case 1:
									
								break;
								case 2:
								break;
								case 3:
									show();
								break;
								case 4:
									op = 6;
								break;
								default :
									JOptionPane.showMessageDialog(null, "Opción NO Válida", "ERROR", 2);
							}
						}while(op != 6);
					break;
					case 5:
						
					break;
					case 6:
						
					break;
					case 7:
						showStudentAprove();
					break;
					case 8:
						
					break;
					case 9:
							opAux = JOptionPane.showConfirmDialog(null, "¿Estas seguro que deseas SALIR DEL PROGRAMA?", "SALIR", 0);
								if(opAux == 0) this.salir = true;
					break;
					default :
							JOptionPane.showMessageDialog(null, "Opción NO Válida", "ERROR", 2);
				}
				
			}while(!this.salir);
		
	}
	
	
}
