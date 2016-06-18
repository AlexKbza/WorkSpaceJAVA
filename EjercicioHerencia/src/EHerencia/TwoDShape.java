package EHerencia;

public class TwoDShape {
	
	private double width;
	private double height;
	int bandera;
	private String nombre;
	
	public TwoDShape(){
	}
	
	public TwoDShape(double width, double height, String nombre){
		this.width = width;
		this.height = height;
		this.nombre = nombre;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public void showNombre(){
		System.out.println("Nombre TwoDShape->"+this.nombre);
	}
	
	
	public void showDim(){
			System.out.println("Ancho-> "+width+"  Alto-> "+height);
	}
	
}
