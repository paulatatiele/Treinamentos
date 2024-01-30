package exercicioUriJudge;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
				
		double raio = entrada.nextDouble();
		double n = 3.14159;		
		double area = Math.pow(raio, 2.0) * n;
		System.out.printf("A=%.4f %n", area);
		
		entrada.close();
	}

}