package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8, true);
		Aluno a2 = new Aluno("Bia", 5.8, false);
		Aluno a3 = new Aluno("Daniel", 9.8, true);
		Aluno a4 = new Aluno("Gui", 6.8, false);
		Aluno a5 = new Aluno("Rebeca", 7.1, true);
		Aluno a6 = new Aluno("Pedro", 8.8, false);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = 
				a -> "Parabéns " + a.nome + "! Voce foi aprovado(a)!";
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
		
	
		
		// alunos.stream()
			// .filter(a -> a.nota >= 7)
			// .map(a -> "Parabéns " + a.nome + "! Voce foi aprovado(a)!")
			// .forEach(System.out::println);
	}

}
