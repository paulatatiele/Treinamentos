package exercicioUriJudge;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int distanciaPercorrida = entrada.nextInt();
		double combustivelGasto = entrada.nextDouble();
		double kmPorLitro = distanciaPercorrida / combustivelGasto;
		
		System.out.printf("%.3f km/l%n", kmPorLitro);
		
		entrada.close();


	}

}
