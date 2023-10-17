package joptionpane;

import javax.swing.JOptionPane;

public class JOptionPane3 {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog(null, "Dime tu nombre", "Datos personales", 
				JOptionPane.QUESTION_MESSAGE);
		
		if(nombre != null) {
			System.out.println("Has pulsado Ok, tu nombre es " + nombre + ".");
		} else {
			System.out.println("Has pulsado Cancel.");
		}
	}
}