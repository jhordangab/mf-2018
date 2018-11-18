package br.ufg.inf.mf.pratica.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class IdentificadorDTO extends MainDTO {

	@XmlElement
	private String id;

	@XmlElement
	private String individuo;
	
	@XmlElement
	private String designacao;
	
	@XmlElement
	private int area;

	@XmlElement
	private String emissor;
	
	@XmlElement
	private Date data;
	
	@XmlElement
	private String tipo;

	public IdentificadorDTO(String id, String individuo, String designacao, int area, String emissor, Date data,
			String tipo) {
		super();
		this.id = id;
		this.individuo = individuo;
		this.designacao = designacao;
		this.area = area;
		this.emissor = emissor;
		this.data = data;
		this.tipo = tipo;
	}

	public IdentificadorDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIndividuo() {
		return individuo;
	}

	public void setIndividuo(String individuo) {
		this.individuo = individuo;
	}

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
