package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		
		c1.acelerarCarro();
		System.out.println(c1);
		
		c1.acelerarCarro();
		System.out.println(c1);
	
		c1.frearCarro();
		System.out.println(c1);
		
		Ferrari c2 = new Ferrari();
		
		c2.acelerarCarro();
		System.out.println(c2);
		
		c2.acelerarCarro();
		System.out.println(c2);
		
		c2.frearCarro();
		System.out.println(c2);
	}
}
