package EstruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) { //WHILE = ENQUANTO
		
			System.out.println("Digite uma nota: ");
			nota =  entrada.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeNotas++;
			}
		}
		
		System.out.println("valor : " + total);
		
		double media = total/quantidadeNotas;
		System.out.println("media: " + media);
			
		entrada.close();
	   
	}
}
