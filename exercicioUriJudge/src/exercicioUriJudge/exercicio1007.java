package exercicioUriJudge;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int valorUm = entrada.nextInt();
		int valorDois = entrada.nextInt();
		int valorTres = entrada.nextInt();
		int valorQuatro = entrada.nextInt();
		int diferenca = valorUm * valorDois - valorTres * valorQuatro;
		
		System.out.printf("DIFERENCA = %d %n", diferenca);
		
		entrada.close();

	}

}
