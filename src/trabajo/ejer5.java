package trabajo;

import java.util.ArrayList;
public class ejer5 {
	public static void main (String [] args) {
		ArrayList <Integer> lista = new ArrayList <>();
		lista.add(3);
		lista.add(67);
		lista.add(18);
		lista.add(20);
		
		int max= encontrarN(lista);
		System.out.println("Valor max: " +max);
	} 
	public static int encontrarN (ArrayList <Integer>lista) {
		int maximo= lista.get(0);
		for(int numero: lista) {
			if(numero> maximo) {
				maximo= numero;
			}
		}
		return maximo;
	}
}

