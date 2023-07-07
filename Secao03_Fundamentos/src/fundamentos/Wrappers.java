package fundamentos;

// import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		// Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 100;
		Short s = 1000;
		// Integer.parseInt(entrada.next());
		Integer i = 10000; // int
		Long l = 1000000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());

		// entrada.close();
	}

}
