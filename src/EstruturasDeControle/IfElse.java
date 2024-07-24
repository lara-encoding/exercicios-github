package EstruturasDeControle;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	    System.out.println("Informe o número: ");
	    int num = entrada.nextInt();
		
		if(num % 2 == 0) {
		    System.out.println("Número par!");		  
		} else {
			System.out.println("Número impar!");	
		} 
		
		entrada.close();
	}
}
