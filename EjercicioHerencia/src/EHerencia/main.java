package EHerencia;

public class main {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Triangle t3 = new Triangle("Test", "Triangulo A", "Figura A",25, 5);
		
		t1.setWidth(4);
		t1.setHeight(2.5);
		t1.style = "Filled";
		
		t2.setWidth(10);
		t2.setHeight(5);
		t2.style = "Outline";
		
		/*System.out.println("\nInformación del triángulo 1");
			t1.showDim();
			t1.ShowStyle();
			System.out.println("El area es-> "+ t1.area());
			
		System.out.println("\nInformación del triángulo 2");
			t2.showDim();
			t2.ShowStyle();
			System.out.println("El area es-> "+ t2.area());*/
			
		System.out.println("\nInformación del triángulo 3");
			t3.showDim();
			t3.ShowStyle();
			System.out.println("El area es-> "+ t3.area());
			t3.showNombre();
	}

}
