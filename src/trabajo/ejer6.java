package trabajo;

public class ejer6 {
	public static void main(String [] args) {
		int[] arrg1 = {4, 3, 2};
		int[] arrg2 = {5, 6, 7};
		
		int[] sum = sumarArreglos(arrg1, arrg2);
		for(int numero: sum) {
			System.out.print(numero + "");
		}
	}
	
	public static int[] sumarArreglos(int[] arrg, int[] arrg2) {
		int[] resultado= new int[arrg.length];
		for(int i = 0 ; i <arrg.length; i++) {
			resultado[i] = arrg[i] + arrg2[i];
		}
		return resultado;
			
	}
}
