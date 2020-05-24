package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe o número do funcionário: ");
		int numeroFuncionario = sc.nextInt(); sc.nextLine();
		System.out.print("Informe o número de horas trabalhadas: ");
		double horasTrabalhadas = sc.nextDouble(); sc.nextLine();
		System.out.print("Informe o valor da hora trabalhada: ");
		double valorHora = sc.nextDouble(); sc.nextLine();
		System.out.printf("NUMBER: %d%n", numeroFuncionario);
		double salario = valorHora*horasTrabalhadas;
		System.out.printf("SALARY: U$ %.2f", salario);
		
		sc.close();
		

	}

}
