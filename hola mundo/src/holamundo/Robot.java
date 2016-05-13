package holamundo;

public class Robot {
	
	String nombre;
	int edad;
	
	public String get_nombre(){
		return this.nombre;
	}
	
	public Robot(){
		
	}
	
	public void set_nombre(String nombre){
		this.nombre = nombre;
	}
	
	public int get_edad(){
		return this.edad;
	}
	
	public void set_edad(int edad){
		this.edad = edad;
	}
}
