package model;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

public class Detail_conveniado {	

	////// ID ///////
	private final Integer tipoRegistro = 2; /* FIXO */
	
	private Long codigoUnidadeConsumidora; /* Máximo de 13 caracteres, com zeros à esquerda */
	private Integer valorLancamento; /* Máximo 9 caracteres, com zeros à esquerda, sem virgura ou ponto para as casas decimais (ex.: R$5,00 = 000000500)*/
	private Integer dataGeracaoRegistro; /* Data atual*/
	
	private String comandoMovimento; /* Ver no arquivo "Layout completo - Convenio Arrecadacao Terceiros.pdf", nota 07*/
	
	private final String codigoContaGerencial= "11307AC1"; /* FIXO */
	
	private Integer coberturaOcorrencia; /* Ver no arquivo "Layout completo - Convenio Arrecadacao Terceiros.pdf", nota 09*/
	private BigInteger descricaoCoberturaOcorrencia; /* Ver no arquivo "Layout completo - Convenio Arrecadacao Terceiros.pdf", nota 09*/	
	
	private Long cpfCliente; /* Máximo , com zeros a esquerda */
	private Long cnpjCliente; /* Máximo 12, com zeros a esquerda. Complemento do campo 2.14 */

	private Calendar mesVigencia; /* Mês inicio da cobranca, IMPORTANTE: sempre utilizar o mês seguinte */
	private Calendar mesFimVigencia; /* Fixo zeros 00000000 (8 zeros) */
	
	private String espacoBrancoDois = "  "; /* Espaco em branco tamanho 2*/
	private String espacoBrancoTreze = "             "; /* Espaco em branco tamanho 13*/
	private String espacoBrancoDez = "          "; /* Espaco em branco tamanho 10*/	
	
	private Integer complementoCNPJ; /* Máximo 2, com zeros a esquerda */
	private Integer numeroSequencialDoRegistro; /* Máximo 6*/
	
	private Integer numeroSequencialRegistro; /* evoluir de 1 em 1, a cada registro gerado no arquivo */
	
	private CPF_CPNJ cpfCnpj = CPF_CPNJ.CPF;
	
	public enum CPF_CPNJ {
		CPF, CNPJ
	}		
	
	public CPF_CPNJ getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(CPF_CPNJ cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	public void setNumeroSequencialRegistro(int numeroSequencialRegistro) {
		this.numeroSequencialRegistro = numeroSequencialRegistro;
	}

	public void setCoberturaOcorrencia(Integer coberturaOcorrencia) {
		this.coberturaOcorrencia = coberturaOcorrencia;
	}	
	
	public int getTipoRegistro() {
		return tipoRegistro;
	}	
	
	public String getCodigoContaGerencial() {
		return codigoContaGerencial;
	}
	
	public Integer getValorLancamento() {
		return valorLancamento;
	}
	
	public void setValorLancamento(Integer valorLancamento) {
		this.valorLancamento = valorLancamento;
	}
	
	public Integer getDataGeracaoRegistro() {
		return dataGeracaoRegistro;
	}
	
	public void setDataGeracaoRegistro(Integer dataGeracaoRegistro) {
		this.dataGeracaoRegistro = dataGeracaoRegistro;
	}
	
	public String getComandoMovimento() {
		return comandoMovimento;
	}
	
	public void setComandoMovimento(String comandoMovimento) {
		this.comandoMovimento = comandoMovimento;
	}
	
	public int getCoberturaOcorrencia() {
		return coberturaOcorrencia;
	}
	
	public void setCoberturaOcorrencia(int coberturaOcorrencia) {
		this.coberturaOcorrencia = coberturaOcorrencia;
	}
	
	public BigInteger getDescricaoCoberturaOcorrencia() {
		return descricaoCoberturaOcorrencia;
	}
	
	public void setDescricaoCoberturaOcorrencia(BigInteger descricaoCoberturaOcorrencia) {
		this.descricaoCoberturaOcorrencia = descricaoCoberturaOcorrencia;
	}

	public long getCpfCliente() {
		return cpfCliente;
	}
	
	public void setCpfCliente(Long cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	public long getCnpjCliente() {
		return cnpjCliente;
	}
	
	public void setCnpjCliente(Long cnpjCliente) {
		this.cnpjCliente = cnpjCliente;
	}
	
	public int getComplementoCNPJ() {
		return complementoCNPJ;
	}
	
	public void setComplementoCNPJ(Integer complementoCNPJ) {
		this.complementoCNPJ = complementoCNPJ;
	}
	
	public Calendar getMesVigencia() {
		return mesVigencia;
	}
	
	public void setMesVigencia(Calendar mesVigencia) {
		this.mesVigencia = mesVigencia;
	}
	
	public Calendar getMesFimVigencia() {
		return mesFimVigencia;
	}
	
	public void setMesFimVigencia(Calendar mesFimVigencia) {
		this.mesFimVigencia = mesFimVigencia;
	}
	
	public int getNumeroSequencialRegistro() {
		return numeroSequencialRegistro;
	}
	
	public void setNumeroSequencialRegistro(Integer numeroSequencialRegistro) {
		this.numeroSequencialRegistro = numeroSequencialRegistro;
	}
	
	public Long getCodigoUnidadeConsumidora() {
		return codigoUnidadeConsumidora;
	}

	public void setCodigoUnidadeConsumidora(Long codigoUnidadeConsumidora) {
		this.codigoUnidadeConsumidora = codigoUnidadeConsumidora;
	}
	
	public String toString() {
		return "Detail_conveniado [tipoRegistro=" + tipoRegistro + ", codUnidadeConsumidora=" + "codUnidadeConsumidora"
				+ ", valorLancamento=" + valorLancamento + ", dataGeracaoRegistro=" + dataGeracaoRegistro
				+ ", comandoMovimento=" + comandoMovimento + ", codContaGerencial=" + codigoContaGerencial
				+ ", coberturaOcorrencia=" + coberturaOcorrencia + ", descricaoCoberturaOcorrencia="
				+ descricaoCoberturaOcorrencia + ", cpfCliente=" + cpfCliente + ", cnpjCliente=" + cnpjCliente
				+ ", mesVigencia=" + mesVigencia + ", mesFimVigencia=" + mesFimVigencia + ", complementoCNPJ="
				+ complementoCNPJ + ", identificacaoClienteConveniado=" + numeroSequencialDoRegistro
				+ ", espacoBrancoDois=" + espacoBrancoDois + ", espacoBrancoTreze=" + espacoBrancoTreze
				+ ", espacoBrancoDez=" + espacoBrancoDez + ", numeroSequencialRegistro=" + numeroSequencialRegistro
				+ "]";
	}

}
