package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4499.99, 0.25);
		p1.nome = "Notebook";
		p1.preco = 4499.99;
		p1.desconto = 0.25;
		
		var p2 = new Produto("Caneta preta", 5.00, 0.10);
		p2.nome = "Caneta preta";
		p2.preco = 5.00;
		p2.desconto = 0.10;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
	}

}
