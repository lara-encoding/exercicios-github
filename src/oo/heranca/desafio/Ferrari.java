package oo.heranca.desafio;

public class Ferrari extends Carro {

	public Ferrari() {
		super(315);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 350;
	}
	
	// public void acelerarCarro() {
	//	  super.acelerarCarro();
	// }
}

