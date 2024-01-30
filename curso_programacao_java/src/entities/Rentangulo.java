package entities;

public class Rentangulo {
	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimeter() {
		return largura * 2 + altura * 2;
	};
	
	public double diagonal() {
		return Math.sqrt(largura * largura + altura * altura);
	}
}
