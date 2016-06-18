package EHerencia;

public class Triangle extends TwoDShape{
	String style;
	private String nombre;
	

	public Triangle(){
		
	}
	
	public Triangle(String style, String nombreH, String nombreP, double width, double height){
		super(width, height, nombreP);
		this.style = style;
		this.nombre = nombreH;
	}
	double area(){
		return (super.getWidth() * super.getHeight())/2;
	}
	
	void ShowStyle(){
		System.out.println("El estilo es-> "+style);
	}
	
	public void showNombre(){
		System.out.println("Nombre Triangle->"+this.nombre);
	}
	
	public void SetNombre(String nombre){
		this.nombre = nombre;
	}
}
