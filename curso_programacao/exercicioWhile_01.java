package curso_programacao;

import java.util.Scanner;

public class exercicioWhile_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a senha: ");
		int senha = sc.nextInt();
		if (senha == 2002) {
			System.out.println("Acesso Permitido!");
		}
		while (senha!=2002) {
			System.out.println("Senha inválida!");
			senha = sc.nextInt();			
			if (senha == 2002) {
				System.out.println("Acesso Permitido!");
			}
		}
		
		sc.close();
	}

}
