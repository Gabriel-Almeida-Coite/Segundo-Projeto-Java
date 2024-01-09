
package cursojava.executavel;

public class OitavoClasseJava {
	public static void main(String[] args) {
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media = 0;
		
		int dia = 8;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
	
		switch (dia) {
		case 1:
			System.out.println("Segunda: ");
			break;
		case 2:
			System.out.println("Terça: ");
			break;
		case 3:
			System.out.println("Quarta: ");
			break;
		case 4:
			System.out.println("Quinta: ");
			break;
		case 5:
			System.out.println("Sexta: ");
			break;
		

		default:
			System.out.println("Final de Semana  ");
			break;
		}
	}
	
}
