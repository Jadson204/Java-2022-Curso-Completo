package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String dia = entrada.nextLine();
		
		if(dia.trim().equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if (dia.trim().equalsIgnoreCase("terça")) {
			System.out.println(3);
		} else if (dia.trim().equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if (dia.trim().equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (dia.trim().equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if (dia.trim().equalsIgnoreCase("sábado")) {
			System.out.println(7);
		} else if (dia.trim().equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else {
			System.out.println("Dia inválido!");
		}
		
		entrada.close();
	}

}
