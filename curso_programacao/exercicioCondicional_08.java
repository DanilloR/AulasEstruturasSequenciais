package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicioCondicional_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário: ");
		double salario = sc.nextDouble();
		double valorAPagar;
		
		if (salario <=2000.00) {
			valorAPagar = 0;
		} else {
			if (salario<=3000.00) {
				valorAPagar = (salario-2000)*0.08;
			} else {
				if (salario<=4500) {
					valorAPagar = (salario-3000)*0.18+(1000*0.08);
				} else {
					valorAPagar = (salario-4500)*0.28+(1500*0.18)+(1000*0.08);
				}
			}
		}
		if (valorAPagar==0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f", valorAPagar);
		}
		sc.close();
	}

}
