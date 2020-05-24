package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicioCondicional_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double total = 0;
		System.out.print("Informe o código e a quantidade do produto desejado: ");
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = 4.0*quantidade;
		}
		if (codigo == 2) {
			total = 4.5*quantidade;
		}
		if (codigo == 3 ) {
			total = 5.0*quantidade;
		}
		if (codigo == 4) {
			total = 2.0*quantidade;
		}
		if (codigo == 5) {
			total = 1.5*quantidade;
		}
		
		System.out.printf("Total: R$ %.2f", total);
		sc.close();
	}

}
