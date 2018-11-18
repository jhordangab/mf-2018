package br.ufg.inf.mf.pratica.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MunicipioDTO extends MainDTO {

	@XmlElement
	private String codigo;
	
	@XmlElement
	private String estado;
	
	@XmlElement
	private String municipio;

	public MunicipioDTO(String codigo, String estado, String municipio) {
		super();
		this.codigo = codigo;
		this.estado = estado;
		this.municipio = municipio;
	}

	public MunicipioDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
}
