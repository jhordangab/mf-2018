package br.ufg.inf.mf.pratica.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CtpsDTO extends MainDTO {

	@XmlElement
	private String identificador;
	
	@XmlElement
	private int serie;

	@XmlElement
	private String estado;

	public CtpsDTO(String identificador, int serie, String estado) {
		super();
		this.identificador = identificador;
		this.serie = serie;
		this.estado = estado;
	}

	public CtpsDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}