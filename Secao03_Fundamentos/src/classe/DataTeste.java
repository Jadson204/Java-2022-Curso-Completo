package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data();		
//		d1.dia = 19;
//		d1.mes = 7;
//		d1.ano = 2023;
		
		Data d2 = new Data(20, 7, 2023);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
	}
}
