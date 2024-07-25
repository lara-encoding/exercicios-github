package oo.heranca.desafio;

public class Ferrari extends Carro {

	Ferrari() {
		super(315);
	}
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 350;
	}
	
	void acelerarCarro() {
		velocidadeAtual += 15;
	}
}

