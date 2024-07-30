package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo calculo = (x, y) -> { return x + y; };
		System.out.println("O total da soma é " + calculo.executar(4, 5));
		
		calculo = (x, y) -> x * y;
		System.out.println("O total da multiplicação é " + calculo.executar(4, 5));
	}

}
