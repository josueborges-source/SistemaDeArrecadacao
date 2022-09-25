package model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ModeloDeValidacaoTextField 
{	
	private JTextField textField;
	private String nomeDaVariavelParaMensagemDeErro;
	private ArrayList<Regex>formatosValidosRegex = new ArrayList<>();
	
	private int tamanhoMinimo;
	private int tamanhoMaximo;
	
	public ModeloDeValidacaoTextField(JTextField textField, String nomeDaVariavelParaMensagemDeErro) {
		this.textField = textField;
		this.nomeDaVariavelParaMensagemDeErro = nomeDaVariavelParaMensagemDeErro;		
	}
	
	public enum Regex 
	{
		AlfabeticoMinusculo("a-z"), AlfabeticoMaiusculo("A-Z"), Numerico("0-9"), Alfanumerico("A-Za-z0-9");
		
		public String valorRegex;
		Regex(String valorRegex) {
			this.valorRegex = valorRegex;
		}
	}		
	
	public ModeloDeValidacaoTextField(JTextField textField, String nomeDaVariavelParaMensagemDeErro, int tamanhoMinimo, int tamanhoMaximo) {
		this.tamanhoMinimo=tamanhoMinimo;
		this.tamanhoMaximo=tamanhoMaximo;
		this.textField = textField;
		this.nomeDaVariavelParaMensagemDeErro = nomeDaVariavelParaMensagemDeErro;		
	}
	
	public ModeloDeValidacaoTextField(Regex regex, JTextField textField, String nomeDaVariavelParaMensagemDeErro, int tamanhoMinimo, int tamanhoMaximo) {
		this.formatosValidosRegex.add(regex);
		this.tamanhoMinimo=tamanhoMinimo;
		this.tamanhoMaximo=tamanhoMaximo;
		this.textField = textField;
		this.nomeDaVariavelParaMensagemDeErro = nomeDaVariavelParaMensagemDeErro;		
	}
	
	public int getTamanhoMaximo(){
		return tamanhoMaximo;
	}
	
	public BigInteger retornaParaBigInteger() {
		return new BigInteger(textField.getText());
	}
	
	public void setTamanhoMaximo(int tamanhoMaximo) {
		this.tamanhoMaximo = tamanhoMaximo;
	}
	
	public void adicionarRegexDeValidacao(Regex regex){
		formatosValidosRegex.add(regex);	
	}	
	
	public JTextField getTextField() {
		return this.textField;
	}
	
	public String getConteudoTextField() {
		return this.textField.getText();
	}
	
	public Integer getConteudoToInteger() {
		return Integer.getInteger(getConteudoTextField());
	}
	
	public Long getConteudoToLong() {
		return Long.getLong(getConteudoTextField());
	}

	public void setJTextField(JTextField textField) {
		this.textField = textField;
	}		
	
	
	public String getFormatoRegex() {
		
		String formatoRegex = "[";		
		
		for(Regex regex : formatosValidosRegex) 
		{
			formatoRegex += regex.valorRegex;
		}
		
		formatoRegex += "]{"+ tamanhoMinimo + "," + tamanhoMaximo + "}";
	
		
		return formatoRegex;
	}

	
	public int getTamanhoMinimo() {
		return tamanhoMinimo;
	}

	public void setTamanhoMinimo(int tamanhoMinimo) {
		this.tamanhoMinimo = tamanhoMinimo;
	}

	
	public void setNomeDaVariavelParaMensagemDeErro(String string) {
		this.nomeDaVariavelParaMensagemDeErro = string;		
	}
	
	public String getNomeDaVariavelParaMensagemDeErro() {
		return this.nomeDaVariavelParaMensagemDeErro;
	}
	
	public boolean estaVazio() {
		if(textField.getText().isEmpty()||textField.getText().isBlank()) {
		JOptionPane.showMessageDialog(null, "Campo " + getNomeDaVariavelParaMensagemDeErro() + " Deve Ser Preenchido");
		return true;
		}
		else {
			return false;
		}		
	}	
	
	public boolean validacaoModelo() {
		
		String unidadeConsumidoraRegex = getFormatoRegex();
		String unidadeConsumidoraField = getTextField().getText();				
		
		System.out.println("Field: " + nomeDaVariavelParaMensagemDeErro + ", Regex:" + unidadeConsumidoraRegex);		
				
		
		Pattern pattern = Pattern.compile(unidadeConsumidoraRegex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(unidadeConsumidoraField);
				
		// boolean sentencaValida = matcher.find();	
		boolean sentencaValida = matcher.matches();	
		
		System.out.println("Sentença " + sentencaValida + " para " + pattern.toString() + " e " + matcher.toString());
		System.out.println("Valor: " + textField.getText());
		System.out.println("Tamanho minimo: " + tamanhoMinimo + " Tamanho m�ximo: " + tamanhoMaximo);
		
		
		//Se Vari�vel � Inv�lida, Mostre Mensagem de Erro, 
		if(!sentencaValida) {
			JOptionPane.showMessageDialog(null, "O campo "+ getNomeDaVariavelParaMensagemDeErro() + " possui erro. ");			
		}
		
		return sentencaValida;		
	}
	
	public boolean eValido() {		
		
		boolean eValido = !estaVazio();
		
		if (eValido) {
			eValido = validacaoModelo();			
		}		
		return eValido;	
	}

}
