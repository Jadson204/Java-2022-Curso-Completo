package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	// Construtores
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	// Mértodos
	String dataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
