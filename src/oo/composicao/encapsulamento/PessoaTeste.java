package oo.composicao.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(30);
		p1.alterarIdade(24); // alterar
		
		System.out.println(p1.lerIdade()); // ler
	}

}
