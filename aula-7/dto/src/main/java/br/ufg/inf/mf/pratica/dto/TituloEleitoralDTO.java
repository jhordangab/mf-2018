package br.ufg.inf.mf.pratica.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TituloEleitoralDTO extends MainDTO {

	@XmlElement
	private String identificador;
	
	@XmlElement
	private int zona;
	
	@XmlElement
	private int sessao;
	
	public TituloEleitoralDTO(String identificador, int zona, int sessao) {
		super();
		this.identificador = identificador;
		this.zona = zona;
		this.sessao = sessao;
	}

	public TituloEleitoralDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public int getSessao() {
		return sessao;
	}

	public void setSessao(int sessao) {
		this.sessao = sessao;
	}
}
