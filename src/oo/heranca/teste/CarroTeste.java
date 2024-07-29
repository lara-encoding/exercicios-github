package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		
		c1.acelerarCarro();
		System.out.println(c1);
		
		c1.acelerarCarro();
		System.out.println(c1);
	
		c1.acelerarCarro();
		System.out.println(c1);
		
		Ferrari c2 = new Ferrari(400);
		c2.ligarTurbo();
		c2.ligarAr();
		c2.desligarAr(); 
		
		System.out.println(c2.velocidadeDoAr());
		
		c2.acelerarCarro();
		c2.frearCarro();
		System.out.println(c2);
		
		c2.acelerarCarro();
		c2.frearCarro();
		System.out.println(c2);
		
		c2.acelerarCarro();
		System.out.println(c2);
	}
}
