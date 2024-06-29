package Aula1;

import java.util.Scanner;

public class Leonidas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int valor = 30000;
		
		System.out.println("Olá eu sou Leônidas, nós os 300 de Sparta enfrentaremos o exercito inimigo, "
				+ "algum de vocês sabe quantos homens eles são?");
		System.out.println("Digite seu palpite e direi se é mais ou menos:");		
		int palpite = teclado.nextInt();
		String msg;
		
		while (palpite != valor) {
			
		msg = palpite<valor?"Um pouco mais soldado!":"Um pouco menos soldado!";
		System.out.println(msg);
			
		/*	if (palpite <	 valor ) {
				System.out.println("Um pouco mais soldado:");
		}
			else {
				System.out.println("Um pouco menos soldado:");
			}*/
				
			
			
			System.out.println("Digite outro palpite e direi se é mais ou menos:");	
			palpite = teclado.nextInt();
		}
		
		System.out.println("Isso soldado, seremos 300 contra 30000 Persas!");
	}

	
}
