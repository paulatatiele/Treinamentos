package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rentangulo;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Enter rectangle width an height:");

		Rentangulo novoRetangulo = new Rentangulo();
		novoRetangulo.largura = entrada.nextDouble();
		novoRetangulo.altura = entrada.nextDouble();
		
		System.out.println(novoRetangulo.area());
		System.out.println(novoRetangulo.perimeter());
		System.out.println(novoRetangulo.diagonal());
		
		entrada.close();		

	}

}
