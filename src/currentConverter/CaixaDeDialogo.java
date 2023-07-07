package currentConverter;

import javax.swing.JOptionPane;

public class CaixaDeDialogo {

	public static void main(String[] args) {
//		String nome = null;
//		int resposta;
		
		String[] options = {"Conversor de Moedas", "Conversor de temperaturas", "Conversor de medidas", "Conversor de Distâncias"};

		int selectedValue = JOptionPane.showOptionDialog(null, "Escolha uma opção ", "Menu",JOptionPane.INFORMATION_MESSAGE,0, null, options, options[0]);
		System.out.println(selectedValue);
		
		
//		resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");

//		if (resposta == JOptionPane.YES_OPTION) {
//			// verifica se o usuario clicou no botao YES
//			JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
//			;
//		} else {
//			JOptionPane.showMessageDialog(null,"Seu nome não é: "+ nome);
//		}

	}

}
