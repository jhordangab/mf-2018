package br.ufg.inf.mf.pratica.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DadoDemograficoDTO extends MainDTO {

	@XmlElement
	private String individuo;
	
	@XmlElement
	private Date nascimento;
	
	@XmlElement
	private String nascimentoAcuracia;
	
	@XmlElement
	private String nascimentoSeguimento;
	
	@XmlElement
	private int nascimentoPluralidade;
	
	@XmlElement
	private int nascimentoOrdem;
	
	@XmlElement
	private Date obito;
	
	@XmlElement
	private String obitoAcuracia;
	
	@XmlElement
	private int obitoFonte;
	
	@XmlElement
	private int sexo;
	
	@XmlElement
	private String mae;
	
	@XmlElement
	private String pai;
	
	@XmlElement
	private int situacaoFamiliar;
	
	@XmlElement
	private int raca;
	
	@XmlElement
	private String comentario;
	
	@XmlElement
	private int nacionalidade;
	
	@XmlElement
	private int municipio;
	
	@XmlElement
	private String estado;
	
	@XmlElement
	private int pais;
	
	@XmlElement
	private Date dataEntradaPais;

	public DadoDemograficoDTO(String individuo, Date nascimento, String nascimentoAcuracia, String nascimentoSeguimento,
			int nascimentoPluralidade, int nascimentoOrdem, Date obito, String obitoAcuracia, int obitoFonte, int sexo,
			String mae, String pai, int situacaoFamiliar, int raca, String comentario, int nacionalidade, int municipio,
			String estado, int pais, Date dataEntradaPais) {
		super();
		this.individuo = individuo;
		this.nascimento = nascimento;
		this.nascimentoAcuracia = nascimentoAcuracia;
		this.nascimentoSeguimento = nascimentoSeguimento;
		this.nascimentoPluralidade = nascimentoPluralidade;
		this.nascimentoOrdem = nascimentoOrdem;
		this.obito = obito;
		this.obitoAcuracia = obitoAcuracia;
		this.obitoFonte = obitoFonte;
		this.sexo = sexo;
		this.mae = mae;
		this.pai = pai;
		this.situacaoFamiliar = situacaoFamiliar;
		this.raca = raca;
		this.comentario = comentario;
		this.nacionalidade = nacionalidade;
		this.municipio = municipio;
		this.estado = estado;
		this.pais = pais;
		this.dataEntradaPais = dataEntradaPais;
	}

	public DadoDemograficoDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getIndividuo() {
		return individuo;
	}

	public void setIndividuo(String individuo) {
		this.individuo = individuo;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getNascimentoAcuracia() {
		return nascimentoAcuracia;
	}

	public void setNascimentoAcuracia(String nascimentoAcuracia) {
		this.nascimentoAcuracia = nascimentoAcuracia;
	}

	public String getNascimentoSeguimento() {
		return nascimentoSeguimento;
	}

	public void setNascimentoSeguimento(String nascimentoSeguimento) {
		this.nascimentoSeguimento = nascimentoSeguimento;
	}

	public int getNascimentoPluralidade() {
		return nascimentoPluralidade;
	}

	public void setNascimentoPluralidade(int nascimentoPluralidade) {
		this.nascimentoPluralidade = nascimentoPluralidade;
	}

	public int getNascimentoOrdem() {
		return nascimentoOrdem;
	}

	public void setNascimentoOrdem(int nascimentoOrdem) {
		this.nascimentoOrdem = nascimentoOrdem;
	}

	public Date getObito() {
		return obito;
	}

	public void setObito(Date obito) {
		this.obito = obito;
	}

	public String getObitoAcuracia() {
		return obitoAcuracia;
	}

	public void setObitoAcuracia(String obitoAcuracia) {
		this.obitoAcuracia = obitoAcuracia;
	}

	public int getObitoFonte() {
		return obitoFonte;
	}

	public void setObitoFonte(int obitoFonte) {
		this.obitoFonte = obitoFonte;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public int getSituacaoFamiliar() {
		return situacaoFamiliar;
	}

	public void setSituacaoFamiliar(int situacaoFamiliar) {
		this.situacaoFamiliar = situacaoFamiliar;
	}

	public int getRaca() {
		return raca;
	}

	public void setRaca(int raca) {
		this.raca = raca;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(int nacionalidade) {
		this.nacionalidade = nacionalidade;
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

	public int getPais() {
		return pais;
	}

	public void setPais(int pais) {
		this.pais = pais;
	}

	public Date getDataEntradaPais() {
		return dataEntradaPais;
	}

	public void setDataEntradaPais(Date dataEntradaPais) {
		this.dataEntradaPais = dataEntradaPais;
	}
	
}