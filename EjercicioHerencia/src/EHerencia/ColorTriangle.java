package EHerencia;

public class ColorTriangle extends Triangle{
	
	private String color;
	
	public ColorTriangle(){
		
	}
	
	ColorTriangle(String color, String style, double width, double height){
		super();
		//super(style, width, height);
		this.color = color;
	}

}
