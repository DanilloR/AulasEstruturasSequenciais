package curso_programacao;

import java.util.Scanner;

public class exercicioCondicional_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner (System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int x = sc.nextInt();
		if (x<0) {
			System.out.println("NEGATIVO");
		} 
		else {
			System.out.println("N�O NEGATIVO");
		}
		sc.close();
	}
}
