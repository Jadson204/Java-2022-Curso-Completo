package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double cel = entrada.nextDouble();
		double fahr = cel * 1.8 + 32;
		System.out.printf("\n%.1f°C são %.1f°F", cel, fahr);
		
		entrada.close();
	}

}
