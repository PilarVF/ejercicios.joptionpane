package joptionpane;

import javax.swing.JOptionPane;

public class JOptionPane4 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "¡Hola, holita!");
		
		String nombre = JOptionPane.showInputDialog(null, "Dime tu nombre.", "Datos personales", 
				JOptionPane.QUESTION_MESSAGE);
		
		if(nombre != null) {
			System.out.println("Has pulsado Ok, tu nombre de usuario es: " + nombre + ".");
		} else {
			System.out.println("Has pulsado Calcel.");
		}
	}
}