import javax.swing.JOptionPane;

public class ConversorMoeda {
	double taxa = 0;
	double result;
	
	double valorIni;
	public void converte() {
		

		String[] moedas = { "Real para dólar", "Dólar para real", "Real para Euro", "Euro para Real" };

		String selectedMoeda = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Conversor de Moedas",
				JOptionPane.INFORMATION_MESSAGE, null, moedas, moedas[0]);

		switch (selectedMoeda) {

		case "Real para dólar":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));			
			taxa = 4.87;
			result = valorIni / taxa;
			JOptionPane.showMessageDialog(null,
					"R$" + valorIni + " equivale a $" + result + " Dólares na cotação atual");
			break;

		case "Dólar para real":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));
			taxa = 4.87;
			result = valorIni * taxa;
			JOptionPane.showMessageDialog(null, "$" + valorIni + " equivale a R$" + result + " Reais na cotação atual");
			break;

		case "Real para Euro":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));
			taxa = 5.35;
			result = valorIni / taxa;
			JOptionPane.showMessageDialog(null, "R$" + valorIni + " equivale a €" + result + " Euros na cotação atual");
			break;

		case "Euro para Real":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));
			taxa = 5.35;
			result = valorIni * taxa;
			JOptionPane.showMessageDialog(null, "€" + valorIni + " equivale a R$" + result + " Reais na cotação atual");
			break;

		}
		


//	public static void validaNumber(double valorIni) {
//		
//		if (valorIni < 1 || valorIni == 0) {
//			JOptionPane.showInternalMessageDialog(null, "Valor inválido");
//		}else {
//			return;
//		}
//	}
}
	}
