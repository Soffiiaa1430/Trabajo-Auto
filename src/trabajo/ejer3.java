package trabajo;

public class ejer3 {
	public static void main (String [] args) {
		int num= numeroA();
		System.out.println("Numero Aleatorio "+ num);
		}
	public static int numeroA() {
		int clase = 100;
		int numeroA= (int) (Math.random()* clase)+1;
		return numeroA;
	}
}
	


