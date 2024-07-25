package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual;
	
	void acelerarCarro() {
		velocidadeAtual += 5;
	}
	
	void frearCarro() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é de " + velocidadeAtual + "Km/h.";
	}
	
}
			
