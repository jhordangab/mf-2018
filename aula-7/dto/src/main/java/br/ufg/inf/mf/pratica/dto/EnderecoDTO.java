package br.ufg.inf.mf.pratica.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EnderecoDTO extends MainDTO {

	@XmlElement
	private String id;

	@XmlElement
	private String individuo;

	@XmlElement
	private String bairro;

	@XmlElement
	private String distrito;

	@XmlElement
	private int municipio;

	@XmlElement
	private String estado;

	@XmlElement
	private String cep;

	@XmlElement
	private String caixaPostal;

	@XmlElement
	private int pais;

	@XmlElement
	private int tipo;

	@XmlElement
	private Date dataInicial;

	@XmlElement
	private Date dataInicialAcuracia;

	@XmlElement
	private Date dataFinal;

	@XmlElement
	private Date dataFinalAcuracia;

	public EnderecoDTO(String id, String individuo, String bairro, String distrito, int municipio, String estado,
			String cep, String caixaPostal, int pais, int tipo, Date dataInicial, Date dataInicialAcuracia,
			Date dataFinal, Date dataFinalAcuracia) {
		super();
		this.id = id;
		this.individuo = individuo;
		this.bairro = bairro;
		this.distrito = distrito;
		this.municipio = municipio;
		this.estado = estado;
		this.cep = cep;
		this.caixaPostal = caixaPostal;
		this.pais = pais;
		this.tipo = tipo;
		this.dataInicial = dataInicial;
		this.dataInicialAcuracia = dataInicialAcuracia;
		this.dataFinal = dataFinal;
		this.dataFinalAcuracia = dataFinalAcuracia;
	}

	public EnderecoDTO() {
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

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public int getMunicipio() {
		return municipio;
	}

	public void setMunicipio(int municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCaixaPostal() {
		return caixaPostal;
	}

	public void setCaixaPostal(String caixaPostal) {
		this.caixaPostal = caixaPostal;
	}

	public int getPais() {
		return pais;
	}

	public void setPais(int pais) {
		this.pais = pais;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataInicialAcuracia() {
		return dataInicialAcuracia;
	}

	public void setDataInicialAcuracia(Date dataInicialAcuracia) {
		this.dataInicialAcuracia = dataInicialAcuracia;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Date getDataFinalAcuracia() {
		return dataFinalAcuracia;
	}

	public void setDataFinalAcuracia(Date dataFinalAcuracia) {
		this.dataFinalAcuracia = dataFinalAcuracia;
	}
}
