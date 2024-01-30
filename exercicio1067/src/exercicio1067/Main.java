package exercicio1067;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int nImpares = 1;
		int x = entrada.nextInt();
		
		while(nImpares <= x) {
			System.out.print(x);
			
		}
		
		
		entrada.close();
	}

}
