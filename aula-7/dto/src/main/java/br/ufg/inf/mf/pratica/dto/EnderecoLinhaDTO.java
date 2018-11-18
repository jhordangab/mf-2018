package br.ufg.inf.mf.pratica.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EnderecoLinhaDTO extends MainDTO {

	@XmlElement
	private String endereco;

	@XmlElement
	private String linha;
	
	@XmlElement
	private int ordem;

	public EnderecoLinhaDTO(String endereco, String linha, int ordem) {
		super();
		this.endereco = endereco;
		this.linha = linha;
		this.ordem = ordem;
	}

	public EnderecoLinhaDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
}