package curso_programacao;

import java.util.Scanner;

public class exercicioCondicional_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe um número inteiro: ");
		int x = sc.nextInt();
		if (x%2==0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
