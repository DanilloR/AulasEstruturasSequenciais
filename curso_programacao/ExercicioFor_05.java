package curso_programacao;

import java.util.Scanner;

public class ExercicioFor_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe o valor do fatorial: ");
		int n = sc.nextInt();
		int fat = n;
		
		if (n==0) {
			fat=1;
		}
		for (int i=n;i>1;i--) {
				fat = fat*(i-1);
		}
		
		System.out.printf("Fatorial de %d: %d", n, fat);
		sc.close();

	}

}
