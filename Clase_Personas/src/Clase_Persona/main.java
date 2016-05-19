package Clase_Persona;

import javax.swing.*;
public class main {

	public static void main(String[] args) {
		Persona persona[] = new Persona[1];
		
		for(int x=0; x < persona.length;x++){
			 persona[x] = new Persona();
			 persona[x].code = x+1;
			 persona[x].set_nombre(JOptionPane.showInputDialog("Ingrese su Nombre:", "Persona " + (x+1)));
			 persona[x].set_apellido(JOptionPane.showInputDialog("Ingrese su Apellido:", "Persona " + (x+1)));
			 persona[x].set_cedula(JOptionPane.showInputDialog("Ingrese su # de Cedula:", "Persona " + (x+1)));
			 persona[x].set_telefono(JOptionPane.showInputDialog("Ingrese su # de Telefono:", "Persona " + (x+1)));
			 persona[x].set_residencia(JOptionPane.showInputDialog("Ingrese su Lugar de Residencia:", "Persona " + (x+1)));
			 
			 persona[x].fecha_nac.set_dia(Integer.parseInt(JOptionPane.showInputDialog("\tFECHA DE NACIMIENTO\nIngrese el dia:", "Persona " + (x+1))));
			 persona[x].fecha_nac.set_mes(Integer.parseInt(JOptionPane.showInputDialog("\tFECHA DE NACIMIENTO\nIngrese el mes:", "Persona " + (x+1))));
			 persona[x].fecha_nac.set_anio(Integer.parseInt(JOptionPane.showInputDialog("\tFECHA DE NACIMIENTO\nIngrese el anio:", "Persona " + (x+1))));
			 
			 persona[x].set_casado(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:\n\n1.-Casado/a"
			 		+ "\n2.-Soltero/a\n3.-Viudo/a\n4.-Divorciado/a", "Persona " + (x+1)))); 
		}
		
		for(int x=0; x < persona.length;x++){
		///////////////////( MUESTRA EN PANTALLA )//////////////////////////////////////////////////////	
			/*System.out.println();
			System.out.println("          Persona  " + persona[x].get_code());
			System.out.println("Nombre:               " + persona[x].get_nombre());
			System.out.println("Apellido:             " + persona[x].get_apellido());
			System.out.println("# de CI:              " + persona[x].get_cedula());
			System.out.println("# de Telf:            " + persona[x].get_telefono());
			System.out.println("Estado Civil:  		  " + persona[x].get_casado());
			System.out.println("Lugar de Residencia:  " + persona[x].get_residencia());*/
		
			////////////////////( MUESTRA EN PANTALLA EMERGENTE )//////////////////////////////////////////////////////////////////////
			/*JOptionPane.showMessageDialog(null, "         Persona  " + persona[x].get_code() +
				"\n\nNombre:                       " + persona[x].get_nombre() + 
				"\nApellido:                        " + persona[x].get_apellido() +
				"\n# de CI:                         " + persona[x].get_cedula() +
				"\n# de Telf:                      " + persona[x].get_telefono() +
				"\nEstado Civil:                   " + persona[x].estados() +
				"\nEdad:                         " + persona[x].fecha_nac.edad +
				"\nFecha de Nacimiento:    " + persona[x].fecha_nac.get_dia() +
				" / " + persona[x].fecha_nac.get_mes() + " / " + persona[x].fecha_nac.get_anio() +
				
				"\nLugar de Residencia:    " + persona[x].get_residencia() + "\n");*/
			
			////////////////////////( MUESTRA POR CONDICION )///////////////////////////////////////////////////////////////////////////
			if(persona[x].get_residencia() == "Esmeraldas" || persona[x].get_residencia() == "esmeraldas"){
				if(persona[x].fecha_nac.edad > 30 && persona[x].casado == 1){
					System.out.println();
					System.out.println("          Persona  " + persona[x].get_code());
					System.out.println("   Nombres y Apellidos:\n" + persona[x].get_nombre() + " " + persona[x].get_apellido());
				}
			}
		}
	}

}
