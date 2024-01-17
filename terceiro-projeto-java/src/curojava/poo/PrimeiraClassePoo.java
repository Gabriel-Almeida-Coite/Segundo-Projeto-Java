package curojava.poo;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplinhas;

public class PrimeiraClassePoo {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Nome do Aluno ? ");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno");
		String dataNascimento = JOptionPane.showInputDialog("Data nascimento ? ");
		String registroGeral = JOptionPane.showInputDialog("RG Do aluno ? ");
		String cpf = JOptionPane.showInputDialog("Qual cpf do aluno ? ");
		String nomeMae = JOptionPane.showInputDialog("Qual nome da mae do aluno? ");
		String nomeEscola = JOptionPane.showInputDialog("Qual escola ? ");

		
		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(null);
		aluno1.setDataMatricula(null);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(null);

		Disciplinhas disciplina1 = new Disciplinhas();
		disciplina1.setDisciplina("Dados");
		disciplina1.setNota(7);
		aluno1.getDisciplinhas().add(disciplina1);

		Disciplinhas disciplinhas2 = new Disciplinhas();
		disciplinhas2.setDisciplina("Matematica");
		disciplinhas2.setNota(10);
		aluno1.getDisciplinhas().add(disciplinhas2);

		Disciplinhas disciplinhas3 = new Disciplinhas();
		disciplinhas3.setDisciplina("Geografia");
		disciplinhas3.setNota(9);
		aluno1.getDisciplinhas().add(disciplinhas3);
		
		
		Disciplinhas disciplinhas4 = new Disciplinhas();
		disciplinhas4.setDisciplina("Java");
		disciplinhas4.setNota(10);
		aluno1.getDisciplinhas().add(disciplinhas4);
		
		
		
		
		
		
		
		
		
		

		System.out.println(aluno1.getMediaNota());
		System.out.println(aluno1.getAlunoAprovado() ? "APROVADO" : "REPROVADO");

		System.out.println(aluno1.toString());

		System.out.println("Media do aluno " + aluno1.getMediaNota());
	

	}

}
