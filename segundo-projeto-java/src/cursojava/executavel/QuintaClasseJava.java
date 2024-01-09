package cursojava.executavel;

public class QuintaClasseJava {

	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 0;
		int nota3 = 0;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("ALUNO APROVADO : " + media);

		} else if (media >= 40 && media <= 69) {
			System.out.println("ALUNO EM RECUPEAÇÃO " + media);
		}

		else {
			System.out.println("ALUNO REPROVADO : " + media);

		}

	}

}
