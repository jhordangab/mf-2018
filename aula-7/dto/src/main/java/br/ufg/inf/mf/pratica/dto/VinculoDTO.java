package br.ufg.inf.mf.pratica.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VinculoDTO extends MainDTO {

	@XmlElement
	private String identificador;
	
	@XmlElement
	private String individuo;

	@XmlElement
	private int relacionamento;
	
	public VinculoDTO(String identificador, String individuo, int relacionamento, Date dataInicio, Date dataFinal) {
		super();
		this.identificador = identificador;
		this.individuo = individuo;
		this.relacionamento = relacionamento;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
	}

	public VinculoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getIndividuo() {
		return individuo;
	}

	public void setIndividuo(String individuo) {
		this.individuo = individuo;
	}

	public int getRelacionamento() {
		return relacionamento;
	}

	public void setRelacionamento(int relacionamento) {
		this.relacionamento = relacionamento;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	@XmlElement
	private Date dataInicio;
	
	@XmlElement
	private Date dataFinal;
}