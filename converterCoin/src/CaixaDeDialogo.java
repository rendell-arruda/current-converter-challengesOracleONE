import javax.swing.JOptionPane;

public class CaixaDeDialogo {
	public static void main(String[] args) {

//		// tela inicial
		
		Initial telaInicial = new Initial();
		telaInicial.initialScreen();
		
		String[] continueOptions = { "Yes", "No", "Cancel" };
		String continueSelect = (String) JOptionPane.showInputDialog(null, "Deseja Continuar", "Aviso",
				JOptionPane.INFORMATION_MESSAGE, null, continueOptions, continueOptions[0]);

		
		switch (continueSelect) {
		case "Yes":
			telaInicial.initialScreen();
			break;

		case "No":
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
			break;

		case "Cancel": 
			JOptionPane.showMessageDialog(null, "Programa concluído");
			break;
		
		default:
			break;
		}

	}

}
