package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		//double notasAlunoA[] = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		int tamanhoA = notasAlunoA.length;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for(int i = 0; i < tamanhoA; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / tamanhoA);
		
		// Inicializando valores literais direto no array
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		int tamanhoB = notasAlunoB.length;
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / tamanhoB);
	}

}
