package curso_programacao;

import java.util.Scanner;

public class ExercicioFor_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe um número inteiro: ");
		int n = sc.nextInt();
		//int resultado = 0;
		
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
