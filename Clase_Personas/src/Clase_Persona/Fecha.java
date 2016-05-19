package Clase_Persona;

public class Fecha {
	int dia, mes, anio, edad, anio_actual = 2016;
	
	public Fecha(){
	}
	
	public int get_dia(){
		return this.dia;
	}
	
	public int get_mes(){
		return this.mes;
	}
	
	public int get_anio(){
		return this.anio;
	}
	
	public void set_dia(int dia){
		this.dia = dia;
	}
	
	public void set_mes(int mes){
		this.mes = mes;
	}
	
	public void set_anio(int anio){
		this.anio = anio;
		this.edad = anio_actual - this.anio;
	}
}
