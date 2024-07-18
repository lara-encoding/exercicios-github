package EstruturasDeControle;

import java.util.Scanner;

public class Exercico2 {
	
	public static void main(String[] args) {
		
		//Criar um programa informa se o ano atual é um ano bissexto;
		
		Scanner entrada = new Scanner(System.in);
		
		String anual = "";
		System.out.println("Informe o ano: ");
		int ano = entrada.nextInt();
		
		switch(ano) {
		case 2024: 
			anual = "bissexto!";
			break;
		default:
			anual = "não bissexto!";
		}
		
		System.out.println("Ano " + anual);
		entrada.close();
	}

}
