package exercicioUriJudge;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1016 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int kmDiferenca = entrada.nextInt();
		int tempoNecessario = kmDiferenca * 2;
		
		System.out.printf("%d minutos%n", tempoNecessario);
		
		entrada.close();		

	}

}
