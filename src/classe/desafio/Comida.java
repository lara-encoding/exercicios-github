package classe.desafio;

public class Comida {

		
	String nome;
	double peso;
	
	Comida(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	
		
		
	

}
