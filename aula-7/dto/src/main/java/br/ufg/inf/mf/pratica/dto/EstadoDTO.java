package br.ufg.inf.mf.pratica.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EstadoDTO extends MainDTO {

	@XmlElement
	private String codigo;
	
	@XmlElement
	private String nome;

	public EstadoDTO(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public EstadoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}