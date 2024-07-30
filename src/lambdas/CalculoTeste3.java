package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> calculo = (x, y) -> { return x + y; };
		System.out.println("O total da soma é " + calculo.apply(4.0, 5.0));
		
		calculo = (x, y) -> x * y;
		System.out.println("O total da multiplicação é " + calculo.apply(4.0, 5.0));
		
		BinaryOperator<Integer> calculo2 = (x, y) -> { return x + y; };
		System.out.println("O total da soma é " + calculo2.apply(4, 5));
		
		calculo = (x, y) -> x * y;
		System.out.println("O total da multiplicação é " + calculo2.apply(4, 5));
	}

}
