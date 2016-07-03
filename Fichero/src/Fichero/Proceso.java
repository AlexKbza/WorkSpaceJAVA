package Fichero;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;


/**
 * @author Alex Kbza
 * @data Domingo, 3-07-2016 3:15Am
 */

public class Proceso extends Items implements Datos{
/*//////////////////////////////////////////////////////////////////////
			Variables de Instancia
	//////////////////////////////////////////////////////////////////*/
	private ArrayList<String> Ip = new ArrayList<String>();
	private ArrayList<String> Fecha = new ArrayList<String>();
	private ArrayList<Items> Completo = new ArrayList<Items>();
	private ArrayList<Items> Final = new ArrayList<Items>();

	private Iterator<String> IteraFecha = Fecha.iterator();
	private Iterator<String> IteraIp = Ip.iterator();
	private Iterator<Items> IteraCompleto = Completo.iterator();
	private Iterator<Items> IteraFinal = Final.iterator();
/*//////////////////////////////////////////////////////////////////////
	Constructor
/////////////////////////////////////////////////////////////////////*/
	public Proceso(){

	}
/*//////////////////////////////////////////////////////////////////////
	METODOS
/////////////////////////////////////////////////////////////////////*/
	public void compararFicheros(){//FUNCIONA NORMAL 
		int cont;
		
		IteraFecha = Fecha.iterator() ;
		while(IteraFecha.hasNext()){//Itera las fechas 
			String itemsFecha = IteraFecha.next();
			IteraIp = Ip.iterator();
				while(IteraIp.hasNext()){//Itera las Ip
					String itemsIp = IteraIp.next();
					cont = 0;
						if(!veriFinal(itemsIp, itemsFecha)){//si la ip no esta en la lista final será agregada
							IteraCompleto = Completo.iterator();
								while(IteraCompleto.hasNext()){//itera la lista con datos completos para contar las repeticiones
									Items itemsComple = IteraCompleto.next();
									if(itemsComple.getIp().equals(itemsIp) && itemsComple.getFecha().equals(itemsFecha))
										cont++;
								}
								if(cont !=0){//almacena las ip que se repetan x lo menos 1 vez
									Items auxiliar = new Items();
									auxiliar.setIp(itemsIp);
									auxiliar.setFecha(itemsFecha);
									auxiliar.setRepetir(cont);
									Final.add(auxiliar);
								}
						}		
				}
		}
		if(!Final.isEmpty())
			System.out.println("lleno  " + Final.size());
	}
	
	public void separar_palabras(String LineaFichero){//FUNCIONA NORMAL 
		int numTokens = 0;
		String palab;
		StringTokenizer st = new StringTokenizer (LineaFichero);
		Items items = new Items();
    // bucle por todas las palabras
		while (st.hasMoreTokens()){//Separa una cadena por los espacios
			palab = st.nextToken();//va almacenando cada separacion de la cadena
				if(numTokens==0){
					items.setIp(palab);
						if(Numeros.indexOf(palab.charAt(0)) != -1){
							if(!veriIp(palab)){//verifica que las ip no esten repetidas en la lista
								if(palab.length() <= sizeIp)
									this.Ip.add(palab);
							}
						}
		        }
		        if(numTokens==3){
		        	palab = palab.substring(1, sizeFecha);
		        	items.setFecha(palab);
		        		if(!veriFecha(palab)) this.Fecha.add(palab);//verifica que las fechas no esten repetidas
		        }numTokens++;
	    }
		items.setRepetir(0);
		Completo.add(items);//almacena todos los datos de ip y fecha encontrados en el fichero
	}
	
	public void show(){//FUNCIONA NORMAL
		IteraFinal = Final.iterator();
		System.out.println("     IP\t              REPETIDAS\t          FECHA\n"); 		
			while(IteraFinal.hasNext()){
				Items items = IteraFinal.next();
					System.out.println(items.getIp() + "        \t" 
							+ items.getRepetir() + "        \t" + items.getFecha());
			}
	}
	
	private boolean veriFinal(String ip, String data){//Analiza la ip y la fecha dentro de la nueva lista 
		boolean veri = false;
			IteraFinal = Final.iterator();
			
			while(IteraFinal.hasNext()){
				Items items = IteraFinal.next();
					if(items.getIp().equals(ip) && items.getFecha().equals(data))
						veri = true;
			}
		return veri;
	}
	
	private boolean veriIp( String veri){//FUNCIONA NORMAL
		boolean verificador = false;
		IteraIp = Ip.iterator();
			while(IteraIp.hasNext()){
				String items = IteraIp.next();
				if(items.equals(veri))
					verificador = true;
			}
		return verificador;
	}
	
	private boolean veriFecha( String veri){//FUNCIONA NORMAL
		boolean verificador = false;
		IteraFecha = Fecha.iterator();
			while(this.IteraFecha.hasNext()){
				String items = IteraFecha.next();
				if(items.equals(veri))
					verificador = true;
			}
		return verificador;
	}
	
	protected void finalize(){
		JOptionPane.showMessageDialog(null, "Finalizando Programa");
	}
}
