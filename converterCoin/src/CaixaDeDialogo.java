import javax.swing.JOptionPane;

public class CaixaDeDialogo {
	public static void main(String[] args) {
		String[] options = { "Conversor de Moedas", "Conversor de temperaturas", "Conversor de medidas",
				"Conversor de Distâncias" };
		
		String selectedValue = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
				JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		
		System.out.println(selectedValue);
		
//		
		if (selectedValue == "Conversor de Moedas" ) {
			double valorIni = Double.parseDouble( JOptionPane.showInputDialog(null, "Insira o valor"));
			double taxa = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a taxa de câmbio"));
			double result = valorIni*taxa;
			
			JOptionPane.showMessageDialog(null, result);
		}else {
			return;
		}
	}

}
