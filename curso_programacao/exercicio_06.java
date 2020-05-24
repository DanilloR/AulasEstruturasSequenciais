package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double pi = 3.14159;
		
		System.out.print("Informe os valores de a, b e c: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double triangulo = (a*c)/2;
		double circulo = pi*(Math.pow(c, 2));
		double trapezio = ((a+b)/2)*c;
		double quadrado = Math.pow(b, 2);
		double retangulo  = a*b;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();

	}

}
