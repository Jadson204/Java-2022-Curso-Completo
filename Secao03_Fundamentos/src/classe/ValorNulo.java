package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		 String s1 = "";
		 System.out.println(s1.concat("!!!"));
		 
		 Data d1 = null;
		 
		 if(d1 != null) {
			 d1.mes = 3;
		 }

		 String s2 = null;
		 System.out.println(s2.concat("???"));
	}

}
