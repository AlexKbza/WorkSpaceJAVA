package Factura; //CLASE HIJO
import javax.swing.*;
import java.util.*;

public class Factura extends Items {
//////////////( Variables de Instancia )/////////////////////////////////////////////	
	private boolean init = false, salir = false;
	private int iva;
	private ArrayList<Items> Productos = new ArrayList<Items>();
	private Iterator<Items> Iterador = Productos.iterator();
	
//////////////( Constructor)/////////////////////////////////////////////
	public Factura(ArrayList<Items> Lista){
		this.Productos = Lista;
	}
//////////////( Metodos de la clase )/////////////////////////////////////////////
	
	public void showMenu(){// Muestra el menu inicial
		int opAux, op;
 		
		if(init){
			do{
				op = Integer.parseInt(JOptionPane.showInputDialog(null,"            SELECCIONE UNA OPCION\n\n1.-  Ingresar nuevo producto a la Factura"
						+ "\n2.-  Mostrar productos de la Factura\n3.-  Calcular Total\n4.-  Limpiar Factura\n5.-  Salir\n\n", "MENU PRINCIPAL", 1));
				
				switch(op){
					case 1://Ingresar Productos
							llenarPro();
					break;
					case 2://Mostrar Productos
							if(!this.Productos.isEmpty()){
								mostrarFac();
							}else{
								JOptionPane.showMessageDialog(null, "FACTURA VACIA\nNO Existen productos para Mostrar", "ERROR", 2);
							}
					break;
					case 3://Calcular total
							if(!this.Productos.isEmpty()){
								calcularTotal();
							}else{
								JOptionPane.showMessageDialog(null, "FACTURA VACIA\nNO Existen datos para Calcular", "ERROR", 2);
							}
					break;
					case 4://Limpiar Factura
							if(!this.Productos.isEmpty()){
								limpiarFactura();
							}else{
								JOptionPane.showMessageDialog(null, "FACTURA VACIA\nNO Existen ningun dato para Limpiar", "ERROR", 2);
							}
					break;
					case 5://Salir
							opAux = JOptionPane.showConfirmDialog(null, "¿Estas seguro que deseas SALIR DEL PROGRAMA?", "SALIR", 0);
								if(opAux == 0) this.salir = true;
					break;
					default :
							JOptionPane.showMessageDialog(null, "Opción NO Válida", "ERROR", 2);
				}
				
			}while(!this.salir);
		}else{
			opAux = JOptionPane.showConfirmDialog(null, "¿Estas en las provincias Afectadas por el Terremoto?", "INICIO", 0);
				if(opAux == 0) this.iva = 12;
				else this.iva = 14;
			this.init = true;
			showMenu();
		}
	}
	
	private void llenarPro(){//Llenar productos en la lista
		Items nuevo = new Items();
		nuevo.setNombre(JOptionPane.showInputDialog(null, "Ingrese el Nombre del Producto", "INGRESO", 1));
		nuevo.setCostoU(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el Costo Unitario del Producto", "INGRESO", 1)));
		nuevo.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Cantidad de Productos", "INGRESO", 1)));
		nuevo.setCostoT(nuevo.getCantidad() * nuevo.getCostoU());
		
		this.Productos.add(nuevo);
	}
	
	private void calcularTotal(){//Calcular SubTotal, Iva y Total
		float subTotal=0, iva, total;
		Iterador = Productos.iterator();
		
			while(Iterador.hasNext()){
				Items items = Iterador.next();
				subTotal += items.getCostoT();
			}
			
			iva = (subTotal * this.iva)/100;
			total = subTotal + iva;
			JOptionPane.showMessageDialog(null, "     RESULTADOS\n\nSubTotal:  "+subTotal+"\nIva:   "+iva
					+"\nTotal:   "+total+"\n\n", "TOTALES", 1);
			
	}
	
	private void limpiarFactura(){
		int opAux;
		opAux = JOptionPane.showConfirmDialog(null, "¿Estas seguro que deseas eliminar la FACTURA ACTUAL?", "LIMPIAR", 0);
		if(opAux == 0){
			this.init = false;
			this.Productos.clear();
					opAux = JOptionPane.showConfirmDialog(null, "¿Deseas Ingresar una nueva FACTURA?\n\nSI para NUEVO INGRESO\n"
							+ "NO para CERRAR PROGRAMA", "LIMPIAR", 0);
					if(opAux == 0){
						showMenu();
					}else{
						this.salir = true;
					}
		}
	}
	
	private void mostrarFac(){
		int ind = 0;
		Iterador = Productos.iterator();
		
		System.out.println("\t\t\t\t\t  FACTURA\t\t\tIVA: "+this.iva+"\n");
		System.out.println("\t================================================================================");
		System.out.println("\t|  N° |\t\tDETALLES\t|  CANTIDAD  |   VALOR UNI   |   VALOR TOTAL   |");
		System.out.println("\t================================================================================");
		
			while(Iterador.hasNext()){
				Items items = Iterador.next();
				System.out.println("\t|  "+(++ind)+"  \t  "+items.getNombre()+" \t\t     "+items.getCantidad()+"     \t   "+items.getCostoU()+"    \t   "+items.getCostoT()+"   |");
			}
	}
	
}
