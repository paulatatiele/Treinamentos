package exercicioUriJudge;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int idPeca = entrada.nextInt();
		int qtPeca = entrada.nextInt();
		double valorPeca = entrada.nextDouble();
		int idPecaDois = entrada.nextInt();
		int qtPecaDois = entrada.nextInt();
		double valorPecaDois = entrada.nextDouble();
		double valorTotalPeca = qtPeca * valorPeca;
		double valorTotalPecaDois = qtPecaDois * valorPecaDois;
		double totalPagar = valorTotalPeca + valorTotalPecaDois;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagar);
		
		entrada.close();


	}

}
