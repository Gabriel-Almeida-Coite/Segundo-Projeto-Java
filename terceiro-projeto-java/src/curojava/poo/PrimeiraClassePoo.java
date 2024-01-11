package curojava.poo;

import cursojava.classes.Aluno;

public class PrimeiraClassePoo {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();

		aluno1.setNome("Gabriel Almeida");
		aluno1.setIdade(24);
		aluno1.setDataNascimento("30-07-1999");
		aluno1.setRegistroGeral("546.666.998-88");
		aluno1.setNumeroCpf("093-041-885-98");
		aluno1.setNomeMae("Maria das dores");
		aluno1.setNomePai(null);
		aluno1.setDataMatricula("01-06-2023");
		aluno1.setNomeEscola("Faculdade Estacio de Sá");
		aluno1.setSerieMatriculado("1° semestre ");
		aluno1.setNota1(9);
		aluno1.setNota2(10);
		aluno1.setNota3(7);
		aluno1.setNota4(5);
		
		System.out.println(aluno1.getMediaNota());
		System.out.println(aluno1.getAlunoAprovado()? "APROVADO" : "REPROVADO");
		
		

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Jonathas Santos");
		aluno2.setIdade(24);
		aluno2.setDataNascimento("30-08-1989");
		
		
		
		
		Aluno aluno3 = new Aluno();

		Aluno aluno4 = new Aluno("MARIETA");
		Aluno aluno5 = new Aluno("JOSE", 22);

	}

}
