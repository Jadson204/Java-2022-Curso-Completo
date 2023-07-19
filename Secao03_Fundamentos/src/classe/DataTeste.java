package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data();
		
		d1.dia = 19;
		d1.mes = 7;
		d1.ano = 2023;
		
		System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
	}
}
