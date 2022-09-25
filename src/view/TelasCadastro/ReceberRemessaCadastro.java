package view.TelasCadastro;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class ReceberRemessaCadastro {

	
	public JPanel retornaPainel() {	
			
			JPanel remessaPainel = new JPanel();
			
			
			JButton selecionarArquivoDeRemessa = new JButton("Selecionar Arquivo de Remessa");
			selecionarArquivoDeRemessa.setBounds(646, 11, 274, 23);
			remessaPainel.add(selecionarArquivoDeRemessa);

			JTextArea textArea_1 = new JTextArea();
			textArea_1.setBounds(10, 72, 436, 364);
			remessaPainel.add(textArea_1);

			JTextArea textArea_2 = new JTextArea();
			textArea_2.setBounds(464, 72, 456, 364);
			remessaPainel.add(textArea_2);

			JLabel dadosDoSistemaLabel = new JLabel("Dados no Sistema");
			dadosDoSistemaLabel.setHorizontalAlignment(SwingConstants.CENTER);
			dadosDoSistemaLabel.setBounds(174, 47, 109, 14);
			remessaPainel.add(dadosDoSistemaLabel);

			JLabel atualizacoesRecebidasLabel = new JLabel("Atualizações Recebidas");
			atualizacoesRecebidasLabel.setHorizontalAlignment(SwingConstants.CENTER);
			atualizacoesRecebidasLabel.setBounds(629, 47, 126, 14);
			remessaPainel.add(atualizacoesRecebidasLabel);

			JButton receberAtualizacoesBotao = new JButton("Receber Atualizações");
			receberAtualizacoesBotao.setBounds(10, 447, 910, 36);
			remessaPainel.add(receberAtualizacoesBotao);
			
			return remessaPainel;
	}
	
}
