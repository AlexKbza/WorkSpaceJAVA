package ficheros;

import java.util.StringTokenizer;

public class ficheros {

	private String ip;
	private String fecha;
	String vectorip[];
	
	public ficheros()
	{
		
	}
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void separar_palabras(String LineaFichero)
	{
	  int numTokens = 0;
	  String palab;
      StringTokenizer st = new StringTokenizer (LineaFichero);

    // bucle por todas las palabras
    
      while (st.hasMoreTokens())
      {
         palab = st.nextToken();
         if(numTokens==0)
         {
        	 setIp(palab);
        	 System.out.println ("    Ip  es: " + palab);
         }
         if(numTokens==3)
         {
        	 System.out.println ("    Fecha de ingreso  es: " + palab);
        	 setFecha(palab);
         }
         numTokens++;
         
      }
	}
	
	public void  contar_visitas(ficheros fich[],int cont)
	{
		System.out.println("DIRECCION IP \t VISITAS \tFECHA");
	    	for(int i=0;i<cont;i++)
	    	{
	    		int c=0;
	    		for(int j=0;j<cont;j++)
	    		{
	    		
	    		   if((fich[i].getIp().equals(fich[j].getIp())&&((fich[i].getFecha().substring(1, 12).equals(fich[j].getFecha().substring(1, 12))))))
	    			   c=c+1;
	    
	    		}
	    		System.out.println(fich[i].getIp()+"\t"+c+"\t"+fich[i].getFecha().substring(1, 12));
	    	}
	}
}
