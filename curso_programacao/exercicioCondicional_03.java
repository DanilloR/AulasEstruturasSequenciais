package curso_programacao;

import java.util.Scanner;

public class exercicioCondicional_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe dois n�meros inteiros: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x<y) {			
			int aux = x;
			x = y;
			y = aux;
		} 
		
			if (x %y == 0) {
				System.out.println("S�o Multiplos");
			} 
			else {
				System.out.println("N�o s�o m�ltiplos");
			}
			sc.close();	
		}
		
	}
