package cursojava.executavel;

public class SextaClasseJava {

	public static void main(String[] args) {

		int nota1 = 40;
		int nota2 = 60;
		int nota3 = 0;
		int nota4 = 0;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		String saidaResultado;

		saidaResultado = media >= 70 ? "APROVADO: " + media :(media >= 40 && media <= 69)? "RECUPERAÇÃO: " + media : "REPROVADO: " + media;
		System.out.println(saidaResultado);

	}

}
