package EstruturasDeControle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana (COM 'Ç' E COM ACENTO): ");
		
		String dia = entrada.next();
		
		if(dia.equals(" ") || dia.isBlank() || dia.isEmpty()) {
			System.out.println("Não é um dia da semana!");
		} else if(dia.equals("domingo")) {
			System.out.println("Domingo é o dia número 1");
		} else if(dia.equals("segunda")) {
			System.out.println("Segunda é o dia número 2");
	    } else if(dia.equals("terça") || dia.equals("terca")) {
		    System.out.println("Terça é o dia número 3");
	    } else if(dia.equals("quarta")) {
	        System.out.println("Quarta é o dia número 4");
        } else if(dia.equals("quinta")) {
        	System.out.println("Quinta é o dia número 5");
        } else if(dia.equals("sexta")) {
        	System.out.println("Sexta é o dia número 6");
        } else if(dia.equals("sábado") || dia.equals("sabado")) {      
        	System.out.println("Sábado é o dia número 7");
        } else {
	        System.out.println("Não é um dia da semana!");
        }
		
		entrada.close();
    }
}
