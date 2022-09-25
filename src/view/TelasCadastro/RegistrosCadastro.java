package view.TelasCadastro;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class RegistrosCadastro {

	
	
	public JPanel retornaPainel() {
		
		JPanel registroPainel = new JPanel();
		
		JButton carregarInformacoesButton = new JButton("Carregar Informações");
		JTextArea textArea_3 = new JTextArea();			
		
		carregarInformacoesButton.setBounds(10, 11, 910, 32);
		registroPainel.add(carregarInformacoesButton);

		textArea_3.setBounds(10, 54, 910, 429);
		registroPainel.add(textArea_3);
		
		return registroPainel;		
	}
}
