package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	String dataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
