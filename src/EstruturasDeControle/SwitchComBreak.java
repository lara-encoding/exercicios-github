package EstruturasDeControle;

import java.util.Scanner;

public class SwitchComBreak {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
	
		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt(); 
		
		switch (nota) {
		case 10: case 9:
			conceito = "MB";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "R";
			break;
		case 4: case 3: case 2: case 1: case 0:
			conceito = "I";
			break;
		default:
			conceito = "não encontrado!";
		
		}
		
		System.out.println("Conceito é " + conceito);
		entrada.close();
	}

}
