package model;

import javax.swing.JLabel;

public class CampoValidacao 
{
	private String nomeDoCampo;
	private String formatoValidacao;
	private JLabel labelDoForm;
	
	public String getNomeDoCampo() {
		return nomeDoCampo;
	}
	public void setNomeDoCampo(String nomeDoCampo) {
		this.nomeDoCampo = nomeDoCampo;
	}
	public String getFormatoValidacao() {
		return formatoValidacao;
	}
	public void setFormatoValidacao(String formatoValidacao) {
		this.formatoValidacao = formatoValidacao;
	}
	public JLabel getLabelDoForm() {
		return labelDoForm;
	}
	public void setLabelDoForm(JLabel labelDoForm) {
		this.labelDoForm = labelDoForm;
	}

	
	
}
