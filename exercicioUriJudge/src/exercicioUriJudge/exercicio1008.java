package exercicioUriJudge;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int idFuncionario = entrada.nextInt();
		int horasTrabalhadas = entrada.nextInt();
		double valorHora = entrada.nextDouble();
		double salario = horasTrabalhadas * valorHora;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", idFuncionario, salario);
		
		entrada.close();

	}
}
