package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = 3.14159;
		double raio;
		double area;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble(); sc.nextLine();
		area = pi*Math.pow(raio, 2);
		System.out.printf("A: %.4f", area);
		
		sc.close();
	}

}
