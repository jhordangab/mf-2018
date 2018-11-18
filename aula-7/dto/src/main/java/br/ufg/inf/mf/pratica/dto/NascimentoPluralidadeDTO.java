package br.ufg.inf.mf.pratica.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NascimentoPluralidadeDTO extends MainDTO {

	@XmlElement
	private int codigo;
	
	@XmlElement
	private String descricao;

	public NascimentoPluralidadeDTO(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public NascimentoPluralidadeDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}