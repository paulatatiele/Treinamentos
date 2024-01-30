package exercicioUriJudge;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int valorUm = entrada.nextInt();
		int valorDois = entrada.nextInt();
		int soma = valorUm + valorDois;
		
		System.out.println("SOMA = " + soma);
		
		entrada.close();
	}

}
