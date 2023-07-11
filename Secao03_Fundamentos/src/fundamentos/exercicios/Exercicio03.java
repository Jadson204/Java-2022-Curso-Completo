package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua altura(em metros): ");
		double altura = entrada.nextDouble();
		System.out.println("Digite seu peso(em Kg): ");
		double peso = entrada.nextDouble();
		
		double imc = peso / (Math.pow(altura, 2));
		
		System.out.println("O seu IMC é " + imc);
		
		entrada.close();
	}

}
