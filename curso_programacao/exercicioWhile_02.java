package curso_programacao;

import java.util.Scanner;

public class exercicioWhile_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Informe as coordenadas x e y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while ((x!=0) && (y!=0)) {
			if ((x>0) && (y>0)) {
				System.out.println("Primeiro");
			} else {
				if ((x<0) && (y>0)) {
					System.out.println("Segundo");
				} else {
					if ((x<0) && (y<0)) {
						System.out.println("Terceiro");
					} else {
						if ((x>0) && (y<0)) {
							System.out.println("Quarto");
						}
					}
				}
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}

}
