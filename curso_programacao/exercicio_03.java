package curso_programacao;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe os 4 números inteiros: ");
		int a = sc.nextInt(); sc.nextLine();
		int b = sc.nextInt(); sc.nextLine();
		int c = sc.nextInt(); sc.nextLine();
		int d = sc.nextInt(); sc.nextLine();
		int diferenca = (a*b) - (c*d);
		
		System.out.printf("DIFERENCA: %d",diferenca);
		sc.close();
		
		
		

	}

}
