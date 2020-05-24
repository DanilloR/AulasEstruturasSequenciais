package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicioCondicional_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println("Informe as coordenadas x e y: ");
		double x = sc.nextDouble();sc.nextLine();
		double y = sc.nextDouble();sc.nextLine();
		
		if ((x>0) && (y>0)) {
			System.out.println("Q1");
		}
		else {
			if ((x<0) && (y>0)) {
				System.out.println("Q2");
			} 
			else {
				if ((x<0) && (y>0)) {
					System.out.println("Q3");
				}
				else {
					if ((x>0) && (y<0)) {
						System.out.println("Q4");
					}
					else {
						if ((x==0) && (y==0)) {
							System.out.println("Origem");
						}
						else {
							if ((x>0) && (y==0)) {
								System.out.println("Eixo x");
							}
							else {
								if ((x==0) && (y>0)) {
									System.out.println("Eixo y");
								}
							}
						}
					}
				}
			}
		}
		sc.close();
	}

}
