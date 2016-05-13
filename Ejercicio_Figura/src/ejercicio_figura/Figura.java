package ejercicio_figura;

public class Figura {
	
	int altura, ancho;
	
	public Figura(){
		
	}
	
	public int get_altura(){
		return this.altura;
	}
	
	public void set_altura(int altura){
		this.altura = altura;
	}
	
	public int get_ancho(){
		return this.ancho;
	}
	
	public void set_ancho(int ancho){
		this.ancho = ancho;
	}
	
	public void show_shap(int alto, int ancho){
		for(int x=1; x<=alto; x++){
			for(int y=1; y<=ancho; y++){
				if(y==1 || y==ancho || x==1 || x==alto)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
