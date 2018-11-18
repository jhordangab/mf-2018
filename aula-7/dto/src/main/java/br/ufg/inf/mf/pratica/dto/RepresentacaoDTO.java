package br.ufg.inf.mf.pratica.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RepresentacaoDTO extends MainDTO {

	@XmlElement
	private String nome;
	
	@XmlElement
	private String utilizacao;
	
	@XmlElement
	private String alternativa;

	public RepresentacaoDTO(String nome, String utilizacao, String alternativa) {
		super();
		this.nome = nome;
		this.utilizacao = utilizacao;
		this.alternativa = alternativa;
	}

	public RepresentacaoDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUtilizacao() {
		return utilizacao;
	}

	public void setUtilizacao(String utilizacao) {
		this.utilizacao = utilizacao;
	}

	public String getAlternativa() {
		return alternativa;
	}

	public void setAlternativa(String alternativa) {
		this.alternativa = alternativa;
	}
	
}