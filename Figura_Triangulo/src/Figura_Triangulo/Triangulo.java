package Figura_Triangulo;

public class Triangulo {
	int triangulo;
	
	public Triangulo(){
		
	}
	
	public int get_triangulo(){
		return this.triangulo;
	}
	
	public void set_triangulo(int triangulo){
		this.triangulo = triangulo;
	}
	
	public void espacios(int tamanio){
		for(int x=0; x<tamanio;x++){
			System.out.print(" ");
		}
	}
	
	public void draw_triangulo(int triangulo){
		int espacios_in = -1;
		
		for(int y=triangulo; y>0; y--){
			for(int x=0; x<y+1; x++){
				if(x==y){
					System.out.print("*");
						if(y != triangulo){
							espacios_in += 2;
							espacios(espacios_in);
							System.out.print("*");
						}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void linea(int triangulo){
		for(int x=0; x<(triangulo*2)+1;x++){
			System.out.print("*");
		}
	}

	public void figura_triangulo(int triangulo){
		draw_triangulo(triangulo);
		linea(triangulo);
	}
}