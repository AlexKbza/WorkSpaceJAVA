package Clase_Persona;
import javax.swing.*;

public class Persona {
	String cedula, nombre, apellidos, telef, residencia, estado;
	int casado, code, edad;
	Fecha fecha_nac = new Fecha();
	
	public Persona(){
	}
//////////////////( ALL GET )/////////////////////	
	public int get_code(){
		return this.code;
	}
	
	public String get_cedula(){
		return this.cedula;
	}
	
	public String get_nombre(){
		return this.nombre;
	}
	
	public String get_apellido(){
		return this.apellidos;
	}
	
	public String get_telefono(){
		return this.telef;
	}
	
	public String get_residencia(){
		return this.residencia;
	}
	
	public int get_casado(){
		return this.casado;
	}
//////////////////( ALL SET )//////////////////////////////////////	
	public void set_code(int code){
		this.code = code;
	}
	public void set_cedula(String cedula){
		this.cedula = cedula;
	}
	
	public void set_nombre(String nombre){
		this.nombre = nombre;
	}
	
	public void set_apellido(String apellidos){
		this.apellidos = apellidos;
	}
	
	public void set_telefono(String telef){
		this.telef = telef;
	}
	
	public void set_residencia(String residencia){
		this.residencia = residencia;
	}
	
	public void set_casado(int casado){
		this.casado = casado;
	}
////////////////////////////////////////////////////////
	public String estados(){
		switch (casado){
			case 1:
				this.estado = "Casado/a";
			break;
			case 2:
				this.estado = "Soltero/a";
			break;
			case 3:
				this.estado = "Viudo/a";
			break;
			case 4:
				this.estado = "Divorsiado/a";
			break;
		}
		return estado;
	}
}
