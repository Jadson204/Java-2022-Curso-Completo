package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		double[] notas = { 9.9, 8.7, 7.2, 9.4 };
		
		// For tradicional
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		// Foreach
		for(double nota: notas) {
			System.out.print(nota + " ");
		}
	}

}
