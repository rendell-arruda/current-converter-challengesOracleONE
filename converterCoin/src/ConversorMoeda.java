import javax.swing.JOptionPane;

public class ConversorMoeda {
	double taxa = 0;
	double result;
	double real = 1;
	double dolar = 4.87;
	double euro = 5.35;
	double libra = 6.28;
	double pesoA = 53.305;
	double pesoC = 166.10;

	double valorIni;

	public void converte() {

		String[] moedas = { "Real para dólar", "Dólar para real", "Real para Euro", "Euro para Real",
				"Real para Libras Esterlinas", "Libras Esterlinas para Real", "Real para Peso Argentino",
				"Peso Argentino para Real", "Real para Peso Chileno", " Peso Chileno para Real" };

		String selectedMoeda = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Conversor de Moedas",
				JOptionPane.INFORMATION_MESSAGE, null, moedas, moedas[0]);

		switch (selectedMoeda) {

		case "Real para dólar":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));
			result = valorIni / dolar;
			JOptionPane.showMessageDialog(null,
					"R$" + valorIni + " equivale a $" + result + " Dólares na cotação atual");
			break;

		case "Dólar para real":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));
			result = valorIni * dolar;
			JOptionPane.showMessageDialog(null, "$" + valorIni + " equivale a R$" + result + " Reais na cotação atual");
			break;

		case "Real para Euro":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));
			result = valorIni / euro;
			JOptionPane.showMessageDialog(null, "R$" + valorIni + " equivale a €" + result + " Euros na cotação atual");
			break;

		case "Euro para Real":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));
			result = valorIni * euro;
			JOptionPane.showMessageDialog(null, "€" + valorIni + " equivale a R$" + result + " Reais na cotação atual");
			break;

		case "Real para Libras Esterlinas":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));
			result = valorIni / libra;
			JOptionPane.showMessageDialog(null,
					"R$" + valorIni + " equivale a £" + result + " Libras Esterlinas na cotação atual");
			break;

		case "Libras Esterlinas para Real":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));
			result = valorIni * libra;
			JOptionPane.showMessageDialog(null, "£" + valorIni + " equivale a R$" + result + " Reais na cotação atual");
			break;

		case "Real para Peso Argentino":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));
			result = valorIni * pesoA;
			JOptionPane.showMessageDialog(null,
					"R$" + valorIni + " equivale a $" + result + " Peso Argentino na cotação atual");
			break;

		case "Peso Argentino para Real":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));
			result = valorIni / pesoA;
			JOptionPane.showMessageDialog(null, "$" + valorIni + " equivale a R$" + result + " Reais na cotação atual");
			break;

		case "Real para Peso Chileno":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));
			result = valorIni * pesoC;
			JOptionPane.showMessageDialog(null,
					"R$" + valorIni + " equivale a $" + result + " Peso Argentino na cotação atual");
			break;

		case "Peso Chileno para Real":
			valorIni = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor: "));
			result = valorIni / pesoC;
			JOptionPane.showMessageDialog(null, "$" + valorIni + " equivale a R$" + result + " Reais na cotação atual");
			break;

		}

	}
}
