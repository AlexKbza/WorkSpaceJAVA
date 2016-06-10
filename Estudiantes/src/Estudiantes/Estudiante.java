package Estudiantes;

import javax.swing.JOptionPane;

public class Estudiante {
	private String nombres, materias, matricula;
	

	private float nParc, nExa;
	//private float nParc;
	
	public Estudiante(String nom, String mat, String matri, float nPa, float nEx){
		this.nombres = nom;
		this.materias = mat;
		this.matricula = matri;
		this.nParc = nPa;
		this.nExa = nEx;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getMaterias() {
		return materias;
	}

	public void setMaterias(String materias) {
		this.materias = materias;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public float getnParc() {
		return nParc;
	}

	public void setnParc(int nParc) {
		this.nParc = nParc;
	}

	public float getnExa() {
		return nExa;
	}

	public void setnExa(int nExa) {
		this.nExa = nExa;
	}
	
	public void show_inf_es(){
		System.out.println("Datos: " + this.nombres + " | " + this.matricula +
				" | " + this.materias +" | "+ this.nParc + " | " + this.nExa);
	}  
	
	public void showStudent(Estudiante student[]){
		System.out.println("\n\n---------------------------------------------------");
		System.out.println("\t\tESTUDIANTES\n");
		for(int x=0; x<student.length; x++){
			student[x].show_inf_es();
		}
	}
	
	public void searchStudent(Estudiante student[] ){
		System.out.println("\n\n---------------------------------------------------");
		String matricula = JOptionPane.showInputDialog("Ingrese el numero de matricula:");
		for(int x=0; x<student.length; x++){
			if(student[x].getMatricula().equals(matricula))
				student[x].show_inf_es();
		}
	}
	
	public void showStudentAprove(Estudiante student[]){
		System.out.println("\n\n---------------------------------------------------");
		System.out.println("\tESTUDIANTES QUE APRUEBAN\n");
		for(int x=0; x<student.length; x++){
			float sum = (student[x].getnParc() + student[x].getnExa());
			if(sum >= 29.5)
				student[x].show_inf_es();
		}
	}
	
	public int showMenu(){
		int op = Integer.parseInt(JOptionPane.showInputDialog("\n\tPANEL" +
				"\n1.- Lista Estudiantes" + "\n2.- Buscar Estudiante por Matricula" +
				"\n3.- Mostrar Estudiantes que Aprueban" + "\n4.- Salir"));
		return op;
	}
	protected void finalize(){
		//JOptionPane.showMessageDialog(null, "Programa Finalizado");
	}
	
}
