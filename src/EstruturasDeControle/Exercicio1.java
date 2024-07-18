package EstruturasDeControle;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		//Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
		
		Scanner entrada = new Scanner(System.in);
		
		String numero = "";
		System.out.print("Informe a nota: ");
		int num = entrada.nextInt(); 
		
		switch (num) {
		case 0: case 2: case 4: case 6: case 8: case 10: 
			numero = "par!";
			break;
		default:
			numero = "não encontrado!";
		
		}
		
		System.out.println("Número é " + numero);
		
		
		entrada.close();
	}

}
