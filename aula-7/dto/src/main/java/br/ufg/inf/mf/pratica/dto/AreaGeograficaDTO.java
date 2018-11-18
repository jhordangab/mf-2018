package br.ufg.inf.mf.pratica.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AreaGeograficaDTO extends MainDTO {

	@XmlElement
	private int codigo;
	
	@XmlElement
	private String alternativo;

	@XmlElement
	private String descricao;

	public AreaGeograficaDTO(int codigo, String alternativo, String descricao) {
		super();
		this.codigo = codigo;
		this.alternativo = alternativo;
		this.descricao = descricao;
	}
	
	public AreaGeograficaDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAlternativo() {
		return alternativo;
	}

	public void setAlternativo(String alternativo) {
		this.alternativo = alternativo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
