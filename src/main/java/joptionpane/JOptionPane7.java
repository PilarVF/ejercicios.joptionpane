package joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JOptionPane7 {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog(null, "Dime tu nombre.", "Datos personales", 
				JOptionPane.QUESTION_MESSAGE);

		if(nombre != null) {
			System.out.println("Tu nombre es: " + nombre + ".");

			JOptionPane.showMessageDialog(null, "¡Hola, " + nombre + "! " 
					+ "Voy a hacerte una pregunta muy importante...");

			UIManager.put("OptionPane.yesButtonText", "Sí");
			UIManager.put("OptionPane.noButtonText", "No");

			int opcion = JOptionPane.showConfirmDialog(null, "¿Te gusta estudiar en Cenec?", "Confirmar",
					JOptionPane.YES_NO_OPTION);

			if(opcion == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "¡Genial! A darlo todo :)");
			} else {
				JOptionPane.showMessageDialog(null, "¿Acaso crees que estarías mejor en Medac? xD");
			}

		} else {
			System.out.println("¿Por qué le has dado a Cancelar? :(");
		}
	}
}