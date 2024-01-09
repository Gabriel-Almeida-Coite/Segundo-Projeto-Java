package cursojava.executavel;

public class SetimaClasseJava {

	public static void main(String[] args) {
		int nota1 = 40;
		int nota2 = 60;
		int nota3 = 20;
		int nota4 = 20;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("PARABENS APROVADAÇO: " + media);

				} else {
					System.out.println("APROVADOOOO: " + media);
				}

			} else {
				System.out.println("RECUPERAÇÃOOO: " + media);

			}

		} else {
			System.out.println("REPROVADOO: " + media);

		}

	}

}
