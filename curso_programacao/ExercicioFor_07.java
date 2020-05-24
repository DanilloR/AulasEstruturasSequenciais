package curso_programacao;

import java.util.Scanner;

public class ExercicioFor_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe um inteiro: ");
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.printf("%d %d %d%n",i,(i*i),(i*i*i));
			//System.out.println();
		}
		
		sc.close();
	}

}
