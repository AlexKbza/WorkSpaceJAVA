
public class Alumno {
	private String matricula, nombre, genero;
	private int NTP, NE; // NTP = Nota Total de Parciales - NE = Nota de Examenes
	
	public Alumno(){
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNTP() {
		return NTP;
	}

	public void setNTP(int nTP) {
		NTP = nTP;
	}

	public int getNE() {
		return NE;
	}

	public void setNE(int nE) {
		NE = nE;
	}	
}
