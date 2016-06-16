package EHerencia;

public class Triangle extends TwoDShape{
	String style;
	
	double area(){
		return (width * height)/2;
	}
	
	void ShowStyle(){
		System.out.println("El estilo es-> "+style);
	}
}
