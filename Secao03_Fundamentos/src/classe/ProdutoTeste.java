package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4499.99);
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 5.00;
		
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
	}

}
