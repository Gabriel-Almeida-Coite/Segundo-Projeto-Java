package cursojava.executavel;

import javax.swing.JOptionPane;

public class DecimaQuintaClasseJava {
	public static void main(String[] args) {
		String pessoa = JOptionPane.showInputDialog("INFORMA A QUANTIDADE DE PESSOAS ? ");
		String carros = JOptionPane.showInputDialog("INFORMA A QUANTIDADE DE CARROS ? ");
		
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoa);
		
		int resultado = (int) (carroNumero / pessoaNumero);
		
		double resto = pessoaNumero % carroNumero;
		
		
		 int resposta = JOptionPane.showConfirmDialog(null, "DESEJA VER O RESultado? O QUE SOBROU ");
		
		 if(resposta == 0 ) {
			 JOptionPane.showMessageDialog(null, "DIVISÃO DEU  " + resposta);
		 }
		 
		  resposta = JOptionPane.showConfirmDialog(null, "DESEJA VER O RESTO O QUE SOBROU ");
		  
		  if (resposta ==0 ) {
			  JOptionPane.showMessageDialog(null, "RESTO DA DIVISÃO É: " + resto);
			  
			  
		  }
	}
}
