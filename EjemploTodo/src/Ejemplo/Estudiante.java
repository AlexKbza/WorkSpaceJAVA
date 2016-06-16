package Ejemplo;

/**
 * @author Alex Kbza
 *
 */
public class Estudiante extends Persona{
	
	private String matricula, carrera;
	
////////////////////////////////////////////////////////////////////////////
	public Estudiante(){}
	
	public Estudiante(String ced, String matri){
		this.setCedula(ced);
		this.matricula = matri;
	}
	
	public Estudiante(String ced, String nom, String ape, String matri){
		this.setCedula(ced);
		this.setNombre(nom);
		this.setApellido(ape);
		this.matricula = matri;
	}
	
	public Estudiante(String nom, String ape, String matri){
		this.setNombre(nom);
		this.setApellido(ape);
		this.matricula = matri;
	}
	
	public Estudiante(String ced, String nom, String ape, String ciud, String matri, String carre){
		this.setCedula(ced);
		this.setNombre(nom);
		this.setApellido(ape);
		this.setCiudad(ciud);
		this.matricula = matri;
		this.carrera = carre;
	}
////////////////////////////////////////////////////////////////////////////
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public void veriCity(){
		if(this.getCiudad().equals("Esmeraldas"))
			show_inf();
	}
	
	public void show_inf(){
			System.out.println("\n-----------------------------------------");
			System.out.println("Cedula de identidad  ->  "+ this.getCedula());
			System.out.println("\tNombre       ->  "+ this.getNombre());
			System.out.println("\tApellido     ->  "+ this.getApellido());
			System.out.println("\tCiudad       ->  "+ this.getCiudad());
			System.out.println("\tMatricula    ->  "+ this.matricula);
			System.out.println("\tCarrera      ->  "+ this.carrera);
	}
	

}
