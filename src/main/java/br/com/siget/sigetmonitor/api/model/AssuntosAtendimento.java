package br.com.siget.sigetmonitor.api.model;

import java.io.Serializable;
import java.util.Date;

public class AssuntosAtendimento implements Serializable{
	
	/**
	 * Serializable fixo
	 */
	private static final long serialVersionUID = 6994400048349992982L;
	
	
	/**
	 * assunto de atendimento escolhido do usuário
	 */
	private int iAssuntosEscolhido = 0;
	
	private String dsAssuntosAtendimento;
	
	private Date dtInclusao;
	
	private int iTempoResolucao;
	
	private ITiposEnumerados.SITUACAO icAtivo;
	
	private int totalRegistros;
	
	public AssuntosAtendimento(){
	}

	public int getiAssuntosEscolhido() {
		return iAssuntosEscolhido;
	}

	public void setiAssuntosEscolhido(int iAssuntosEscolhido) {
		this.iAssuntosEscolhido = iAssuntosEscolhido;
	}

	public String getDsAssuntosAtendimento() {
		return dsAssuntosAtendimento;
	}

	public void setDsAssuntosAtendimento(String dsAssuntosAtendimento) {
		this.dsAssuntosAtendimento = dsAssuntosAtendimento;
	}

	public Date getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public int getiTempoResolucao() {
		return iTempoResolucao;
	}

	public void setiTempoResolucao(int iTempoResolucao) {
		this.iTempoResolucao = iTempoResolucao;
	}

	public ITiposEnumerados.SITUACAO getIcAtivo() {
		return icAtivo;
	}

	public void setIcAtivo(ITiposEnumerados.SITUACAO icAtivo) {
		this.icAtivo = icAtivo;
	}

	public int getTotalRegistros() {
		return totalRegistros;
	}

	public void setTotalRegistros(int totalRegistros) {
		this.totalRegistros = totalRegistros;
	}
	
	
	

}
