package EstruturasDeControle;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
	//	Criar um programa que receba duas notas parciais, calcular a média final.
	//	Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
	//	se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
	//	caso contrário imprime no console "Reprovado".
	
		Scanner entrada = new Scanner(System.in);
		
		int qdn = 2;
		double nota1 = 0;
		double nota2 = 0;
		double total = 0;
		
		System.out.println("Digite uma nota entre 0 e 10: ");
		nota1 =  entrada.nextDouble();
		
		System.out.println("Digite outra nota entre 0 e 10: ");
		nota2 =  entrada.nextDouble();
		
		total = nota1 + nota2;
		System.out.println("Total: " + total);
		
		double media = total/qdn;
		System.out.println("Media: " + media);
		
		
		if(media > 10 || media < 0) {
		    System.out.println("Media inválida!");
		} else if(media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!!!");
		} else if(media < 7 && media > 4) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		} 
		
		entrada.close();
	}
}


