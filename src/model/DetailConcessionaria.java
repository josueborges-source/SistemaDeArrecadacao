package model;

import java.util.Date;

public class DetailConcessionaria {
	
	private int identificacaoRegistro; /* FIXO */
	private int codUnidadeConsumidora; /* Máximo 13 caracteres, com zeros à esquerda */
	private int valorLancamento; /* Máximo 9 caracteres, com zeros à esquerda, sem virgura ou ponto para as casas decimais (ex.: R$5,00 = 000000500)*/
	private Date dataLancamento; /* Ver no arquivo "Layout completo - Convenio Arrecadacao Terceiros.pdf", nota 15 */
	private String informativoRegistro; /* Ver no arquivo "Layout completo - Convenio Arrecadacao Terceiros.pdf", nota 16 */
	private String codContaGerencial = "11307SC1"; /* FIXO */
	private int identificacaoClientedoConveniado;
	private int codOrigemFatura; /* Ver no arquivo "Layout completo - Convenio Arrecadacao Terceiros.pdf", nota 18 */
	private int numeroFatura; /* Ver no arquivo "Layout completo - Convenio Arrecadacao Terceiros.pdf", nota 19 */
	private Date dataVencimentoBaixa; /* Ver no arquivo "Layout completo - Convenio Arrecadacao Terceiros.pdf", nota 20 */
	private int valorBasedeCalculo; /* Ver no arquivo "Layout completo - Convenio Arrecadacao Terceiros.pdf", nota 21 */
	private int numeroSequencialRegistro; /* evoluir de 1 em 1, a cada registro gerado no arquivo */		
	
	private String espacoBrancoTrintaEDois = "                                "; /* espaco em branco tamanho 32 */	
	
	public int getIdentificacaoRegistro() {
		return identificacaoRegistro;
	}
	public void setIdentificacaoRegistro(int identificacaoRegistro) {
		this.identificacaoRegistro = identificacaoRegistro;
	}
	public int getCodUnidadeConsumidora() {
		return codUnidadeConsumidora;
	}
	public void setCodUnidadeConsumidora(int codUnidadeConsumidora) {
		this.codUnidadeConsumidora = codUnidadeConsumidora;
	}
	public int getValorLancamento() {
		return valorLancamento;
	}
	public void setValorLancamento(int valorLancamento) {
		this.valorLancamento = valorLancamento;
	}
	public Date getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getInformativoRegistro() {
		return informativoRegistro;
	}
	public void setInformativoRegistro(String informativoRegistro) {
		this.informativoRegistro = informativoRegistro;
	}
	public String getCodContaGerencial() {
		return codContaGerencial;
	}
	public void setCodContaGerencial(String codContaGerencial) {
		this.codContaGerencial = codContaGerencial;
	}
	public int getIdentificacaoClientedoConveniado() {
		return identificacaoClientedoConveniado;
	}
	public void setIdentificacaoClientedoConveniado(int identificacaoClientedoConveniado) {
		this.identificacaoClientedoConveniado = identificacaoClientedoConveniado;
	}
	public int getCodOrigemFatura() {
		return codOrigemFatura;
	}
	public void setCodOrigemFatura(int codOrigemFatura) {
		this.codOrigemFatura = codOrigemFatura;
	}
	public int getNumeroFatura() {
		return numeroFatura;
	}
	public void setNumeroFatura(int numeroFatura) {
		this.numeroFatura = numeroFatura;
	}
	public Date getDataVencimentoBaixa() {
		return dataVencimentoBaixa;
	}
	public void setDataVencimentoBaixa(Date dataVencimentoBaixa) {
		this.dataVencimentoBaixa = dataVencimentoBaixa;
	}
	public int getValorBasedeCalculo() {
		return valorBasedeCalculo;
	}
	public void setValorBasedeCalculo(int valorBasedeCalculo) {
		this.valorBasedeCalculo = valorBasedeCalculo;
	}
	public int getNumeroSequencialRegistro() {
		return numeroSequencialRegistro;
	}
	public void setNumeroSequencialRegistro(int numeroSequencialRegistro) {
		this.numeroSequencialRegistro = numeroSequencialRegistro;
	}
	public String getEspacoBrancoTrintaEDois() {
		return espacoBrancoTrintaEDois;
	}
	public void setEspacoBrancoTrintaEDois(String espacoBrancoTrintaEDois) {
		this.espacoBrancoTrintaEDois = espacoBrancoTrintaEDois;
	}

}
