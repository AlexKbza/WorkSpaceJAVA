package Fichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) throws IOException{
		Proceso Nuevo = new Proceso();
		
		try{
			String ruta = Fichero.main.class.getResource("test.log").toString();
			ruta = ruta.substring(6, ruta.length());
				//System.out.println(ruta);
				BufferedReader br = new BufferedReader(new FileReader(ruta));
				String LineaFichero;
			
			while((LineaFichero = br.readLine()) != null){
				Nuevo.separar_palabras(LineaFichero);
			}
		}catch (FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "Fichero No Encontrado");
		}
		
		Nuevo.compararFicheros();
		System.out.println("====================================================");
		System.out.println("====================================================");
		Nuevo.show();
			Nuevo = null;
			System.gc();
	}
}
