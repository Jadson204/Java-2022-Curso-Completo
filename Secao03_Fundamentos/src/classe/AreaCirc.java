package classe;

public class AreaCirc {
	
	double raio;
	final static double pi = 3.1415;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return raio * raio * pi;
	}
	
	static double area(double raio) {
		return pi * Math.pow(raio, 2);
	}
}
