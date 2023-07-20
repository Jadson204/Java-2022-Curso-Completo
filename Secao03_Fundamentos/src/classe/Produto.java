package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	// Construtor padrão explícito
	Produto() {
			
	}
	
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	// Métodos
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

}


