package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto () {
		return preco * (1 - desconto);
	}

}


