package exercicioUriJudge;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int valorUm = entrada.nextInt();
		int valorDois = entrada.nextInt();
		int prod = valorUm * valorDois;
		
		System.out.printf("PROD = %d %n", prod);
		
		entrada.close();

	}

}
