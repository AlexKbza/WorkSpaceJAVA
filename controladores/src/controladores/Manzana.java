package controladores;

public class Manzana {
	
	private String codigo;
	private int tamanio;
	public String color;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public void show_inf() {
		System.out.println("codigo-> "+this.codigo+" | color-> " +this.color+
				" Tamaño-> "+int_to_string(this.tamanio));
	}
	
	private String int_to_string(int tam){
		switch(tam){
		case 1:
			return "Pequeño";
		case 2:
			return "Mediano";
		case 3:
			return "Grande";
		default:
			return "Tamaño desconociso";
		}
	}
}
