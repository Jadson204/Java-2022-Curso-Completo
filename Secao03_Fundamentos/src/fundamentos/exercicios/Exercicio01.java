package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahr = entrada.nextDouble();
		double cel = (fahr - 32) / 1.8;
		System.out.printf("\n%.1f°F são %.1f°C", fahr, cel);
		
		entrada.close();
	}

}
