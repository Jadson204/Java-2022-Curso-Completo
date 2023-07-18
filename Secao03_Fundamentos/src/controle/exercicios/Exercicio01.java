package controle.exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	// 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		
		if(num >= 0 && num <= 10) {
			System.out.println("O número está entre 0 e 10");
		} else {
			System.out.println("O número não está entre 0 e 10");
		}
		
		if(num % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		}
		
		entrada.close();
	}
}
