package classe.desafio;

public class Carro {
	
	final String nome = "Onix";
	double velocidade;
	
	Carro() {
		
	}
	
	void acelerar() {
		this.velocidade += 10;
	}
	
	String acelerando() {
		return "O " + this.nome + " está a " + velocidade + " Km/h";
	}

}
