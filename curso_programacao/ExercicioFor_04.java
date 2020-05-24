package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de pares a serem lidos: ");
		int n = sc.nextInt();
		int numerador = 0;
		int denominador = 0;
		double resultado = 0.00;
		System.out.println("Informe agora os pares: ");
		for (int i=0;i<n;i++) {
			numerador = sc.nextInt();
			denominador = sc.nextInt();
			resultado = (double) numerador/denominador;
			
			if (denominador==0) {
				System.out.println("Divisão impossível!");
			} else {
				System.out.printf("%.1f", resultado);
			}
		}
		
		sc.close();
	}

}
