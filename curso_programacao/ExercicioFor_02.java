package curso_programacao;

import java.util.Scanner;

public class ExercicioFor_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de números a serem lidos: ");
		int n = sc.nextInt();
		int x = 0;
		int contIn = 0;
		int contOut = 0;
		System.out.printf("Agora, informe os %d inteiros que você escolheu: ",n);
		for (int i=0;i<n;i++) {
			x = sc.nextInt();
			if ((x>=10) && (x<=20)) {
				contIn++;
			} else {
				contOut++;
			}
		}
		
		System.out.printf("%d in", contIn);
		System.out.println();
		System.out.printf("%d out", contOut);
		sc.close();
	}

}
