package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.TelasCadastro.AtualizarCadastro;
import view.TelasCadastro.EnviarRemessaCadastro;
import view.TelasCadastro.NovoCadastro;
import view.TelasCadastro.ReceberRemessaCadastro;
import view.TelasCadastro.RegistrosCadastro;

import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel MainView;
	
	private JPanel Views = new JPanel();

	SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
	String formatted = format1.format(Calendar.getInstance().getTime());
	JLabel dataAtualDeCadastroText = new JLabel(formatted);
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public TelaPrincipal() {

		// dataAtualDeCadastroText.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 580);
		MainView = new JPanel();
		MainView.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(MainView);
		MainView.setLayout(null);

		
		//// Barra de Ferramentas		
		JToolBar barraDeFerramentas = new JToolBar();
		barraDeFerramentas.setBounds(0, 0, 932, 33);
		MainView.add(barraDeFerramentas);

		JButton novoCadastro = new JButton("Novo Cadastro");
		novoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CardLayout tela1 = (CardLayout) Views.getLayout();
				tela1.show(Views, "tela1");
			}
		});		
		

		JButton atualizarCadastro = new JButton("Atualizar Cadastro");
		atualizarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CardLayout tela2 = (CardLayout) Views.getLayout();
				tela2.show(Views, "tela2");
			}
		});
		

		JButton enviarRemessa = new JButton("Enviar Remessa");
		enviarRemessa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CardLayout tela3 = (CardLayout) Views.getLayout();
				tela3.show(Views, "tela3");
			}
		});
		

		JButton receberRemessa = new JButton("Receber Remessa");
		receberRemessa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CardLayout tela4 = (CardLayout) Views.getLayout();
				tela4.show(Views, "tela4");
			}
		});
		

		JButton verRegistros = new JButton("Ver Registros");
		verRegistros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CardLayout tela5 = (CardLayout) Views.getLayout();
				tela5.show(Views, "tela5");

			}
		});
		
		barraDeFerramentas.add(novoCadastro);
		barraDeFerramentas.add(atualizarCadastro);
		barraDeFerramentas.add(enviarRemessa);
		barraDeFerramentas.add(receberRemessa);
		barraDeFerramentas.add(verRegistros);

		Views.setBounds(0, 44, 932, 494);
		MainView.add(Views);
		Views.setLayout(new CardLayout(0, 0));		
		
		/// Novo Cadastro Panel
		JPanel novoCadastroPainel = new NovoCadastro().retornaPainel();
		Views.add(novoCadastroPainel, "tela1");
		novoCadastroPainel.setLayout(null);
		
		//// Atualizar Cadastro	Panel
		JPanel atualizarCadastroPanel = new AtualizarCadastro().retornaPainel();
		Views.add(atualizarCadastroPanel, "tela2");
		atualizarCadastroPanel.setLayout(null);
		
		//// Enviar Remessa Panel
		JPanel enviarRemessaPanel = new EnviarRemessaCadastro().retornaPainel();
		Views.add(enviarRemessaPanel, "tela3");
		enviarRemessaPanel.setLayout(null);		
		
		//// Receber Remessa Panel
		JPanel receberRemessaPanel = new ReceberRemessaCadastro().retornaPainel();
		Views.add(receberRemessaPanel, "tela4");
		receberRemessaPanel.setLayout(null);			
		
		///// Registros Panel
		JPanel registrosPanel = new RegistrosCadastro().retornaPainel();
		Views.add(registrosPanel, "tela5");
		registrosPanel.setLayout(null);		
	}
}
