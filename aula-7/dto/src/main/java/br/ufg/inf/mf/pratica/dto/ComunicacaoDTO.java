package br.ufg.inf.mf.pratica.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ComunicacaoDTO extends MainDTO {

	@XmlElement
	private String individuo;
	
	@XmlElement
	private int meio;

	@XmlElement
	private String preferencia;
	
	@XmlElement
	private String detalhe;
	
	@XmlElement
	private int uso;

	public ComunicacaoDTO(String individuo, int meio, String preferencia, String detalhe, int uso) {
		super();
		this.individuo = individuo;
		this.meio = meio;
		this.preferencia = preferencia;
		this.detalhe = detalhe;
		this.uso = uso;
	}
	
	public ComunicacaoDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getIndividuo() {
		return individuo;
	}

	public void setIndividuo(String individuo) {
		this.individuo = individuo;
	}

	public int getMeio() {
		return meio;
	}

	public void setMeio(int meio) {
		this.meio = meio;
	}

	public String getPreferencia() {
		return preferencia;
	}

	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}

	public int getUso() {
		return uso;
	}

	public void setUso(int uso) {
		this.uso = uso;
	}
}
