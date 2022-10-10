package model;

import java.sql.Date;
import java.util.Calendar;

public class Header {
	
	private Integer identificacaoRegistro = Integer.valueOf(1);
	private String contrato = "01000000002022908203774000AC1";
	private Integer codConcessionaria = Integer.valueOf(0001);
	private Calendar dataEnvio;
	private String siglaMoeda = "R$";
	private Integer numeroSequencialEnvio;
	private Integer motivosRecusa;
	private String nomeClienteContratante = "ASSOCIACAO CULTURAL";
	private String espacoBrancoQuarenta = "                                        "; /* espaco em branco tamanho 40 */
	private Integer tipoArquivo;
	private Integer numeroSequencialRegistro = Integer.valueOf(000001);	
	

	public Integer getIdentificacaoRegistro() {
		return identificacaoRegistro;
	}

	public void setIdentificacaoRegistro(Integer identificacaoRegistro) {
		this.identificacaoRegistro = identificacaoRegistro;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public Integer getCodConcessionaria() {
		return codConcessionaria;
	}

	public void setCodConcessionaria(Integer codConcessionaria) {
		this.codConcessionaria = codConcessionaria;
	}

	public Calendar getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Calendar dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public String getSiglaMoeda() {
		return siglaMoeda;
	}

	public void setSiglaMoeda(String siglaMoeda) {
		this.siglaMoeda = siglaMoeda;
	}

	public Integer getNumeroSequencialEnvio() {
		return numeroSequencialEnvio;
	}

	public void setNumeroSequencialEnvio(Integer numeroSequencialEnvio) {
		this.numeroSequencialEnvio = numeroSequencialEnvio;
	}

	public Integer getMotivosRecusa() {
		return motivosRecusa;
	}

	public void setMotivosRecusa(Integer motivosRecusa) {
		this.motivosRecusa = motivosRecusa;
	}

	public Integer getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(Integer tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}

	public Integer getNumeroSequencialRegistro() {
		return numeroSequencialRegistro;
	}

	public void setNumeroSequencialRegistro(Integer numeroSequencialRegistro) {
		this.numeroSequencialRegistro = numeroSequencialRegistro;
	}

	public String getNomeClienteContratante() {
		return nomeClienteContratante;
	}

	public void setNomeClienteContratante(String nomeClienteContratante) {
		this.nomeClienteContratante = nomeClienteContratante;
	}

}
