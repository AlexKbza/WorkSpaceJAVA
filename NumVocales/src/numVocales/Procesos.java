package numVocales;

import javax.swing.JOptionPane;

public class Procesos {
	
	private String cadena;
	private int num_vocales;
	private char vocales[] = {'a','e','i','o','u'};
	
	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public Procesos(){	
	}
	
	public void show(){
		JOptionPane.showMessageDialog(null, "La palabra: "+ this.cadena + "\n Tiene "+ eval_vocal() + " vocales");
	}
	
	private int eval_vocal(){
		int x, y, cont=0;
		String newCad = this.cadena.toLowerCase();
		
		for(x=0; x<this.vocales.length; x++){
			for(y=0; y<newCad.length(); y++){
				if(this.vocales[x] == newCad.charAt(y))
					cont++;
			}
		}
		return cont;
	}
}
