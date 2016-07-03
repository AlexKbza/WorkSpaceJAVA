package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ficheros[] fich=new ficheros[5000];
		try{
       BufferedReader br=new BufferedReader(new FileReader("/Users/ChitoBeat/Documents/access_log.txt"));
        	String LineaFichero;
        	int cont=0;
        	
        	while((LineaFichero=br.readLine())!=null){
        		//System.out.println(LineaFichero);
        		fich[cont]=new ficheros();
        		fich[cont].separar_palabras(LineaFichero);
        		cont=cont+1;
        		System.out.println(cont);
        	}
        	
        	fich[0].contar_visitas(fich, cont);
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "fichero no encontrado");
			e.printStackTrace();
		}
	}
	}

