package br.ufg.inf.mf.pratica.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NomeDTO extends MainDTO {

	@XmlElement
	private String id;

	@XmlElement
	private String individuo;

	@XmlElement
	private String titulos;

	@XmlElement
	private String nomes;

	@XmlElement
	private String sobrenomes;

	@XmlElement
	private String sufixos;

	@XmlElement
	private int preferido;

	@XmlElement
	private int usoCondicional;

	public NomeDTO(String id, String individuo, String titulos, String nomes, String sobrenomes, String sufixos,
			int preferido, int usoCondicional) {
		super();
		this.id = id;
		this.individuo = individuo;
		this.titulos = titulos;
		this.nomes = nomes;
		this.sobrenomes = sobrenomes;
		this.sufixos = sufixos;
		this.preferido = preferido;
		this.usoCondicional = usoCondicional;
	}

	public NomeDTO() {
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

	public String getTitulos() {
		return titulos;
	}

	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}

	public String getNomes() {
		return nomes;
	}

	public void setNomes(String nomes) {
		this.nomes = nomes;
	}

	public String getSobrenomes() {
		return sobrenomes;
	}

	public void setSobrenomes(String sobrenomes) {
		this.sobrenomes = sobrenomes;
	}

	public String getSufixos() {
		return sufixos;
	}

	public void setSufixos(String sufixos) {
		this.sufixos = sufixos;
	}

	public int getPreferido() {
		return preferido;
	}

	public void setPreferido(int preferido) {
		this.preferido = preferido;
	}

	public int getUsoCondicional() {
		return usoCondicional;
	}

	public void setUsoCondicional(int usoCondicional) {
		this.usoCondicional = usoCondicional;
	}
}
