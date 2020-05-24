package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe o código, quantidade e valor unitário da peça 1: ");
		int codigoPeca1 = sc.nextInt();
		int quantidadePeca1 = sc.nextInt();
		double valorUnitarioPeca1 = sc.nextDouble();
		System.out.print("Informe código, quantidade e valor unitário da peça 2: ");
		int codigoPeca2 = sc.nextInt();
		int quantidadePeca2 = sc.nextInt();
		double valorUnitarioPeca2 = sc.nextDouble();
		
		double valorAPagar = (quantidadePeca1*valorUnitarioPeca1) + (quantidadePeca2*valorUnitarioPeca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorAPagar);
		sc.close();
	}

}
