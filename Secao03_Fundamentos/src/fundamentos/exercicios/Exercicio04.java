package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = entrada.nextInt();
		int quadrado = (int) Math.pow(num, 2);
		int cubo = (int) Math.pow(num, 3);
		
		System.out.printf("\nO número digitado foi %d", num);
		System.out.printf("\nO quadrado de %d é %d", num, quadrado);
		System.out.printf("\nO cubo de %d é %d", num, cubo);
		
		entrada.close();
	}
}
