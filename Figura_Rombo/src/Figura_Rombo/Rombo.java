package Figura_Rombo;

public class Rombo {
	int tamanio, espa;
	
	public Rombo(){	
	}
	
	public int get_tamanio(){
		return this.tamanio;
	}
	
	public void set_tamanio(int tamanio){
		this.tamanio= tamanio;
	}
	
	public void espacios(int tamanio){
		for(int x=0; x<tamanio;x++){
			System.out.print(" ");
		}
	}
	
	public void centro(int tamanio){
		System.out.print("*");
			for(int x=0; x<(tamanio*2)-1; x++){
					System.out.print(" ");
			}
		System.out.println("*");
	}
	
	public void figura_arriba(int tamanio){
		int espacios_in = -1;
		
		for(int y=tamanio; y>0; y--){
			for(int x=0; x<y+1; x++){
				if(x==y){
					System.out.print("*");
						if(y != tamanio){
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
		espa = espacios_in;
	}
	
	public void figura_abajo(int tamanio){
		int espacios_in = espa;
		
		for(int y=1; y<=tamanio; y++){
			for(int x=0; x<y+1; x++){
				if(x==y){
					System.out.print("*");
						if(y != tamanio){
							espacios(espacios_in);
							System.out.print("*");
							espacios_in -= 2;
						}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void figura(int tamanio){
		figura_arriba(tamanio);
		centro(tamanio);
		figura_abajo(tamanio);
	}
}
