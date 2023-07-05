package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println(" dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.2f %n", 1250.59);
		System.out.printf("Nome: %s%n", "Jadson");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("\nNome: " + nome);
		
		entrada.close();
	}

}
