
package trabajo;

import javax.swing.JOptionPane;

public class ejer2 {
	public static void imprimirNum (int num) {
		if (num > 10) {
			System.out.println("el numero es mayor que 10: "+ num);
			
		}
	}
	public static void main (String [] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero mayor que 10"));
		imprimirNum(numero);
	}
}
