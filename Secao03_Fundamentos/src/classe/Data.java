package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	final String formato = "%d/%d/%d";
	
	// Construtores
	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
		
		int a;
		a = 0;
		System.out.println(a);// Uma variável local não é inicializada por padrão
		
		// VALORES PADRÕES
		// byte, int short, int, long -> 0
		// float, double -> 0.0
		// boolean -> false
		// char -> '\u0000'
		// Objetos -> null
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	// Métodos
	String dataFormatada() {
//		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
}
