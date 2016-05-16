package Calculadora;

import javax.swing.*;

public class main {

	public static void main(String[] args) {
		float num1, num2;
		
		num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero:"));
		num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
		
		Calculadora call = new Calculadora(num1, num2);
		call.suma();
		call.reta();
		call.multiplicacion();
		call.raiz_2x2(call.get_num1());
		call.raiz_2x2(call.get_num2());
		call.seno(call.get_num1());
		call.seno(call.get_num2());
		call.coseno(call.get_num1());
		call.coseno(call.get_num2());
		call.tangente(call.get_num1());
		call.tangente(call.get_num2());
		
		
	}

}
