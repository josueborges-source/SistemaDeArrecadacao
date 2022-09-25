package view.TelasCadastro;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class EnviarRemessaCadastro {

	
	public JPanel retornaPainel() {	
		
		JPanel enviarCadastroPanel = new JPanel();
		
		JButton carregarInformacoesBotao = new JButton("Carregar Informações");
		carregarInformacoesBotao.setBounds(10, 11, 910, 32);
		enviarCadastroPanel.add(carregarInformacoesBotao);		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 54, 910, 376);
		enviarCadastroPanel.add(textArea);
		
		JButton gerarArquivoParaRemessaBotao = new JButton("Gerar arquivo para Remessa");
		gerarArquivoParaRemessaBotao.setBounds(10, 441, 910, 42);
		enviarCadastroPanel.add(gerarArquivoParaRemessaBotao);
			
		
		return enviarCadastroPanel;		
	}
}
