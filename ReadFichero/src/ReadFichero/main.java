package ReadFichero;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException{
		try{
			//BufferedReader br = new BufferedReader(new FileReader("/home"));
			String ruta = ReadFichero.main.class.getResource("test.log").toString();
			ruta = ruta.substring(6, ruta.length());
			
			System.out.println(ruta);
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			String LineaFichero;
			
			while((LineaFichero = br.readLine()) != null){
				System.out.println(LineaFichero);
			}
		}catch (FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "Fichero No Encontrado");
		}

	}

}
