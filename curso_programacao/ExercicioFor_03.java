package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de casos de teste: ");
		int n = sc.nextInt();
		//double x = 0;
		double mediaPonderada = 0;
		double v1 = 0;
		double v2 = 0;
		double v3 = 0;
		System.out.println("Informe agora os valores dos casos de teste: ");
		for (int i=0;i<n;i++) {
			
			v1 = sc.nextDouble();
			v2 = sc.nextDouble();
			v3 = sc.nextDouble();
			mediaPonderada = ((v1*2)+(v2*3)+(v3*5))/(2+3+5);
			System.out.printf("Média Ponderada: %.1f", mediaPonderada);
			mediaPonderada = 0;
		}
		
		sc.close();
	}

}
