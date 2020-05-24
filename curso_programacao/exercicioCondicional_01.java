package curso_programacao;

import java.util.Scanner;

public class exercicioCondicional_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner (System.in);
		System.out.print("Digite um número inteiro: ");
		int x = sc.nextInt();
		if (x<0) {
			System.out.println("NEGATIVO");
		} 
		else {
			System.out.println("NÃO NEGATIVO");
		}
		sc.close();
	}
}
