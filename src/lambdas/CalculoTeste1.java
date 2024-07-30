package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		Calculo calculo = new Somar();
		System.out.println("O total da soma é " + calculo.executar(2, 3));
		
		calculo = new Multiplicar();
		System.out.println("O total da multiplicação é " + calculo.executar(2, 3));
	}

}
