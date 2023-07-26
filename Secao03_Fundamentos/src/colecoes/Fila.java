package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		 Queue<String> fila = new LinkedList<>();
		 
		 /* Ambos adicionam elementos, porém caso a fila tenha restrição de tamanho
		  * add() -> retorna uma exceção (gera um erro)
		  * offer() -> retorna false 
		  */
		 fila.add("Ana");
		 fila.offer("Bia");
		 fila.add("Carlos");
		 fila.offer("Daniel");
		 fila.add("Rafaela");
		 fila.offer("Gui");
		 
		 // Peek e Element -> obter o próximo elemento da fila sem remover
		 // A diferença de comportamento ocorre quando a fila está vazia
		 System.out.println(fila.peek()); // Retorna null
		 System.out.println(fila.peek());
		 System.out.println(fila.element()); // Lança uma exceção (erro)
		 System.out.println(fila.element());
		 
		 // fila.size();
		 // fila.clear();
		 // fila.isEmpty(); -> retorna true se a fila estiver vazia
		 
		 // Diferença do comportamento ocorre quando a fila está vazia
		 System.out.println(fila.poll()); //Retorna o primeiro elemento da fila já removendo-o
		 System.out.println(fila.remove()); //Retorna o primeiro elemento da fila já removendo-o
		 System.out.println(fila.poll());
		 System.out.println(fila.poll());
		 System.out.println(fila.poll());
		 System.out.println(fila.poll());
		 System.out.println(fila.poll());
	}

}
