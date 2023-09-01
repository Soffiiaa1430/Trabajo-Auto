package trabajo;

public class ejer4 {
	public static void main (String [] args) {
		int [] array = {4, 33, 2, 24,3};
		int maximo = encontrarN(array);
		System.out.println("valor : " +maximo);
	}
	
	public static int encontrarN (int[] arr) {
		int max= arr[0];
		for(int num: arr) {
			if(num> max) {
				max= num;
			}
		}
		return max;
	}
}

