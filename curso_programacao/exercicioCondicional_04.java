package curso_programacao;

import java.util.Scanner;

public class exercicioCondicional_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe a hora de início e fim do jogo: ");
		int horaInicio = sc.nextInt();
		int horaFinal = sc.nextInt();
		int duracao;
		
		if (horaInicio == horaFinal) {
			duracao = 24;
		} else {
			if (horaInicio > horaFinal) {
				duracao = (24 - horaInicio) + horaFinal;
			} else {
				duracao = horaFinal - horaInicio;
			}
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		sc.close();
	}

}
