package joptionpane;

import javax.swing.JOptionPane;

public class JOptionPane5 {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog(null, "Dime tu nombre.", "Datos personales", 
				JOptionPane.QUESTION_MESSAGE);
		
		if (nombre != null) {
			JOptionPane.showMessageDialog(null, "Jelou, " + nombre + "!");
			
			int codigo = JOptionPane.showConfirmDialog(null, "¿Quieres donar un euro para una buena causa?", 
					"Donación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			
			if(codigo == JOptionPane.YES_OPTION) {
				System.out.println("Has pulsado en Sí.");
			} else if(codigo == JOptionPane.NO_OPTION) {
				System.out.println("Has pulsado en No.");
			} else {
				System.out.println("Has pulsado en Cancelar.");
			}
			
		} else {
			System.out.println("¿Por qué no me lo quieres decir? :(");
		}
	}
}