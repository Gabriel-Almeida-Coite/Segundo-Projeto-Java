package cursojava.executavel;

import javax.swing.JOptionPane;

public class DecimaSextaClasseJava {
	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("INFORMA A NOTA 1 ");
		String nota2 = JOptionPane.showInputDialog("INFORMA A NOTA 2 ");
		String nota3 = JOptionPane.showInputDialog("INFORMA A NOTA 3 ");
		String nota4 = JOptionPane.showInputDialog("INFORMA A NOTA 4 ");

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

		JOptionPane.showMessageDialog(null, media);

		if (media >= 5) {
			if (media >= 7) {
				JOptionPane.showConfirmDialog(null, "APROVADO" + media);

			} else {

				JOptionPane.showConfirmDialog(null, "EM RECUPERAÇÃO " + media);
			}

		} else {
			JOptionPane.showConfirmDialog(null, "REPROVADO " + media);
		}

	}
}
