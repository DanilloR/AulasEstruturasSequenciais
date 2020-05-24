package curso_programacao;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite os números: ");
		x = sc.nextInt(); sc.nextLine();
		y = sc.nextInt(); sc.nextLine();
		int resultado = x+y;
		System.out.printf("SOMA = %d", resultado);
		
		sc.close();
		

	}

}
