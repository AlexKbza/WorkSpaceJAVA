package controladores;

public class main {

	public static void main(String[] args) {
		Manzana item1 = new Manzana();
		Manzana item2 = new Manzana();
		item1.color = "verde";
		item2.color = "rojo";
		
		item1.setCodigo("001");
		item2.setCodigo("002");
		
		item1.setTamanio(3);
		item2.setTamanio(5);
		
		item1.show_inf();
		item2.show_inf();
	}

}
