import javax.swing.JOptionPane;

public class CaixaDeDialogo {
	public static void main(String[] args) {
		
		String[] conversores = { "Conversor de Moedas", "Conversor de temperaturas", "Conversor de medidas" };

		String selectedValue = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
				JOptionPane.INFORMATION_MESSAGE, null, conversores, conversores[0]);


		switch (selectedValue) {
		case "Conversor de Moedas":
			ConversorMoeda op = new ConversorMoeda();
			op.converte();
			break;
		
		case "Conversor de temperaturas":
			JOptionPane.showMessageDialog(null,"Opção indisponivel no momento");
			break;
		
		case "Conversor de medidas":
			JOptionPane.showMessageDialog(null,"Opção indisponivel no momento");
			break;
			
		 default:
			JOptionPane.showMessageDialog(null,"Opção indisponivel no momento");
			
		}
		
		
	}

	
}
