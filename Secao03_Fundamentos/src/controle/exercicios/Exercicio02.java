package controle.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.print("Digite o ano: ");
		 int ano = entrada.nextInt();
		 
		 if(ano % 4 == 0) {
			 System.out.println("Bissexto");
		 } else {
			 System.out.println("Não bissexto");
		 }
		 
		 entrada.close();
	}

}
