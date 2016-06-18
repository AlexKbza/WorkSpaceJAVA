package Factura;// CLASE PADRE

import javax.swing.JOptionPane;

public class Items {
//////////////( Variables de Instancia )/////////////////////////////////////////////
	private String nombre;
	private int cantidad;
	private float costoU, costoT;
//////////////( Constructor )/////////////////////////////////////////////	
	public Items(){
		this.cantidad = 0;
		this.costoU = 0;
		this.costoT = 0;
	}
//////////////( Getters and Setters )/////////////////////////////////////////////	
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getCantidad() {
			return cantidad;
		}
		public float getCostoU() {
			return costoU;
		}
		public void setCostoU(float costoU) {
			this.costoU = costoU;
		}
		public float getCostoT() {
			return costoT;
		}
		public void setCostoT(float costoT) {
			this.costoT = costoT;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		
/*//////////////( Metodos de la clase )/////////////////////////////////////////////*/
		protected void finalize(){
			JOptionPane.showMessageDialog(null, "   GRACIAS POR USAR\nNUESTRO PROGRAMA", "SALIR", 2);
		}
	

}
