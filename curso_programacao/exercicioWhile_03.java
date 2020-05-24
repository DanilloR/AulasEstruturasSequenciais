package curso_programacao;

import java.util.Scanner;

public class exercicioWhile_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o código do produto adquirido: ");
		int codigo = sc.nextInt();
		int contAlcool = 0;
		int contGasolina = 0;
		int contDiesel = 0;
		
		while (codigo != 4) {
			switch (codigo) {
			case 1:
				contAlcool+=1;
				break;
				//codigo = sc.nextInt();
			case 2: 
				contGasolina+=1;
				break;
				//codigo = sc.nextInt();
			case 3:
				contDiesel+=1;
				break;
				//codigo = sc.nextInt();
			default:
				System.out.println("Código inválido!");
				break;
				//codigo = sc.nextInt();
			}
			codigo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+contAlcool);
		System.out.println("Gasolina: "+contGasolina);
		System.out.println("Diesel: "+contDiesel);
		sc.close();
	}

}
