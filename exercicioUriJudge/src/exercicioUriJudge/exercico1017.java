package exercicioUriJudge;

import java.util.Locale;
import java.util.Scanner;

public class exercico1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int horaTempoGasto = entrada.nextInt();
		int velocidadeMedia = entrada.nextInt();
		double combustivelGasto = horaTempoGasto * velocidadeMedia;
		double total = combustivelGasto / 12.0;
		System.out.printf("%.3f%n%.3f%n", combustivelGasto, total);
		
		entrada.close();
	}

}
